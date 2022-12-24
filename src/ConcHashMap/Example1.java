package ConcHashMap;

import java.util.Map;

public class Example1 implements Runnable{

	Map<String, Integer> map;

	public Example1(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "Example1").start();
	}

	public void run() {
		map.put("Sravani", 1);
		try {
			System.out.println("-----1------ sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
