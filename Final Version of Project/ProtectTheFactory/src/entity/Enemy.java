package entity;

import java.awt.Point;

public class Enemy {
    
    protected int damage;
    protected int hitpoint;
    Point p;
    int enemyType;
    
    public Enemy(int level){
        enemyType = 1;
        if(enemyType == 1)
        {
            damage = 20;
            hitpoint = 20;
        }
        if(enemyType == 2)
        {
            damage = 50;
            hitpoint = 50;
        }
        if(enemyType == 3)
        {
            damage = 100;
            hitpoint = 100;
        }        
       // setLocation(l.startingLocation());
    }
    public void move()
    {
        
        
    }
    
    public void getDamaged(int dmg){       
        hitpoint = hitpoint-dmg;
    }
    
    public boolean isAlive(){
        if(getHealthP() > 0)
            return true;
        else
            return false;
    }
    public int attack(boolean collision)
    {
        if(collision && isAlive())
            return damage;
        else
            return 0;
    } 
    public void destroy(){
        hitpoint = 0;
        damage = 0;
    }
    public int getPosX(){
        return p.x;
    }
    public int getPosY()
    {
        return p.y;
    }
    public void setLocation(Point p)
    {
        this.p.setLocation(p);
    }
    public int getHealthP(){
        return hitpoint;
    }
}
