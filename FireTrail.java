  import greenfoot.*;

/**
 * Write a description of class FireTrail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireTrail extends Actor
{
    /**
     * Act - do whatever the FireTrail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image = getImage();
    public int fade;
    public void act() 
    {
        shrink();
    }
    public void shrink()
    {
        fade = Greenfoot.getRandomNumber(8)+ 1;
        if(fade > 3)
        {
            fade = fade - 2;
        }
        if(getImage().getWidth() < 10)
        {
            getWorld().removeObject(this);
        }
        else{
           image.scale(getImage().getWidth()-fade, getImage().getHeight()-fade);
           setImage(image);
        }
    }
}
