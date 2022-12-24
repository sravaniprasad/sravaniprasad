package ConcHashMap;

import java.util.Map;

public class Example2 implements Runnable{

	Map<String, Integer> map;

	public Example2(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "Example1").start();
	}

	public void run() {
		map.put("Sravanthi", 2);
		map.put("lalli", 5);
		try {
			System.out.println("----2----- sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
