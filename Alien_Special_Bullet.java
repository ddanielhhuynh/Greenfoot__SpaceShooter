import greenfoot.*;

/**
 * Write a description of class Alien_Special_Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien_Special_Bullet extends Actor
{
    /**
     * Act - do whatever the Alien_Special_Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed = 8;
    
    
    
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
        }
        else if(canSee(Asteroid.class))
        {
            eat(Asteroid.class);
        }
        else if(canSee(Ship_Bullet.class))
        {
            eat(Ship_Bullet.class);
        }
        else if(getY()>getWorld().getWidth()-speed) {
            getWorld().removeObject(this);
        }
    }    
}
