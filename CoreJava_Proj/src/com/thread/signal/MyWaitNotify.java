package com.thread.signal;

public class MyWaitNotify {
	MonitorObject myMonitorObject = new MonitorObject();
	boolean wasSignalled = false;

	public void doWait() {
		synchronized (myMonitorObject) {
			try {
				System.out.println("In dowait method before signal");
				// if (!wasSignalled) {
				while (!wasSignalled) {
					System.out.println("Thread in waiting state");
					myMonitorObject.wait();
				}
			} catch (InterruptedException e) {

			}
			System.out.println("Thread is awakened");
			wasSignalled = false;
		}
	}

	public void doNotify() {
		synchronized (myMonitorObject) {
			System.out.println("Notify signal for Thread");
			wasSignalled = true;
			myMonitorObject.notify();
		}
	}
}
