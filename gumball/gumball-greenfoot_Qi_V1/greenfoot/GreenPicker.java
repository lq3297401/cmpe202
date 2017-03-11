import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * CMPE 202, original file from professor Paul
 * @author Qi LIU 
 * @version 3/9/2017
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Message m = new Message();
    
    public void setMessage(String msg)
    {
        int mouseX, mouseY;
        MouseInfo mouse = Greenfoot.getMouseInfo();
        mouseX = mouse.getX();
        mouseY = mouse.getY();
        World world = getWorld();
        if(m.getWorld() != null){
            world.removeObject(m);
        }
        world.addObject(m,mouseX,mouseY);
        m.setText(msg);
    }
    
    public void pick() 
    {
        // Add your action code here.
        World world = getWorld();
        Gumball gb = new GreenGumball();
        world.addObject(gb, 500, 500);
        setMessage(gb.getClass().getName());
    }    
}
