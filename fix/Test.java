package com.Neha.Design;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Test {
     
	 private static int choice;
	public static void main(String[] args)throws NumberFormatException, IOException {
		
		  do {

	            System.out.println("Welcome to our Switching Application");
	            System.out.println("1. Bulb");
	            System.out.println("2. Music System");
	            

	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	            choice = Integer.parseInt(br.readLine());
	            InvokerImplement sp = new InvokerImplement();

	            switch(choice) {
	                case 1: {
	                    sp.UseBulb();;
	                } break;

	                case 2: {
	                    sp.UseMusicSystem();
	                } break;
	                default: {
	                    System.out.println("Please check the input and try again!");
	                }
	                return;
	            }
	        }while(choice !=3);
		// TODO Auto-generated method stub

	}

}
