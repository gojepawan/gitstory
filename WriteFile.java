package com.example.demo;
import java.io.*;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("C:\\Users\\TY274EL\\pawan.txt");
			myWriter.write("creating file is enough exited");
			myWriter.close();
			System.out.println("file writed successfully");
			
			
			
		}catch(IOException e){
			System.out.println("Error occuered");
			e.printStackTrace();
			
			
		}

	}

}
