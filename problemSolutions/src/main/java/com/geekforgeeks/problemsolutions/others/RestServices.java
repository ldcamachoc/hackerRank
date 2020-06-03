package com.geekforgeeks.problemsolutions.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RestServices {
	
	public static void main(String args[]) {
		try {
		URL url = new URL("https://json");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
//		conn.setRequestProperty("Accept", "application/xml");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();

	  } catch (MalformedURLException e1) {

		e1.printStackTrace();

	  } catch (IOException e1) {

		e1.printStackTrace();

	  }
		
	 String json= "{\n" + 
	 		"  \"cars\": {\n" + 
	 		"    \"Nissan\": [\n" + 
	 		"      {\n" + 
	 		"        \"model\": \"Sentra, esc\",\n" + 
	 		"        \"doors\": 4567,\n" + 
	 		"        \"test\": \"value\",\n" + 
	 		"        \"chairs\": 58\n" + 
	 		"      },\n" + 
	 		"      {\n" + 
	 		"        \"chairs\": 584565656,\n" + 
	 		"        \"model\": \"Maxima\",\n" + 
	 		"        \"doors\": 45\n" + 
	 		"      },\n" + 
	 		"      {\n" + 
	 		"        \"model\": \"Skyline\",\n" + 
	 		"        \"doors\": 267\n" + 
	 		"      }\n" + 
	 		"    ],\n" + 
	 		"    \"Ford\": [\n" + 
	 		"      {\n" + 
	 		"        \"model\": \"Taurus\",\n" + 
	 		"        \"doors\": 4\n" + 
	 		"      },\n" + 
	 		"      {\n" + 
	 		"        \"model\": \"Escort\",\n" + 
	 		"        \"doors\": 4\n" + 
	 		"      }\n" + 
	 		"    ]\n" + 
	 		"  }";
	 
	 
	 Pattern codePattern = Pattern.compile("\"model\".*:.*\"(?<value>.*)\"");
     Pattern messagePattern = Pattern.compile("\"doors\".*:\\s*(?<value>\\d+)");
    

     Matcher code_matcher = codePattern.matcher(json);
     Matcher message_matcher = messagePattern.matcher(json);
    

     while (code_matcher.find() && message_matcher.find()) {

         System.out.println("Model:" + code_matcher.group("value"));
         System.out.println("Doors:" + message_matcher.group("value"));
         
     }
		
	}

}
