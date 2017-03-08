package com.xing.model3;

public class Mobile {
	private int id;
	private int tel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", tel=" + tel + "]";
	}
}
