package Structural_Decorator;

public class Paneer extends toppings {
	pizza pizza; 
    public Paneer(pizza pizza)  {  this.pizza = pizza; } 
    public String getDescription() { 
        return pizza.getDescription() + ", Paneer "; 
    } 
    public int getCost()  {  return 70 + pizza.getCost(); } 

}
