package desugnpattern.singleton;

public class SingletonTest extends Thread{
	public static void main(String[] args){
		SingletonTest st = new SingletonTest();
		
		SingletonTest st1 = new SingletonTest();
		st.start();
		st1.start();
	}
	
	public SingletonTest(){
		
	}
	
	public void run(){
		//System.out.println("스레드시작");
		ChocolateBoiler cb = ChocolateBoiler.getInstance();
		cb.fill();
		cb.boil();
		cb.drain();
	}

}
