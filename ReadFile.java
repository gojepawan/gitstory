package com.example.demo;
import java.io.*;
import java.util.*;
public class ReadFile {

	public static void main(String[] args) {
		try {
			File  myObj = new File("C:\\Users\\TY274EL\\paw.txt");
		    Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
		      String Data = myReader.nextLine();
		      System.out.println(Data);
		}
			myReader.close();
		}catch(IOException e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		

	}

}
