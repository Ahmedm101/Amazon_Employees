package realease_july;

public class Sprint_07 {
      int x= 60000;
	public static void main(String[] args) {
		
		
		// print 20 to 30//
		int a= 20;
		while (a<30) { 
			System.out.println("hello"+ a);
			a++;
		}
		
		System.out.println("task 4");
		int b =30;
		while (b<=40) { 
			System.out.println(b);
			b++;
			
		}
		
		// Array:
		
		String maliha [] = new String [5];
		
		maliha [0] = "milo";
	    maliha [1] = "aamir";
	    maliha [2] = "alisha";
	    
	    // the value of first box is milo
	    
	    
	   System.out.println("task 1" );
	   
	   String name = "Maliha";
	   
	   if (name == "Maliha") {
		   System.out.println(" Name is Maliha");
		   
	   }
	   else {
		   System.out.println(" Name is not Maliha");
	   }
		
	   if (name != "Maliha") {
	   System.out.println("Name is Maliha");
	   
	   }
	   else {
		   System.out.println("Name is not Maliha");
	   }
	   Sprint_07 ob= new Sprint_07();
	   ob.method();
		
	}
	
	public void method( ) {
		int x=5;
		//this.x=x;   // setting global variable in local variable 
		System.out.println(this.x);
	}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


