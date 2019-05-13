package desugnpattern.singleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	private static ChocolateBoiler uniqueInstance;
	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
	public static synchronized ChocolateBoiler getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	
	public void drain(){
		if(!isEmpty() && isBoiled()){
			System.out.println(this.toString()+"초콜렛 옮긴다.");
			empty=true;
		}
	}
	public void boil(){
		if(!isEmpty() && !isBoiled()){
			boiled=true;
			System.out.println(this.toString()+"초콜렛 끓는다.");
		}
	}
	public void fill(){
		if(isEmpty()){
			System.out.println(this.toString()+"초콜렛 채운다.");
			empty = false;
			boiled = false;
		}
	}
	
	public boolean isEmpty(){
		return empty;
	}
	public boolean isBoiled(){
		return boiled;
	}
	
	public static void main(String[] args){
		ChocolateBoiler cb = ChocolateBoiler.getInstance();
		
	}
}
