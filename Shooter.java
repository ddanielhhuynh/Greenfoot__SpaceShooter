import greenfoot.*;

/**
 * Write a description of class Shooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shooter extends Actor
{
    /**
     * Act - do whatever the Shooter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    
   
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-12);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(12);
        }
        
    }
    public void act()
    {
     checkKeys();
    }
}
