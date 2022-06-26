package com.rutvik.training.ef;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceutorDemo {

	public static void main(String[] args) {
		CheckProcessorTask[] cp = { new CheckProcessorTask("ATM"), new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Mobile"), new CheckProcessorTask("Web") };
		ExecutorService es = Executors.newFixedThreadPool(2);      //newfixedThreadpool will only create 2 thread thats why it is fixed
		for (CheckProcessorTask checkProcessorTask : cp) {			//itrate over an arry
			es.submit(checkProcessorTask);
		}
		es.shutdown();
	}

}
