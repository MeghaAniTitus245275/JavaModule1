package ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class KeyboardToFile {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("main entered...");
		String data = null;
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		FileWriter writer = new FileWriter("nammadafile.txt");
		System.out.println("enter some text..");
		data = reader.readLine();
		while(!data.equals("quit")) {
			//System.out.println("you have entered ...."+data);
			writer.write(data);
			data = reader.readLine();
		
		
	}
		writer.flush();
		writer.close();
		reader.close();
		System.out.println("main exited...");

}}
