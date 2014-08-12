package com.mongodb.db;


public class MongodbConfigure implements DBConst {
	//private Mongo mongo = null;
	private static MongodbConfigure instance = null;

	public MongodbConfigure() {
	}

	public static MongodbConfigure getInstance() {
		if (instance == null) {
			instance = new MongodbConfigure();
			if (!instance.initConfig()) {
				return null;
			}
		}
		return instance;
	}

	// check value
	private boolean initConfig() {
		if (DBConst.mAddress.isEmpty()
				|| DBConst.mDatabaseName.trim().length() == 0)
			return false;
		if (DBConst.mDatabaseName.isEmpty()
				|| DBConst.mDatabaseName.trim().length() == 0)
			return false;
		
		return true;
	}
}
