package entity;

import java.awt.Color;
import java.awt.Graphics;

/**
*
* @author Tolga
*/
public class Workshop extends Building {
   protected int yield;
   protected int type;
   
   
   public Workshop(int shopType){
       type = shopType;
       if(shopType == 1)
       {
           hitpoint = 10;
           yield = 1;
           energyCost = 0;
       }
       if(shopType == 2)
       {
           hitpoint = 50;
           yield = 10;
           energyCost = 10;
       }
       if(shopType == 3)
       {
           hitpoint = 100;
           yield = 20;
           energyCost = 20;
       }
       
   }
   
   
   public void setYield(int yield){
       this.yield = yield;
   }
   public int getYield(){
       return yield;
   }
   
public void draw(Graphics g, int x, int y){
	   
	   if(type == 1)
		   g.setColor(Color.cyan);
	   if(type == 2)
		   g.setColor(Color.blue);
	   if(type == 3)
		   g.setColor(Color.black);
	   
	   super.draw(g, x, y);
   }
}
