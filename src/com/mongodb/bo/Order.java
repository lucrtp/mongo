package com.mongodb.bo;

import java.util.ArrayList;

import org.bson.types.ObjectId;

public class Order {
	private double cost = 0;
	private ObjectId customerID = null;
	private ArrayList<Shirt> shirt = null;
	public Order(ObjectId objectId,double cost, ArrayList<Shirt> shirts) {
		this.cost = cost;
		this.customerID = objectId;
		this.shirt = new ArrayList<Shirt>(shirts);
	}
	public ArrayList<Shirt> getShirt() {
		return shirt;
	}

	public void setShirt(ArrayList<Shirt> shirt) {
		this.shirt = shirt;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public ObjectId getCustomerID() {
		return customerID;
	}

	public void setCustomerID(ObjectId customerID) {
		this.customerID = customerID;
	}

}
