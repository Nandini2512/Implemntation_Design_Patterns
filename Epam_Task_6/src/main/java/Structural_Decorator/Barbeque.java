package Structural_Decorator;

public class Barbeque extends toppings{
	pizza pizza; 
    public Barbeque(pizza pizza) {  this.pizza = pizza;  } 
    public String getDescription() { 
        return pizza.getDescription() + ", Barbeque "; 
    } 
    public int getCost() { return 90 + pizza.getCost(); } 


}
