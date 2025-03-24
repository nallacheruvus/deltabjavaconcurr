package co.sa.cl;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueProducer implements Runnable {
	protected BlockingQueue<String> bQueue;
	public BlockingQueueProducer(BlockingQueue<String> b) {
		this.bQueue=b;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			bQueue.add("Nuclear Physics");
			Thread.sleep(3000);
			bQueue.add("Geo Physics");
			Thread.sleep(3000);
			bQueue.add("Nano Physics");
			Thread.sleep(3000);
			bQueue.add("Semiconductor Physics");
			Thread.sleep(3000);
			bQueue.add("Satellite Remote Sensing Physics");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
