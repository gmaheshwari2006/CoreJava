package com.inheritence;

public class VechileProcess {
/*	public void startEngineProcess(Bike bike) {
		bike.startEngine();
	}

	public void startEngineProcess(Car car) {
		car.startEngine();
	}*/

	public void startEngineProcess(Vechile vechlle) {
		vechlle.startEngine();
	}
	
	public static void main(String a[]) {
		Vechile bike = new Bike();
		Vechile car = new Car();
		VechileProcess process = new VechileProcess();
		process.startEngineProcess(bike);
		process.startEngineProcess(car);
//		new Vechile();
//		new AbstractVechile();
	}
}
