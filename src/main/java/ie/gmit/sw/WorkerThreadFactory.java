package ie.gmit.sw;

import java.util.concurrent.ThreadFactory;

// A thread factory to ensure consistency among workers
public class WorkerThreadFactory implements ThreadFactory {
	   private int counter = 0;
	   private String prefix = "";
	   
	   public WorkerThreadFactory() {
	   }

	   public void setPrefix(String prefix) {
		this.prefix = prefix;
	   }

	   public Thread newThread(Runnable r) {
	     return new Thread(r, prefix + "-" + counter++);
	   }
	   
}