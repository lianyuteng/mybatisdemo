package com.xing.model2;

public class Mobile {
	private int id;
	private int tel;
	//���һ�������� ����mobile���� �� һ��person
	private Person person;//һ  
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
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
