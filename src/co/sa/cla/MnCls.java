package co.sa.cla;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MnCls {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ConcurrentHashMap conMap=new ConcurrentHashMap();
		Integer[] arr1= {15,2222,13,14,11};
		String[] arr2= {"Physics","Chemistry","Mathematics","Ionics","Geo Physics"};
		for (int i = 0; i < arr2.length; i++) {
			conMap.put(arr1[i], arr2[i]);
		}
//		conMap.entrySet().iterator().forEachRemaining(n->{
//			conMap.put(1090, "Geo Synchronous Satellites");
//			System.out.println(n.toString());
//		});
		new Thread(new Runnable() {
			@SuppressWarnings({ "unchecked" })
			@Override
			public void run() {
				conMap.put(1090, "Geo Synchronous Satellites");
			}
		}).start();
		for(Object en:conMap.entrySet()) {
			System.out.println(en.toString());
		}
	}
}
