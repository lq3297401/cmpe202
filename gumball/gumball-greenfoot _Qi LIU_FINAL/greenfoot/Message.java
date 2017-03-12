import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * CMPE 202, original file from professor Paul
 * @author Qi LIU 
 * @version 3/9/2017
 */
public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage gi;
    public Message()
    {
        gi = new GreenfootImage(100,50);
        setImage(gi);
    }
    
    public void setText(String msg)
    {
        gi.clear();
        gi.setColor(greenfoot.Color.YELLOW);
        gi.fill();
        gi.setColor(greenfoot.Color.BLACK);
        gi.drawString(msg,0,25);
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            World world = getWorld();
            world.removeObject(this);
        }
    }    
}
