import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    boolean atTop = true;
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(null))
        {
            atTop = !atTop;
        }
        
        if(atTop)
        {
            setLocation(100, 100);
        } 
        else
        {
            setLocation(100, 300);
        }
    }
}
