import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pepa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pepa extends Actor
{
    int rychlost = 5;
    /**
     * Act - do whatever the Pepa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if(mi!=null)
        {
          int mysX = mi.getX();
          int mysY = mi.getY();
          
          
          turnTowards(mysX, mysY);
          move(rychlost);
        }
    }
}
