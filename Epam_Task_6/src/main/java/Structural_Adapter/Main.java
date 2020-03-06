package Structural_Adapter;

public class Main {
	 public static void main(String args[]) 
	    { 
	        sparrow sparrow = new sparrow(); 
	        duck toyDuck = new plastic_duck();
	        duck birdAdapter = new bird_Adapter(sparrow); 
	  
	        System.out.println("Sparrow..."); 
	        sparrow.fly(); 
	        sparrow.makeSound(); 
	  
	        System.out.println("ToyDuck..."); 
	        toyDuck.squeak(); 
	  
	         
	        System.out.println("BirdAdapter..."); 
	        birdAdapter.squeak(); 
	    } 

}
