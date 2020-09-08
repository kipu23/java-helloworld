package com.krisz.helloworld;

//the class of the program
public class Helloworld {
	
	//The string to output
	private final String message = "Hello World!";
	
	//Constructor of the class
	public Helloworld() {}
	
	//Main method, this will be executed first
    public static void main(String[] args) {
        System.out.println(new Helloworld().getMessage());
    }

	//Method to retrive the message string
	private final String getMessage(){
		return message;
	}
}
