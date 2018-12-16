package com.naveen.programs;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Message {
	private String message;

	public Message(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

class Producer implements Runnable {
	private BlockingQueue<Message> producerQue;

	public Producer(BlockingQueue<Message> producerQue) {
		super();
		this.producerQue = producerQue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Message message = new Message(":" + i);
			try {
				Thread.sleep(i);
				producerQue.put(message);
				System.out.println("Produced " + message.getMessage());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable {
	private BlockingQueue<Message> consumerQue;

	public Consumer(BlockingQueue<Message> consumerQue) {
		super();
		this.consumerQue = consumerQue;
	}

	@Override
	public void run() {
		try {
			String message;

			for (int i = 0; i < 10; i++) {
				message = consumerQue.take().getMessage();
				Thread.sleep(10);
				System.out.println("Consumed " + message);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		// starting producer to produce messages in queue
		new Thread(producer).start();
		// starting consumer to consume messages from queue
		new Thread(consumer).start();
		System.out.println("Producer and Consumer has been started");

	}

}
