package designpattern.command;

public class Stereo {
	private int volume;
	private String name;
	
	public Stereo(String name){
		this.name = name;
	}
	
	public void on(){
		System.out.println(name+" 라디오 켬");
	}
	public void off(){
		System.out.println(name+" 라디오 끔");
	}
	public void setCd(){
		System.out.println(name+" 씨디 설정");
	}
	public void setVolume(int volume){
		this.volume = volume;
		System.out.println(name+" 볼륨 설정 - 볼륨 "+volume);
	}
}
