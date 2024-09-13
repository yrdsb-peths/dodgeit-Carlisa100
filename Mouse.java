import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mouse extends Actor
{
    /**
     * Act - do whatever the Mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setRotation(270);
        move(10);
        
        if(isAtEdge())
        {
            resetMouse();
        }
        if(isTouching(Bear.class))
        {
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
        
    }
    
    public void resetMouse()
    {
        int num = Greenfoot.getRandomNumber(2);
        int randomX = Greenfoot.getRandomNumber(400);
        if(num == 0)
        {
            setLocation(randomX, 350);
        }
        
    }
}
