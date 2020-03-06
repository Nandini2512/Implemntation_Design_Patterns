package Structural_Decorator;

public class FreshTomato extends toppings{
	pizza pizza; 
	  
    public FreshTomato(pizza pizza) { this.pizza = pizza; } 
    public String getDescription() { 
        return pizza.getDescription() + ", Fresh Tomato "; 
    } 
    public int getCost() { return 40 + pizza.getCost(); } 


}
