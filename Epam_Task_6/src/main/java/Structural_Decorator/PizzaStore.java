package Structural_Decorator;

public class PizzaStore {
	public static void main(String args[]) 
    { 
        // create new margherita pizza 
        pizza pizza = new Margherita(); 
        System.out.println( pizza.getDescription() + 
                         " Cost :" + pizza.getCost()); 
  
        // create new FarmHouse pizza 
        pizza pizza2 = new farmhouse(); 
  
        // decorate it with freshtomato topping 
        pizza2 = new FreshTomato(pizza2); 
  
        //decorate it with paneer topping 
        pizza2 = new Paneer(pizza2); 
  
        System.out.println( pizza2.getDescription() + 
                         " Cost :" + pizza2.getCost()); 
        pizza pizza3 = new Barbeque(null);    //no specific pizza 
        System.out.println( pizza3.getDescription() + "  Cost :" + pizza3.getCost()); 
   } 
}
