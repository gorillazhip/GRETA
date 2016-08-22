package transaction;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import event.*;
import iogenerator.*;

public abstract class Transaction implements Runnable {
	
	ArrayList<StockEvent> batch;		
	OutputFileGenerator output;
	public CountDownLatch transaction_number;	
	AtomicLong total_cpu;
	AtomicInteger total_mem;
	
	public Transaction (ArrayList<StockEvent> b, OutputFileGenerator o, CountDownLatch tn, AtomicLong time, AtomicInteger mem) {		
		batch = b;			
		output = o; 
		transaction_number = tn;
		total_cpu = time;
		total_mem = mem;
	}	
}
