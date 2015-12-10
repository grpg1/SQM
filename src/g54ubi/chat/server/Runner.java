package g54ubi.chat.server;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class Runner {

	public static void main(String[] args) {

	    String[] client1Commands = {"IDEN james", "HAIL Hello from client 1", "QUIT"}; // add more commands in here
	    String[] client2Commands = {"IDEN tom", "LIST", "HAIL Hello from client 2", "QUIT"}; // add more commands in here

	    ExecutorService executor = Executors.newCachedThreadPool();
	    executor.execute(new StubClient(9000, "localhost", client1Commands, "client1"));
	    executor.execute(new StubClient(9000, "localhost", client2Commands, "client2"));
	    try {
	      executor.awaitTermination(1, TimeUnit.MINUTES);
	    } catch(InterruptedException e){
	      e.printStackTrace();
	    }
    
  }

}