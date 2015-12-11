package g54ubi.chat.server;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class Runner {

	public static void main(String[] args) {

	    //String[] client1Commands = {"IDEN james", "HAIL Hello from client 1", "QUIT"}; // add more commands in here
	    //String[] client2Commands = {"IDEN tom", "LIST", "HAIL Hello from client 2", "QUIT"}; // add more commands in here
		
		String[] clientCommands = {"IDEN"}; 
		//String[] clientCommands = {"IDEN "}; 
		//String[] clientCommands = {"IDEN _"}; 
		//String[] clientCommands = {"IDEN 0"}; 
		//String[] clientCommands = {"IDEN 12"}; 
		//String[] clientCommands = {"IDEN 123"}; 
		//String[] clientCommands = {"IDEN 1234567890"}; 
		//String[] clientCommands = {"IDEN @"}; 
		//String[] clientCommands = {"IDEN !@#$%^&*()_+_)(*&^%$#@#$%^&*"}; 
		//String[] clientCommands = {"IDEN q"}; 
		//String[] clientCommands = {"IDEN Q"}; 
		//String[] clientCommands = {"IDEN qwertyuiop"}; 
		//String[] clientCommands = {"IDEN QWERTYUIOP"}; 
		//String[] clientCommands = {"IDEN abc_def"}; 
		//String[] clientCommands = {"MESG"}; 
		//String[] clientCommands = {"IDEN 1", "MESG"}; 
		//String[] clientCommands = {"IDEN 1", "MESG "};
		//String[] clientCommands = {"IDEN 1", "MESG Hello"};
		//String[] clientCommands = {"IDEN 1", "MESG Hello client"};
		//String[] clientCommands = {"IDEN 1", "MESG fywcetfqgwefigweiufhcwfhiucahfiuhweiu"};
		//String[] clientCommands = {"HAIL"};
		//String[] clientCommands = {"IDEN 1", "HAIL"}; 
		//String[] clientCommands = {"IDEN 1", "HAIL "}; 
		//String[] clientCommands = {"IDEN 1", "HAIL Hello"}; 
		//String[] clientCommands = {"IDEN 1", "HAIL Hello from client"};
		//String[] clientCommands = {"IDEN 1", "HAIL 246723:sadhsj"}; 
		//String[] clientCommands = {"IDEN 1", "HAIL afhjweiufweiug8374 3riowehr 93 223 rowe r23r9023wefk wef02uuf"}; 
		//String[] clientCommands = {"LIST"};
		//String[] clientCommands = {"IDEN 1", "LIST "}; 
		//String[] clientCommands = {"QUIT"};
		//String[] clientCommands = {"IDEN 1", "QUIT "}; 
		//String[] clientCommands = {"STAT"};
		//String[] clientCommands = {"IDEN 1", "STAT "}; 

		
		//String[] client1Commands = {"IDEN a", "HAIL Hello from client 1", "QUIT"}; 
	    //String[] client2Commands = {"IDEN b", "HAIL Hello from client 2", "QUIT"};
		//String[] client3Commands = {"IDEN c", "HAIL Hello from client 3", "QUIT"}; 
	    //String[] client4Commands = {"IDEN d", "HAIL Hello from client 4", "QUIT"}; 
		//String[] client5Commands = {"IDEN e", "HAIL Hello from client 5", "QUIT"}; 
	    //String[] client6Commands = {"IDEN f", "HAIL Hello from client 6", "QUIT"}; 
		//String[] client7Commands = {"IDEN g", "HAIL Hello from client 7", "STATUS", "QUIT"}; 
	    //String[] client8Commands = {"IDEN h", "HAIL Hello from client 8", "QUIT"}; 
		//String[] client9Commands = {"IDEN i", "HAIL Hello from client 9", "QUIT"}; 
	    //String[] client10Commands = {"IDEN j", "HAIL Hello from client 10", "QUIT"}; 
		
		//String[] client11Commands = {"IDEN k", "HAIL Hello from client 11", "QUIT"}; 
	    //String[] client12Commands = {"IDEN l", "HAIL Hello from client 12", "QUIT"}; 
		//String[] client13Commands = {"IDEN m", "HAIL Hello from client 13", "QUIT"}; 
	    //String[] client14Commands = {"IDEN n", "HAIL Hello from client 14", "QUIT"};
		//String[] client15Commands = {"IDEN o", "HAIL Hello from client 15", "QUIT"}; 
	    //String[] client16Commands = {"IDEN p", "HAIL Hello from client 16", "QUIT"}; 
		//String[] client17Commands = {"IDEN q", "HAIL Hello from client 17", "QUIT"}; 
	    //String[] client19Commands = {"IDEN r", "HAIL Hello from client 18", "QUIT"}; 
		//String[] client19Commands = {"IDEN s", "HAIL Hello from client 19", "QUIT"}; 
	    //String[] client20Commands = {"IDEN t", "HAIL Hello from client 10", "LIST" "QUIT"}; 
		
		
	    ExecutorService executor = Executors.newCachedThreadPool();
	    executor.execute(new StubClient(9000, "localhost", clientCommands, "client"));
	    //executor.execute(new StubClient(9000, "localhost", client1Commands, "client1"));
	    //executor.execute(new StubClient(9000, "localhost", client2Commands, "client2"));
	    //executor.execute(new StubClient(9000, "localhost", client3Commands, "client3"));
	    //executor.execute(new StubClient(9000, "localhost", client4Commands, "client4"));
	  	//executor.execute(new StubClient(9000, "localhost", client5Commands, "client5"));
	    //executor.execute(new StubClient(9000, "localhost", client6Commands, "client6"));
	    //executor.execute(new StubClient(9000, "localhost", client7Commands, "client7"));
	    //executor.execute(new StubClient(9000, "localhost", client8Commands, "client8"));
	  	//executor.execute(new StubClient(9000, "localhost", client9Commands, "client9"));
	    //executor.execute(new StubClient(9000, "localhost", client10Commands, "client10"));
	    
	    //executor.execute(new StubClient(9000, "localhost", client11Commands, "client11"));
	    //executor.execute(new StubClient(9000, "localhost", client12Commands, "client12"));
	    //executor.execute(new StubClient(9000, "localhost", client13Commands, "client13"));
	    //executor.execute(new StubClient(9000, "localhost", client14Commands, "client14"));
	  	//executor.execute(new StubClient(9000, "localhost", client15Commands, "client15"));
	    //executor.execute(new StubClient(9000, "localhost", client16Commands, "client16"));
	    //executor.execute(new StubClient(9000, "localhost", client17Commands, "client17"));
	    //executor.execute(new StubClient(9000, "localhost", client18Commands, "client18"));
	  	//executor.execute(new StubClient(9000, "localhost", client19Commands, "client19"));
	    //executor.execute(new StubClient(9000, "localhost", client20Commands, "client20"));
	    
	    try {
	      executor.awaitTermination(1, TimeUnit.MINUTES);
	    } catch(InterruptedException e){
	      e.printStackTrace();
	    }
    
  }

}