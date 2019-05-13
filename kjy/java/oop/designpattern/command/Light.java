package designpattern.command;

public class Light {
	private String name;
	
	public Light(String name ){
		this.name = name;
	}
	public void on(){
		System.out.println(name+" 전등 켬");
	}
	
	public void off(){
		System.out.println(name+" 전등 끔");
	}

}
