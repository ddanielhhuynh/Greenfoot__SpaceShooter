import greenfoot.*;

/**
 * Write a description of class Wood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wood extends Actor
{
    /**
     * Act - do whatever the Wood wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed = 2;
    public void act() 
    {
        move(speed*-1);
        if(getX()==0) {
            getWorld().removeObject(this);
        }
    }    
}
