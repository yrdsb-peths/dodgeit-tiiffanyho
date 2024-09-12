import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lemon extends Actor
{
    public void act()
    {
        // Add your action code here.
        move(-10);
        
        if(getX() <=0)
        {
            resetLemon();
        }
        
        if(isTouching(Hero.class))
        {
            // Add a gameover symbol
            Face face = new Face();
            getWorld().addObject(face, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetLemon()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600, 100);
        }
        else
        {
            setLocation(600, 300);
        }
        
        
    }
}
