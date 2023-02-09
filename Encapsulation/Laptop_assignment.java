package Encapsulation;

public class Laptop_assignment {
//	1Create Class Laptop which has variables noOfUSBPort, processorSpeed of
//	type int. Create getter, setter methods for the variables. In main method,
//	1> create Laptop object 
//	2> set values of variables noOfUSBPort,
//	processorSpeed using setter methods.
//	3> print variables noOfUSBPort,
//	processorSpeed using getter methods.

	private int noofUSBPort;
	private int processorSpeed;
	
	
	void setnoofUSBPort(int port) {
		noofUSBPort=port;
	}
	int getnoofUSBPort(){
		return noofUSBPort;
	}
	
	void setprocessorSpeed(int speed) {
		processorSpeed=speed;
	}
	int getprocessorSpeed() {
		return processorSpeed;
	}
}
