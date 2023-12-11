package com.multi.thread.chapter8.section1.example6;

public class Userinfo implements Comparable<Userinfo> {
	private int id;
	private String username;

	public Userinfo(int id, String username) {
		super();
		this.id = id;
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int compareTo(Userinfo o) {
		if (this.getId() > o.getId()) {
			return 1;
		} else {
			return -1;
		}
	}
}
