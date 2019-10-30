import greenfoot.*;

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int count = 1;
    public int speed = 4;
    public void act() 
    {
        count--;
        if(count == 0){
            getWorld().addObject(new FireTrail(), getX()+10, getY());
            count=2;
        }
        move(speed*-1);
        if(getX()==0) {
            getWorld().removeObject(this);

        }
    }    
}
