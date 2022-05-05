package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextDemoListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent e) {
		try {
			String path = e.getServletContext().getRealPath("abc.txt");
			
			System.out.println(path);
			
			BufferedReader br = new BufferedReader(new FileReader(path));
			String s = br.readLine();   
			if (s != null) {
				int c = Integer.parseInt(s);
				RequestDemoListener.count = c;
			}
		} catch (Exception e1) {
		}
	}

	public void contextDestroyed(ServletContextEvent e) {
		try {
			String path = e.getServletContext().getRealPath("abc.txt");
			PrintWriter pw = new PrintWriter(path);
			pw.println(RequestDemoListener.count);
			pw.flush();
		} catch (Exception e1) {
		}
	}

}
