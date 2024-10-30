package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class LinksCheckerDemo {
	
	public static void brokenlinkDemo(String str) {
	
	try {
		HttpURLConnection httpurl;
		
		URL url = new URL(str);
		
		httpurl=(HttpURLConnection)url.openConnection();
		httpurl.connect();
		int statuscode = httpurl.getResponseCode();
		
		if(statuscode>=400)
		{
			System.out.println("Given link is a broken link:" +str);
		}
		else
		{
			System.out.println("Given link is a vaid link");
		}
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
