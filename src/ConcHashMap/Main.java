package ConcHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Map<String, Integer> hashMap = new HashMap<>();
//		Map<String, Integer> syncMap = Collections.synchronizedMap(hashMap);
//		
//		Example1 ex1 = new Example1(syncMap);
//		Example2 ex2 = new Example2(syncMap);
//		Example3 ex3 = new Example3(syncMap);
//		
//		for (Map.Entry<String, Integer> e : syncMap.entrySet()) {
//			System.out.println(e.getKey() + "=" + e.getValue());
//		}
//		
		Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();
		Example1 ex3 = new Example1(concurrentMap);
		Example2 ex4 = new Example2(concurrentMap);
      Example2 ex5 = new Example2(concurrentMap);		
		
		for (Map.Entry<String, Integer> e : concurrentMap.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
	}

}
