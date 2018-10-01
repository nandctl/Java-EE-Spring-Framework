package ch07._09.concurrentCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ZooManagerBad {
	
	private Map<String, Object> foodData = new HashMap<String, Object>();

	public synchronized void put(String key, String value) {
		foodData.put(key, value);
	}

	public synchronized Object get(String key) {
		return foodData.get(key);
	}
}

class ZooManager {

	private Map<String, String> foodData = new ConcurrentHashMap<>();

	public void put(String key, String value) {
		foodData.put(key, value);
	}

	public String get(String key) {
		return foodData.get(key);
	}

}

public class Test01ConcurrentHashMap {

	public static void main(String[] args) {

		ZooManager manager = new ZooManager();
		manager.put("key1", "value1");
		manager.put("key1", "value1");
	}
}
