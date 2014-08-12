package com.mongodb.field;

public interface iField {
	public static String iCustomer_id = "_id";
	public static String iCustomer_address = "address";
	public static String iCustomer_name = "name";
	public static String iCustomer_phone = "phone";
	public static String iCustomer_email = "email";

	public static String iOrder_id = "_id";

	public static String iOrder_customerID = "customerID";
	public static String iOrder_cost = "cost";
	public static String iOrder_shirt = "shirt";

	public static String iOrder_shirt_logo = "logo";
	public static String iOrder_shirt_logo_path = "path";
	public static String iOrder_shirt_logo_local = "local";
	public static String iOrder_shirt_text_local = "local";
	public static String iOrder_shirt_text_content = "content";
}
