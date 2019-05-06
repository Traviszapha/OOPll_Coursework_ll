package trevor.wakida;

import java.util.Scanner;

public class Second {
	int Average=0;
	int y = 6;
	
	
		public Second() {
			Scanner scn = new Scanner(System.in);
			
			int ComputerNetworks;
			System.out.print("CalculusI :");
			ComputerNetworks = scn.nextInt();		
		
			int WebDesignII;
			System.out.print("Web DesignII :");
			WebDesignII = scn.nextInt();
					
			int SystemAnalysis;
			System.out.print("System Analysis and Design :");
			SystemAnalysis = scn.nextInt();
					
			int ResearchMethodI;
			System.out.print("Operating Systems :");
			ResearchMethodI = scn.nextInt();			
			
			int OperatingSystems;
			System.out.print("Research Method I :");
			OperatingSystems = scn.nextInt();
			
			int CalculusI;
			System.out.print("Computer Networks :");
			CalculusI = scn.nextInt();
			
			int sum =  ComputerNetworks + WebDesignII + SystemAnalysis + ResearchMethodI + OperatingSystems + CalculusI;
			Average = sum/y;
			System.out.print("\nTotal Mark :" +sum   +"\nAverage Mark :" +Average +"\n\n" );
		
			return;
			
		}

}
