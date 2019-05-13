package designpattern.command;

public class LightOnCommand implements Command{

	Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}
	
}
