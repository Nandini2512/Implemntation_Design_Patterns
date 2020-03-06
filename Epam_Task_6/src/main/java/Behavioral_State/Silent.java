package Behavioral_State;

public class Silent implements MobileAlertState 
{ 
    public void alert(AlertStateContext ctx)  
    { 
        System.out.println("silent..."); 
    } 

}
