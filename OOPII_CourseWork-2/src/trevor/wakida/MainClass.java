package trevor.wakida;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<String> courses = new ArrayList();
			Scanner scn = new Scanner(System.in);
			int n=1;		
			Second unit;
		
		while(true) {
			System.out.print("Enter Student "+ n + ":");
			String course = new Scanner(System.in).nextLine();

			if(course.toLowerCase().equals("exit"))
				break;
			else {
				courses.add(course);
			    unit = new Second();
			  }
			n++;
					
		    }
			
		
		  }
		
    }
