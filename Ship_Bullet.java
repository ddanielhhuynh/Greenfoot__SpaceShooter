import greenfoot.*;

/**
 * Write a description of class Ship_Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship_Bullet extends Actor
{
    /**
     * Act - do whatever the Ship_Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed = 10;
    
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
        setLocation(getX(),getY()-speed);
        if(canSee(Aliens.class))
        {
            eat(Aliens.class);
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
        else if(getY()+750==getWorld().getWidth()) {
            getWorld().removeObject(this);
        }
    }    
}
