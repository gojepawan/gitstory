package com.example.demo;
import java.io.*;

public class Size {

	public static void main(String[] args) {
        String fileName = "src/main/resources/words.txt";
        
        File f = new File(fileName);
        long fileSize = f.length();
        
        System.out.format("The size of the file: %d bytes", fileSize);
    }
}

		// TODO Auto-generated method stub

	
