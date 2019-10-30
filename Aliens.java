import greenfoot.*;

/**
 * Write a description of class Aliens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aliens extends Actor
{
    /**
     * Act - do whatever the Aliens wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
        }
       
    }
    public void act() 
    {
        checkKeys();
    }
}
