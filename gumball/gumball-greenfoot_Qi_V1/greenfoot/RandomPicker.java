import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;
/**
 * Write a description of class RandomPicker here.
 * CMPE 202, original file from professor Paul
 * @author Qi LIU
 * @version 3/9/2017
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
        Gumball gb = new GreenGumball();
        int lottery = Greenfoot.getRandomNumber(3);
        switch(lottery)
        {
            case 0: gb = new BlueGumball(); break;
            case 1: gb = new RedGumball(); break;
            case 2: gb = new GreenGumball(); break;
        }
        World world = getWorld();
        world.addObject(gb, 500, 500);
        setMessage(gb.getClass().getName());
    }
}
