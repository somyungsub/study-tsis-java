package designpattern.command;

public class StereoOffWithCDCommand implements Command{
	Stereo stereo;
	
	public StereoOffWithCDCommand(Stereo stereo){
		this.stereo = stereo;
	}
	
	public void execute(){
		stereo.off();
	}
	
	public void undo(){
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

}
