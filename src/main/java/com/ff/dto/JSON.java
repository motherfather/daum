package com.ff.dto;

public class JSON {
	private String result;
	private String message;
	private Object data;
	
	public String getResult() {
		return result;
	}
	public String getMessage() {
		return message;
	}
	public Object getData() {
		return data;
	}
	
	public static JSON success(Object data) {
		return new JSON(true, data, null);
	}
	
	public static JSON error(String message) {
		return new JSON(false, null, message);
		
	}
	
	public JSON() {
	}
	
	public JSON(boolean isSuccess, Object data, String message) {
		result = isSuccess ? "success" : "fail";
		this.data = data;
		this.message = message;
	}
}
