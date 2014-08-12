package com.mongodb.bo;

import java.util.ArrayList;
import org.bson.types.ObjectId;

public class Customer {
	private ObjectId _id = null;
	private String address = null;
	private ArrayList<String> email = null;
	private ArrayList<String> phone = null;
	private String name = null;

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<String> getEmail() {
		return email;
	}

	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}

	public ArrayList<String> getPhone() {
		return phone;
	}

	public void setPhone(ArrayList<String> phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
