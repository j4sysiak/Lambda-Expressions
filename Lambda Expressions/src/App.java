interface Executable {
	void check();
	void execute();
}

class Runner {
	
	public void run(Executable e){
		System.out.println("Executing code block ...");
		e.check();
		e.execute();
	}
}

public class App {

	public static void main(String[] args) {

		//Runner runner = new Runner();
		Runner2 runner2 = new Runner2();
		
		System.out.println("=================depricated (java 1.6 - 1.7)=======================");
		
		runner2.run(new Executable2() {
			
			@Override
			public void execute() {
				System.out.println("execute: Hello there.");
				
			}

			@Override
			public void check() {
				System.out.println("check: Hello there.");
			}

			@Override
			public void stop() {
				System.out.println("stop: Hello there.");
				
			}

		}
		);
		
		//System.out.println("==================Lambda (java 1.8)======================");
		
		//runner.run( () -> System.out.println("Lambda expression") );
		//runner2.run( () -> System.out.println("Lambda2 expression") );

	}

}
