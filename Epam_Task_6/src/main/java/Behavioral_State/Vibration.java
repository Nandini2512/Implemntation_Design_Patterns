package Behavioral_State;

public class Vibration implements MobileAlertState  
{ 
  
    public void alert(AlertStateContext ctx)  
    { 
         System.out.println("vibration..."); 
    } 

}
