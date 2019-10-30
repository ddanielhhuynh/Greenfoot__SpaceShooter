import greenfoot.*;

/**
 * Write a description of class NoteBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoteBackground extends World
{

    /**
     * Constructor for objects of class NoteBackground.
     * 
     */
    
    public NoteBackground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 800, 1); 

        prepare();
    }
    public int specialAmmo = 0;
    public boolean isPressed;
    public boolean isSpecialPressed;
    public int spawnLoc = 100;
    public int score = 6;
    public void act()
    {
        if(getObjects(EndScreen.class).size()==1)
        {
            if(Greenfoot.isKeyDown("r"))
            { 
                Greenfoot.setWorld(new NoteBackground());
            }
        }
        if(Greenfoot.getRandomNumber(200) < 2)
        {
            addObject(new Asteroid(), getWidth(), Greenfoot.getRandomNumber(525) + 100 );
            addObject(new Wood(), getWidth(), Greenfoot.getRandomNumber(525) + 100 );
        }   
        if(Greenfoot.mouseClicked(null))
        {
            addObject((Ship_Bullet) new Ship_Bullet(),(((Shooter) getObjects(Shooter.class).get(0)).getX()+5),((Shooter) getObjects(Shooter.class).get(0)).getY()-20);
            Greenfoot.playSound("punch.mp3");
        }
        if(Greenfoot.isKeyDown("space"))
        {
            isPressed = true;
        }
            if(isPressed == true && !Greenfoot.isKeyDown("space"))
            {
            addObject(new Alien_Normal_Bullet(),(((Aliens) getObjects(Aliens.class).get(0)).getX()+5),((Aliens) getObjects(Aliens.class).get(0)).getY()+20);
            Greenfoot.playSound("punch.mp3");
            isPressed = false;
        }
        if(Greenfoot.isKeyDown("S"))
        {
            isSpecialPressed = true;
        }
            if(isSpecialPressed == true && !Greenfoot.isKeyDown("S") && specialAmmo <= 5)
            {
            for(int cnt = 0; cnt < 6; cnt++)
            {
            addObject(((Alien_Special_Bullet) new Alien_Special_Bullet()),(((Aliens) getObjects(Aliens.class).get(0)).getX()+5),((Aliens) getObjects(Aliens.class).get(0)).getY()+20);
            isSpecialPressed = false;
            }
            Greenfoot.playSound("can.mp3");
            score = score - 1;
            showText("Special Ammo: " + score, 100, 100);
            specialAmmo++;
        }
        }
       

    private void prepare()
    {

        //Shooter shooter = new Shooter();
        // addObject(shooter, 311, 345);
        // shooter.setLocation(400, 831);
        Shooter shooter2 = new Shooter();
        addObject(shooter2, 413, 749);
        Aliens aliens = new Aliens();
        addObject(aliens, 411, 18);
    }
    
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
   

