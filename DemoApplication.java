package com.example.demo;
import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		   try { 
			   File myObj = new File("C:\\Users\\TY274EL\\pawan.txt");
			    if(myObj.createNewFile()) {
			    System.out.println("file is created" + myObj.getName());
			    
			    }
			    else {
			    System.out.println("file already exist");	
			    }
			   
		   } catch(Exception e){
			 System.out.println("error occuered");
			 e.printStackTrace();  	 	
			 
		   }
	}

}
