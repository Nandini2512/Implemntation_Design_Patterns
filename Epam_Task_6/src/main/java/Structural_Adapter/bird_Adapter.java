package Structural_Adapter;

public class bird_Adapter implements duck {
	 bird bird1; 
	    public bird_Adapter(bird bird1) 
	    { 
	        
	        this.bird1 = bird1; 
	    } 
	  
	    public void squeak() 
	    { 
	        
	        bird1.makeSound(); 
	    } 

}
