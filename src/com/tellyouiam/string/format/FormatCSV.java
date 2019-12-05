package com.tellyouiam.string.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author : Ho Anh
 * @since : 22/08/2019, Thu
 **/
public class FormatCSV {

	private static final String[] listAuStates = {"NSW", "QLD", "SA", "TAS", "VIC", "WA"};

	private static String swapColumns(final String value,
	                                  final String separator, final int swapColumn1, final int swapColumn2) {
		String[] splitValues = value.split(separator);
		String temp = splitValues[swapColumn1];
		splitValues[swapColumn1] = splitValues[swapColumn2];
		splitValues[swapColumn2] = temp;

		StringBuilder stringBuilder = new StringBuilder();

		boolean itemAdded = false;

		for (String splitValue : splitValues) {
			if (itemAdded) {
				stringBuilder.append(separator);
			}
			stringBuilder.append(splitValue);
			itemAdded = true;
		}

		return stringBuilder.toString();
	}

	private static String insertAndReplaceColumn(final String value, String separator, int replacedColumn, int column) {
		String[] splitValues = value.split(separator);
		List<String> lists = new ArrayList<String>(Arrays.asList(splitValues));
		lists.set(replacedColumn, lists.get(column));
		lists.remove(column);
		StringBuilder stringBuilder = new StringBuilder();

		boolean itemAdded = false;

		for (String splitValue : lists) {
			if (itemAdded) {
				stringBuilder.append(separator);
			}
			stringBuilder.append(splitValue);
			itemAdded = true;
		}

		return stringBuilder.toString();
	}

	public static void main(String[] args) throws ParseException {
		String text = ",5.00%,,,,,16/12/2017,,,,\"Williams, Alan\",,,,,,,,,,,,,          ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,arwilliams_53@yahoo.com,,,,,,,,,,,,,N\n" +
			"\n" +
			"\n" +
			"\n" +
			" Iron Craft \n" +
			"\n" +
			",10.00%,,,,,2/02/2018,,,,\"Ellison, Ben\",,,,,,,,,,,,,          ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,benjamin234@hotmail.com,,,,,,,,,,,,,N\n" +
			"\n";
		text.replaceAll("(?m)^\\s", "");
		System.out.println(text);

		int[] src = new int[]{1, 2, 3, 4, 5};
		int[] dest = new int[5];

		System.arraycopy(src, 0, dest, 0, src.length);
//		System.out.println(Arrays.toString(src));
//		String value = "6,255,00aecd,00ebcb00,0,0,28356,0,417,1\n";
//		System.out.println(value);
//		System.out.println(swapColumns(value, ",", 3,4));
//		System.out.println(insertAndReplaceColumn(value, ",", 0,3));
		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yy");
		Date date = format1.parse("05/01/1999");
		String dateF = format2.format(date);
//		System.out.println(dateF);


		String one = "Düsseldorf - Zentrum - Günnewig Uebachs";
		String last = one.substring(one.lastIndexOf('-') + 1);
		System.out.println("last: " + last);

		String addre = "64 Melaleuca Drive PALM BEACH QLD 4221";
		String[] splitAddresses = addre.trim().split(" ");
		for (String splitAddress : splitAddresses) {
			String auState = Arrays.stream(listAuStates).filter(l -> l.equalsIgnoreCase(splitAddress)).findFirst().orElse("");
			System.out.println(auState);
		}
		char[] data = {'a', 'b', 'c'};
		String str = new String(data);
		System.out.println(str);
		System.out.println("******************************************");
		String x = "haha";
		int y = 10;
		System.out.println(x.getClass());

		Instant instant = Instant.now();
		System.out.println(instant);
	}

}
