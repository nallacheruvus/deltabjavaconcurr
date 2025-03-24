package co.sa.cl;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MnCls {
	public static void main(String[] args) {
		BlockingQueue<String> bQ=new ArrayBlockingQueue<>(5);
		BlockingQueueProducer prod=new BlockingQueueProducer(bQ);
		BlockingQueueConsumer cons=new BlockingQueueConsumer(bQ);
		(new Thread(prod)).start();
		(new Thread(cons)).start();
	}
}
