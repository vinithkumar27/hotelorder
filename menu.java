package hotelorder;
import java.util.Scanner;
import java.util.Vector;
class menu
  {
	static int rate=0;
	static int count=0;
	static int bill=0;
	static Vector v = new Vector();
	static Vector v1 = new Vector();
	static Vector v2 = new Vector();
	static Vector v3 = new Vector();
	static Vector v4 = new Vector();
	static Vector v5 = new Vector();
	static Vector v6 = new Vector();
	static Scanner in4 = new Scanner(System.in);	
    public static void starters()
    {
       System.out.println("our starters are ");
       String[] a = {"soups","papats","sweets","mainmenu"}; 
       for(int i=0;i<a.length;i++)
       {
    	 System.out.println(a[i]);  
       }
       String start =in4.next();
     if(start.equals("soups"))
     {
    	 soups();
     }
     else if(start.equals("papats"))
     {
    	 papats();
     }
     else if(start.equals("sweets"))
     {
    	 sweets();
     }
     else if(start.equals("mainmenu"))
     {
    	hotelorder.people.menu();
     }
     else
     {
    	 System.out.println("please,once again type correctly");
    	 starters();
     }
    }
    public static void total()
    {
    	System.out.println("bill : "+bill);
    	double gst= bill*12/100;
    	double totalbill = bill+gst;
    	System.out.println("GST : "+gst);
    	System.out.println("Total Bill : "+totalbill);
    	System.out.println("Thanks for coming...");
    }
    public static void soups()
    {	
    	System.out.println("we have ");
    	String[] b = {"vegsoup","sweetcornsoup","mushroomsoup","chickensoup","mayosoup","manchosoup","chettinadusoup"};
    	for(int i=0;i<b.length;i++)
    	{
    		System.out.println(b[i]);
    	}
    	String order = in4.next();
    	System.out.println("how many "+order+" you want ");
    	count = in4.nextInt();
    	if(order.equals("vegsoup"))
    	{
    	vegsoup();
    	bill=bill+rate;
    	}
    	else if(order.equals("sweetcornsoup"))
    	{
    	sweetcornsoup();
    	bill=bill+rate;
    	}
    	else if(order.equals("mushroomsoup"))
    	{
    	 mushroomsoup();
    	 bill=bill+rate;
    	}
    	else if(order.equals("chickensoup"))
    	{
    	chickensoup();
    	bill=bill+rate;
    	}
    	else if(order.equals("manchosoup"))
    	{
    	manchosoup();
    	bill=bill+rate;
    	}
    	else if(order.equals("mayosoup"))
    	{
    	mayosoup();
    	bill=bill+rate;
    	}
    	else if(order.equals("chettinadusoup"))
    	{
    	chettinadusoup();
    	bill=bill+rate;
    	}
    	else
    	{
    	  System.out.println("please type same as displayed");
    	  soups();
    	}
    	for(int i=0;i<1;i++)
    	{
    		v.addElement(order+" - "+count+" - "+rate);
    	}
    	System.out.println("you want more in soups..");
    	String ans = in4.next();
    	if(ans.equals("yes"))
    		{
    		   soups();
    		}
    	else
    		{
    		 starters();
    		}
    }
    public static void vegsoup()

    {
    	int vegsoup = 60;
    	switch(count)
    	{
    	case 1:	
    		rate=vegsoup*count;
    	case 2:
    		rate=vegsoup*count;
    	case 3:
    		rate=vegsoup*count;
    	case 4:
    		rate=vegsoup*count;
    	}
    }
    public static void sweetcornsoup()
    {
    	int sweetcorn=65;
    	switch(count)
    	{
    	case 1:
    		rate=sweetcorn*count;
    	case 2:
    		rate=sweetcorn*count;
    	case 3:
    		rate=sweetcorn*count;
    	case 4:
    		rate=sweetcorn*count;
    	}
    	
    }
    public static void mushroomsoup()
    {
    	int mushroom=70;
    	switch(count)
    	{
    	case 1:
    		rate=mushroom*count;
    	case 2:
    		rate=mushroom*count;
    	case 3:
    		rate=mushroom*count;
    	case 4:
    		rate=mushroom*count;
    	}
    	
    }
    public static void manchosoup()
    {
    	int mancho=75;
    	switch(count)
    	{
    	case 1:
    		rate=mancho*count;
    	case 2:
    		rate=mancho*count;
    	case 3:
    		rate=mancho*count;
    	case 4:
    		rate=mancho*count;
    	}
    	
    }
    public static void mayosoup()
    {
    	int mayo=80;
    	switch(count)
    	{
    	case 1:
    		rate=mayo*count;
    	case 2:
    		rate=mayo*count;
    	case 3:
    		rate=mayo*count;
    	case 4:
    		rate=mayo*count;
    	}
    	
    }
    public static void chickensoup()
    {
    	int chicken=90;
    	switch(count)
    	{
    	case 1:
    		rate=chicken*count;
    	case 2:
    		rate=chicken*count;
    	case 3:
    		rate=chicken*count;
    	case 4:
    		rate=chicken*count;
    	}
    	
    }
    public static void chettinadusoup()
    {
    	int chettinadu=95;
    	switch(count)
    	{
    	case 1:
    		rate=chettinadu*count;
    	case 2:
    		rate=chettinadu*count;
    	case 3:
    		rate=chettinadu*count;
    	case 4:
    		rate=chettinadu*count;
    	}
    	
    }
    public static void papats()
    {
    	System.out.println("we have ");
    	String[] c = {"vegpapat","spicypapat","mayopapat","drypapat","chickenpapat"};
    	for(int i=0;i<c.length;i++)
    	{
    	   System.out.println(c[i]);	 
    	}
    	String order = in4.next();
    	System.out.println("how many "+order+" you want ");
    	count = in4.nextInt();
    	if(order.equals("vegpapat"))
    	{
    	vegpapat();
    	bill=bill+rate;
    	}
    	else if(order.equals("spicypapat"))
    	{
    	spicypapat();
    	bill=bill+rate;
    	}
    	else if(order.equals("mayopapat"))
    	{
    	 mayopapat();
    	 bill=bill+rate;
    	}
    	else if(order.equals("chickenpapat"))
    	{
    	chickenpapat();
    	bill=bill+rate;
    	}
    	else if(order.equals("drypapat"))
    	{
    	drypapat();
    	bill=bill+rate;
    	}
    	else
    	{
    	  System.out.println("please type same as displayed");
    	  papats();
    	}
    	for(int i=0;i<1;i++)
    	{
    		v1.addElement(order+" - "+count+" - "+rate);
    	}
    	System.out.println("you want more in papats..");
    	String ans = in4.next();
    	if(ans.equals("yes"))
    	{
    		papats();
    	}
    	else
    	{
    		starters();
    	}
    }
    public static void vegpapat()
    {
    	int vegpapat = 60;
    	switch(count)
    	{
    	case 1:	
    		rate=vegpapat*count;
    	case 2:
    		rate=vegpapat*count;
    	case 3:
    		rate=vegpapat*count;
    	case 4:
    		rate=vegpapat*count;
    	}
    }
    public static void drypapat()
    {
    	int drypapat = 40;
    	switch(count)
    	{
    	case 1:	
    		rate=drypapat*count;
    	case 2:
    		rate=drypapat*count;
    	case 3:
    		rate=drypapat*count;
    	case 4:
    		rate=drypapat*count;
    	}
    }
    public static void chickenpapat()
    {
    	int chickenpapat = 80;
    	switch(count)
    	{
    	case 1:	
    		rate=chickenpapat*count;
    	case 2:
    		rate=chickenpapat*count;
    	case 3:
    		rate=chickenpapat*count;
    	case 4:
    		rate=chickenpapat*count;
    	}
    }
    public static void mayopapat()
    {
    	int mayo = 60;
    	switch(count)
    	{
    	case 1:	
    		rate=mayo*count;
    	case 2:
    		rate=mayo*count;
    	case 3:
    		rate=mayo*count;
    	case 4:
    		rate=mayo*count;
    	}
    }
    public static void spicypapat()
    {
    	int spicy = 60;
    	switch(count)
    	{
    	case 1:	
    		rate=spicy*count;
    	case 2:
    		rate=spicy*count;
    	case 3:
    		rate=spicy*count;
    	case 4:
    		rate=spicy*count;
    	}
    }
    public static void sweets()
    {
    	System.out.println("we have  ");
    	String[] d = {"jilebi","palkova","gulabjamun","rasagula"};
    	for(int i=0;i<d.length;i++)
    	{
    		System.out.println(d[i]);
    	}
    	String order = in4.next();
    	System.out.println("how many "+order+" you want ");
    	count = in4.nextInt();
    	if(order.equals("jilebi"))
    	{
    	jilebi();
    	bill=bill+rate;
    	}
    	else if(order.equals("palkova"))
    	{
    	palkova();
    	bill=bill+rate;
    	}
    	else if(order.equals("gulabjamun"))
    	{
    	 gulabjamun();
    	 bill=bill+rate;
    	}
    	else if(order.equals("rasagula"))
    	{
    	rasagula();
    	bill=bill+rate;
    	}
    	else
    	{
    	  System.out.println("please type same as displayed");
    	  sweets();
    	}
    	for(int i=0;i<1;i++)
    	{
    		v2.addElement(order+" - "+count+" - "+rate);
    	}
    	System.out.println("you want more in sweets..");
    	String ans = in4.next();
    	if(ans.equals("yes"))
    	{
    		sweets();
    	}
    	else
    	{
    		starters();
    	}
    }
    public static void jilebi()
    {
    	int jilebi = 15;
    	switch(count)
    	{
    	case 1:	
    		rate=jilebi*count;
    	case 2:
    		rate=jilebi*count;
    	case 3:
    		rate=jilebi*count;
    	case 4:
    		rate=jilebi*count;
    	}
    }
    public static void gulabjamun()
    {
    	int jamun = 20;
    	switch(count)
    	{
    	case 1:	
    		rate=jamun*count;
    	case 2:
    		rate=jamun*count;
    	case 3:
    		rate=jamun*count;
    	case 4:
    		rate=jamun*count;
    	}
    }
    public static void rasagula()
    {
    	int rasa= 25;
    	switch(count)
    	{
    	case 1:	
    		rate=rasa*count;
    	case 2:
    		rate=rasa*count;
    	case 3:
    		rate=rasa*count;
    	case 4:
    		rate=rasa*count;
    	}
    }
    public static void palkova()
    {
    	int kova = 20;
    	switch(count)
    	{
    	case 1:	
    		rate=kova*count;
    	case 2:
    		rate=kova*count;
    	case 3:
    		rate=kova*count;
    	case 4:
    		rate=kova*count;
    	}
    }
    public static void dryitems()
    {
    	System.out.println("we have  ");
    	String[] d = {"chicken65","chickenlollipop","chickenchukka","honeychicken"};
    	for(int i=0;i<d.length;i++)
    	{
    		System.out.println(d[i]);
    	}
    	String order = in4.next();
    	System.out.println("how many "+order+" you want ");
    	count = in4.nextInt();
    	if(order.equals("chicken65"))
    	{
    	chicken65();
    	bill=bill+rate;
    	}
    	else if(order.equals("chickenlollipop"))
    	{
    	chickenlollipop();
    	bill=bill+rate;
    	}
    	else if(order.equals("chickenchukka"))
    	{
    	 chickenchukka();
    	 bill=bill+rate;
    	}
    	else if(order.equals("honeychicken"))
    	{
    	honeychicken();
    	bill=bill+rate;
    	}
    	else
    	{
    	  System.out.println("please type same as displayed");
    	  dryitems();
    	}
    	for(int i=0;i<1;i++)
    	{
    		v3.addElement(order+" - "+count+" - "+rate);
    	}
    	System.out.println("you want more in dryitems..");
    	String ans = in4.next();
    	if(ans.equals("yes"))
    	{
    		dryitems();
    	}
    	else
    	{
    		hotelorder.people.menu();
    	}
    }
    public static void chicken65()
    {
    	int chi65 = 140;
    	switch(count)
    	{
    	case 1:	
    		rate=chi65*count;
    	case 2:
    		rate=chi65*count;
    	case 3:
    		rate=chi65*count;
    	case 4:
    		rate=chi65*count;
    	}
    }
    public static void chickenlollipop()
    {
    	int pop = 150;
    	switch(count)
    	{
    	case 1:	
    		rate=pop*count;
    	case 2:
    		rate=pop*count;
    	case 3:
    		rate=pop*count;
    	case 4:
    		rate=pop*count;
    	}
    }
    public static void chickenchukka()
    {
    	int chukka = 150;
    	switch(count)
    	{
    	case 1:	
    		rate=chukka*count;
    	case 2:
    		rate=chukka*count;
    	case 3:
    		rate=chukka*count;
    	case 4:
    		rate=chukka*count;
    	}
    }
    public static void honeychicken()
    {
    	int honey = 160;
    	switch(count)
    	{
    	case 1:	
    		rate=honey*count;
    	case 2:
    		rate=honey*count;
    	case 3:
    		rate=honey*count;
    	case 4:
    		rate=honey*count;
    	}
    }
    public static void roti()
    {
    	System.out.println("we have  ");
    	String[] d = {"normalnon","butternon","stuffednon","kulcha"};
    	for(int i=0;i<d.length;i++)
    	{
    		System.out.println(d[i]);
    	}
    	String order = in4.next();
    	System.out.println("how many "+order+" you want ");
    	count = in4.nextInt();
    	if(order.equals("normalnon"))
    	{
    	normalnon();
    	bill=bill+rate;
    	}
    	else if(order.equals("butternon"))
    	{
    	butternon();
    	bill=bill+rate;
    	}
    	else if(order.equals("stuffednon"))
    	{
    	 stuffednon();
    	 bill=bill+rate;
    	}
    	else if(order.equals("kulcha"))
    	{
    	kulcha();
    	bill=bill+rate;
    	}
    	else
    	{
    	  System.out.println("please type same as displayed");
    	  roti();
    	}
    	for(int i=0;i<1;i++)
    	{
    		v4.addElement(order+" - "+count+" - "+rate);
    	}
    	System.out.println("you want more in roti..");
    	String ans = in4.next();
    	if(ans.equals("yes"))
    	{
    		roti();
    	}
    	else
    	{
    		hotelorder.people.menu();
    	}
    }
    public static void normalnon()
    {
    	int non = 30;
    	switch(count)
    	{
    	case 1:	
    		rate=non*count;
    	case 2:
    		rate=non*count;
    	case 3:
    		rate=non*count;
    	case 4:
    		rate=non*count;
    	}
    }
    public static void butternon()
    {
    	int butter = 40;
    	switch(count)
    	{
    	case 1:	
    		rate=butter*count;
    	case 2:
    		rate=butter*count;
    	case 3:
    		rate=butter*count;
    	case 4:
    		rate=butter*count;
    	}
    }
    public static void stuffednon()
    {
    	int stuff = 60;
    	switch(count)
    	{
    	case 1:	
    		rate=stuff*count;
    	case 2:
    		rate=stuff*count;
    	case 3:
    		rate=stuff*count;
    	case 4:
    		rate=stuff*count;
    	}
    }
    public static void kulcha()
    {
    	int kulcha = 50;
    	switch(count)
    	{
    	case 1:	
    		rate=kulcha*count;
    	case 2:
    		rate=kulcha*count;
    	case 3:
    		rate=kulcha*count;
    	case 4:
    		rate=kulcha*count;
    	}
    }
    public static void gravy()
    {
    	System.out.println("we have  ");
    	String[] d = {"chickenmasala","muttonmasala","natukolimasala","fishmasala"};
    	for(int i=0;i<d.length;i++)
    	{
    		System.out.println(d[i]);
    	}
    	String order = in4.next();
    	System.out.println("how many "+order+" you want ");
    	count = in4.nextInt();
    	if(order.equals("chickenmasala"))
    	{
    	chickenmasala();
    	bill=bill+rate;
    	}
    	else if(order.equals("muttonmasala"))
    	{
    	muttonmasala();
    	bill=bill+rate;
    	}
    	else if(order.equals("natukolimasala"))
    	{
    	 natukolimasala();
    	 bill=bill+rate;
    	}
    	else if(order.equals("fishmasala"))
    	{
    	fishmasala();
    	bill=bill+rate;
    	}
    	else
    	{
    	  System.out.println("please type same as displayed");
    	  gravy();
    	}
    	for(int i=0;i<1;i++)
    	{
    		v5.addElement(order+" - "+count+" - "+rate);
    	}
    	System.out.println("you want more in gravy..");
    	String ans = in4.next();
    	if(ans.equals("yes"))
    	{
    		gravy();
    	}
    	else
    	{
    		hotelorder.people.menu();
    	}
    }
    public static void chickenmasala()
    {
    	int chicken = 130;
    	switch(count)
    	{
    	case 1:	
    		rate=chicken*count;
    	case 2:
    		rate=chicken*count;
    	case 3:
    		rate=chicken*count;
    	case 4:
    		rate=chicken*count;
    	}
    }
    public static void muttonmasala()
    {
    	int mutton = 180;
    	switch(count)
    	{
    	case 1:	
    		rate=mutton*count;
    	case 2:
    		rate=mutton*count;
    	case 3:
    		rate=mutton*count;
    	case 4:
    		rate=mutton*count;
    	}
    }
    public static void natukolimasala()
    {
    	int natu = 190;
    	switch(count)
    	{
    	case 1:	
    		rate=natu*count;
    	case 2:
    		rate=natu*count;
    	case 3:
    		rate=natu*count;
    	case 4:
    		rate=natu*count;
    	}
    }
    public static void fishmasala()
    {
    	int fish = 200;
    	switch(count)
    	{
    	case 1:	
    		rate=fish*count;
    	case 2:
    		rate=fish*count;
    	case 3:
    		rate=fish*count;
    	case 4:
    		rate=fish*count;
    	}
    }
    public static void drinks()
    {
    	System.out.println("we have  ");
    	String[] d = {"limesoda","softdrink","watermelon","milkshake"};
    	for(int i=0;i<d.length;i++)
    	{
    		System.out.println(d[i]);
    	}
    	String order = in4.next();
    	System.out.println("how many "+order+" you want ");
    	count = in4.nextInt();
    	if(order.equals("limesoda"))
    	{
    	limesoda();
    	bill=bill+rate;
    	}
    	else if(order.equals("softdrink"))
    	{
    	softdrink();
    	bill=bill+rate;
    	}
    	else if(order.equals("watermelon"))
    	{
    	 watermelon();
    	 bill=bill+rate;
    	}
    	else if(order.equals("milkshake"))
    	{
    	milkshake();
    	bill=bill+rate;
    	}
    	else
    	{
    	  System.out.println("please type same as displayed");
    	  drinks();
    	}
    	for(int i=0;i<1;i++)
    	{
    		v6.addElement(order+" - "+count+" - "+rate);
    	}
    	System.out.println("you want more in drinks..");
    	String ans = in4.next();
    	if(ans.equals("yes"))
    	{
    		drinks();
    	}
    	else
    	{
    		hotelorder.people.menu();
    	}
    }
    public static void limesoda()
    {
    	int soda = 40;
    	switch(count)
    	{
    	case 1:	
    		rate=soda*count;
    	case 2:
    		rate=soda*count;
    	case 3:
    		rate=soda*count;
    	case 4:
    		rate=soda*count;
    	}
    } 
    public static void softdrink()
    {
    	int soft = 20;
    	switch(count)
    	{
    	case 1:	
    		rate=soft*count;
    	case 2:
    		rate=soft*count;
    	case 3:
    		rate=soft*count;
    	case 4:
    		rate=soft*count;
    	}
    } 
    public static void watermelon()
    {
    	int melon = 50;
    	switch(count)
    	{
    	case 1:	
    		rate=melon*count;
    	case 2:
    		rate=melon*count;
    	case 3:
    		rate=melon*count;
    	case 4:
    		rate=melon*count;
    	}
    }
    public static void milkshake()
    {
    	int shake = 100;
    	switch(count)
    	{
    	case 1:	
    		rate=shake*count;
    	case 2:
    		rate=shake*count;
    	case 3:
    		rate=shake*count;
    	case 4:
    		rate=shake*count;
    	}
    }
  }
