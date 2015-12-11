package entity;

import java.awt.Graphics;

/**
*
* @author Tolga
*/


public class Building {
   protected int hitpoint;
   protected int energyCost;
   protected int sparePartCost;

   /*
   public Building(int hitpoint, int energyCost,int sparePartCost )
   {  
           this.hitpoint = hitpoint;
           this.energyCost = energyCost;
           this.sparePartCost = sparePartCost;
   }
   
   */
   public Building() {
       
   }
   public Building(int Type)
   {
       
   }
   public void refresh()
   {
       
      
   }   
   
   public void updateEnergy()
   {
       
       
   }    
   public int getHitpoint(){
       return hitpoint;
   }
   public int getEnergyCost(){
       return energyCost;
   }
   public int getSparePartCost(){
       return sparePartCost;
   }
   public void setHitpoint(int hit){
       hitpoint = hit;
               
   }
   public void setSparePartCost(int spare){
       sparePartCost = spare;
               
   }
   public void setEnergyCost(int energy){
      energyCost = energy;
               
   }
  
   public void draw(Graphics g, int x, int y){
	   g.fillRect(x, y, 40, 40);
   }
 
}
