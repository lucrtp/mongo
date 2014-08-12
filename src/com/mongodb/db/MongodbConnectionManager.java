package com.mongodb.db;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

public class MongodbConnectionManager {
	private static Mongo mongo;

	public static DB getDB(String dbName) {
		if (mongo == null) {
			initiazeMongo();
		}
		if (mongo != null) {
			DB db = mongo.getDB(dbName);
			return db;
		}
		return null;
	}

	private static boolean initiazeMongo() {
		MongodbConfigure mongodbConfigure = MongodbConfigure.getInstance();
		if (mongodbConfigure == null) {
			return false;
		}
		try {
			mongo = new Mongo(DBConst.mAddress, Integer.parseInt(DBConst.mPort));
		} catch (NumberFormatException | UnknownHostException e) {
			e.printStackTrace();
		}
		return true;
	}

	public static DBCollection getDbCollection(String dbName,
			String strCollection) {
		if (mongo == null) {
			initiazeMongo();
		}
		if (mongo != null) {
			DB db = mongo.getDB(dbName);
			DBCollection collection = db.getCollection(strCollection);
			return collection;
		}
		return null;
	}

	public static DB getDefaultDB() {
		if (mongo == null) {
			initiazeMongo();
		}
		if (mongo != null) {
			DB db = mongo.getDB(DBConst.mDatabaseName);
			return db;
		}
		return null;
	}
}
