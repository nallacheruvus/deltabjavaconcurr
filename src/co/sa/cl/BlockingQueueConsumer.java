package co.sa.cl;

import java.util.concurrent.BlockingQueue;

public class BlockingQueueConsumer implements Runnable {
	protected BlockingQueue<String> blockingQueue;
	public BlockingQueueConsumer(BlockingQueue<String> b) {
		this.blockingQueue=b;
	}
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			try {
				System.out.println(blockingQueue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
