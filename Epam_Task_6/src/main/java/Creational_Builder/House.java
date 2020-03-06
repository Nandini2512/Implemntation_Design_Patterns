package Creational_Builder;

public class House implements HousePlan 
{ 
  
    String basement; 
     String structure; 
     String roof; 
     String interior; 
  
    public void setBasement(String basement)  
    { 
        this.basement = basement; 
    } 
  
    public void setStructure(String structure)  
    { 
        this.structure = structure; 
    } 
  
    public void setRoof(String roof)  
    { 
        this.roof = roof; 
    } 
  
    public void setInterior(String interior)  
    { 
        this.interior = interior; 
    } 
  

}
