import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * CMPE 202, original file from professor Paul
 * @author Qi LIU
 * @version 3/9/2017
 */
public class Coin extends Actor
{
   //private int value;
   int value;
   public int getValue()
   {
     return this.value;
   }

   public void  inSlot()
   {
     World world = getWorld();
     world.removeObject(this);
   }

    public void act()
    {
        int mouseX, mouseY ;

        if(Greenfoot.mouseDragged(this)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            mouseX=mouse.getX();
            mouseY=mouse.getY();
            setLocation(mouseX, mouseY);
        }
    }
}
