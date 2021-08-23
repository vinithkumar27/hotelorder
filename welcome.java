package hotelorder;

import java.util.Scanner;

class intro {
	   Scanner in = new Scanner(System.in);
	   String genderm;
	   String genderf;
	   public void welcome()
	   {
		    System.out.println("Check the gender..");
		    String gend = in.nextLine();
		    if(gend.equals("male"))
		    {
		    	this.genderm="sir";
		    	System.out.println("good morning "+genderm+"..");
		    }
		    else if(gend.equals("female"))
		    {
		    	this.genderf="mam";
		    	System.out.println("good morning "+genderf+"..");
		    }
		    else
		    {
		    	System.out.println("Good morning..");
		    }
	   }
}