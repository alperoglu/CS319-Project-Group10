package entity;

import java.awt.Color;
import java.awt.Graphics;

/**
*
* @author Tolga
*/
public class Tower extends Building
{
   int damage;
   int type;
   
   public Tower(int towerType){
       
     super();
     type = towerType;
     if(towerType == 1)
     {         
         damage = 10;
         hitpoint = 10;
         sparePartCost = 1;
         energyCost = 0;
        
     }
     else if(towerType == 2)
     {
         
         damage = 50;
         hitpoint = 50;
         sparePartCost = 5;
         energyCost = 20;
     }
     else if(towerType == 3)
     {
         
         damage = 200;
         hitpoint = 200;
         sparePartCost = 10;
         energyCost = 50;
     }
 }
   
   public int getDamage()
   {
       return damage;
   }
   
   public void draw(Graphics g, int x, int y){
	   
	   if(type == 1)
		   g.setColor(Color.green);
	   if(type == 2)
		   g.setColor(Color.yellow);
	   if(type == 3)
		   g.setColor(Color.red);
	   
	   super.draw(g, x, y);
   }
}
