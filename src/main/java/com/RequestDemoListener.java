package com;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestDemoListener implements ServletRequestListener {

	public static int count = 0;

	public void requestInitialized(ServletRequestEvent e) {
		count++;
	}

	public void requestDestroyed(ServletRequestEvent e) {
	}

}
