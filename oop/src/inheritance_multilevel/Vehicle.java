package inheritance_multilevel;
//used interface because in future Bike can be an implemented class
//bike has different type of starting (i.e) by kicker or self start
public abstract class Vehicle {
	int cost;
	String color;
	
	abstract public void start();
	abstract public void applyBreak();
}
