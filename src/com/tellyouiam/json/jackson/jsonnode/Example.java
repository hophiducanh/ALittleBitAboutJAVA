package com.tellyouiam.json.jackson.jsonnode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.tellyouiam.json.jackson.jsonrootname.PersonalAddress;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Example {
	//https://mkyong.com/java/jackson-tree-model-example/
	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node1 = mapper.valueToTree(new PersonalAddress("HN", "VN"));
		System.out.println(node1.path("city").asText());
		
		JsonNode node2 = mapper.valueToTree(new PersonalAddress("New York", "USA"));
		ObjectNode merged = mapper.createObjectNode();
		merged.putObject("address");
		merged.setAll((ObjectNode) node1);
		merged.setAll((ObjectNode) node2);
//		System.out.println(merged.toString());
		
		String file = Objects.requireNonNull(Example.class.getClassLoader()
				.getResource("json/me.json"))
				.getFile();
		
		JsonNode root = mapper.readTree(new File(file));
		String resultOriginal = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println("Before Update " + resultOriginal);
		
		ObjectNode nameNode = (ObjectNode) root.path("user").path("name");
		nameNode.put("middle", "M");
		System.out.println(nameNode.toPrettyString());
		
		// ----------------------ARRAY NODE---------------------------------
		
		ArrayNode gamesNode = mapper.createArrayNode();
		
		ObjectNode game1 = mapper.createObjectNode().objectNode();
		game1.put("name", "Fall Out 4");
		game1.put("price", 49.9);
		
		ObjectNode game2 = mapper.createObjectNode().objectNode();
		game2.put("name", "Dark Soul 3");
		game2.put("price", 59.9);
		
		gamesNode.add(game1);
		gamesNode.add(game2);
		((ObjectNode) root).set("games", gamesNode);
		System.out.println(gamesNode.toPrettyString());
		
		// 7. Append a new Node to ArrayNode
		ObjectNode email = mapper.createObjectNode();
		email.put("type", "email");
		email.put("ref", "abc@mkyong.com");
		
//		JsonNode contactNode = root.path("contact");
//		((ArrayNode) contactNode).add(email);
		
		String resultUpdate = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		
		System.out.println("After Update " + resultUpdate);
	}
}
