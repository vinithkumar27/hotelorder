package hotelorder;

import java.util.Scanner;
class people
{
  static Scanner in1 = new Scanner(System.in);
 public void peoples()
  {
	 System.out.println("can you please tell me how many persons are there with you");
	 int members = in1.nextInt();
	 System.out.println("ok we will book table for you with capacity of "+members+" members");
	 System.out.println("are you looking for normal or ac");
	 String room = in1.next();
	 if((room.equals("normal"))||(room.equals("ac")))
	 {
		 System.out.println("take your seat have a good day");
		 menu();
	 }
	 else
	 {
		 System.out.println("once again,type correctly");
		 peoples();
	 }
  }
 public static void menu()
 {
	 System.out.println("can you starts with starters/dryitems/roti/gravy/drinks/bill");
	 String type = in1.next();
	 if(type.equals("starters"))
	 {
		 hotelorder.menu.starters();
	 }
	 else if(type.equals("dryitems"))
	 {
		 hotelorder.menu.dryitems();
	 }
	 else if(type.equals("roti"))
	 {
		 hotelorder.menu.roti();
	 }
	 else if(type.equals("gravy"))
	 {
		 hotelorder.menu.gravy();
	 }
	 else if(type.equals("drinks"))
	 {
		 hotelorder.menu.drinks();
	 }
	 else if(type.equals("bill"))
	 { 
		 for(int i=0;i<1;i++)
		 {
		 System.out.println(hotelorder.menu.v);
		 System.out.println(hotelorder.menu.v1);
		 System.out.println(hotelorder.menu.v2);
		 System.out.println(hotelorder.menu.v3);
		 System.out.println(hotelorder.menu.v4);
		 System.out.println(hotelorder.menu.v5);
		 System.out.println(hotelorder.menu.v6);
		 }
	 }
	 else
	 {
		 System.out.println("please enter correctly again");
		 menu();
	 }
 }
}
