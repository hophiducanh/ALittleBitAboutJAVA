package com.tellyouiam.enums;

public class GetValuesListEnum {
	
	public enum HorseReportType {
		
		PRE_RACE(1, "Pre race report"),
		
		TEXT_UPDATE(3, "Text update"),
		
		POST_RACE(2, "Post race report"),
		
		STABLE_UPDATE(4, "Stable update"),
		
		GROUP_UPDATE(5, "Group update");
		
		private int code;
		private String name;
		
		public int getCode() {
			return code;
		}
		
		public void setCode(int code) {
			this.code = code;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		private HorseReportType(int code, String name) {
			this.code = code;
			this.name = name;
		}
	}
	
	public enum Status {
		SUCCESSFUL,
		FAILED,
		CONFLICT,
		ERROR
	}
	
	//HorseReportType.values() return arrays/list of enum
	
	public static HorseReportType getTypeByCode(Integer code) {
		for (HorseReportType item : HorseReportType.values()) {
			
			if (code.equals(item.code)) {
				return item;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		HorseReportType type = getTypeByCode(3);
		System.out.println(type != null ? type.getName() : "");
//		HorseReportType code = HorseReportType.valueOf("Post race report");
		System.out.println(HorseReportType.TEXT_UPDATE.ordinal());
		System.out.println(HorseReportType.TEXT_UPDATE.name());
	}
}
