package ioc;

public class Car {
	Engine en=new Engine();
	
	public void start() {
		en.run();
	}
}
