package ConcHashMap;

import java.util.Map;

public class Example3 implements Runnable{

	Map<String, Integer> map;

	public Example3(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "Example1").start();
	}

	public void run() {
		map.put("Maggi", 7);
		map.put("sweety", 12);
		try {
			System.out.println("----3----- sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
