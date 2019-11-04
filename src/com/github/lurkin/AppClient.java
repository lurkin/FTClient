package com.github.lurkin;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class AppClient {
	
	public static void main(String[] args) {
		String sourceDirectory;
		
		sourceDirectory = "E:\\Maciej\\Inne\\FileTransfer\\Client";
		
		
		DirectoryViewer dv = new DirectoryViewer();
		dv.launch(dv.getClass());
		
		try {
			Socket sock = new Socket("127.0.0.1", 29666);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
