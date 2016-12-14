package com.ff.daum.vo;

public class GuestbookVo {
	private Long no;
	private String writer;
	private String password;
	private String content;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "GuestbookVo [no=" + no + ", writer=" + writer + ", password=" + password + ", content=" + content + "]";
	}
}
