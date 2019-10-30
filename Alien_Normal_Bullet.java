import greenfoot.*;

/**
 * Write a description of class Alien_Normal_Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien_Normal_Bullet extends Actor
{
    /**
     * Act - do whatever the Alien_Normal_Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed = 13;
    
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;
    }
    
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
    
    public void act() 
    {
        setLocation(getX(),getY()+speed);
        if(canSee(Shooter.class))
        {
            eat(Shooter.class);
            getWorld().addObject(new EndScreen(), 380, 380);
        }
        else if(canSee(Wood.class))
        {
            eat(Wood.class);
            getWorld().removeObject(this);
        }
        else if(canSee(Asteroid.class))
        {
            getWorld().removeObject(this);
        }
        else if(getY()>getWorld().getWidth()-speed) {
            getWorld().removeObject(this);
        }
    }
}
