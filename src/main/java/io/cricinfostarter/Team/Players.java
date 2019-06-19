package io.cricinfostarter.Team;

public class Players {
	
	private String id;
	private String name;
	private String country;
	private int age;
	private String role;
	
	
	public Players() {
	
	}
	public Players(String id, String name, String country, int age, String role) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.age = age;
		this.role = role;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	


}
