package com.tellyouiam.collections.set;

public class Role {
	private int id;
	private String name;
	
	public Role() {}
	
	public Role(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) { //Nếu mà equals method không được override thì so sánh 2 object sẽ trả về false. Tương tự áp dụng với contains() method. E.x: set.contains();
		if (!(obj instanceof Role))
			return false;
		if (obj == this)
			return true;
		
		Role rhs = (Role) obj;
		
		if (this.name.equals(rhs.name))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
}
