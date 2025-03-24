package co.sa.clsb;

import java.util.Iterator;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class DemoConcurr extends Thread {
	static CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();
	public static void main(String[] args) {
		try {
			list.add("East Brunswick Gang");
			list.add("Orange County Moon Shots");
			list.add("Gangs of New york");
			DemoConcurr con=new DemoConcurr();
			con.start();
			Thread.sleep(5000);
			Iterator<String> itr=list.iterator();
			while(itr.hasNext()) {
				list.add("Masons Gang");
				String j=(String)itr.next();
				System.out.println(j);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ConcurrentNavigableMap csMap=new ConcurrentSkipListMap<>();
		
	}
	@Override
	public void run() {
		list.add("Gargoyle Gang");
		list.add("Gringo Gang");
		list.add("Gang Of Dead Rabbits");
	}
}
