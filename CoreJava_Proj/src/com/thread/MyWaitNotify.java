package com.thread;

public class MyWaitNotify {
	MonitorObject myMonitorObject = new MonitorObject();

	public void doWait() {
		synchronized (myMonitorObject) {
			try {
				System.out.println("Thread in waiting state");
				myMonitorObject.wait();
			} catch (InterruptedException e) {

			}
			System.out.println("Thread is awakened");
		}
	}

	public void doNotify() {
		synchronized (myMonitorObject) {
			System.out.println("Notify signal for Thread");
			myMonitorObject.notify();
		}
	}
}
