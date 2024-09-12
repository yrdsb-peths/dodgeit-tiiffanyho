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
