import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class GumballMachine here.
 * CMPE 202, original file from professor Paul
 * @author Qi LIU
 * @version 3/9/2017
 */
public class GumballMachine extends Actor
{
    Message m = new Message();
    Coin haveCoin = null;

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale(350, 400 ) ;
    }

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

    public void choosePicker(){

      World world = getWorld();
      List<GreenPicker> grePicker = world.getObjects(GreenPicker.class);
      List<RandomPicker> ranPicker = world.getObjects(RandomPicker.class);

      int result = Greenfoot.getRandomNumber(2);
      if(result == 0)//green picker
      {
        Picker picker_0 = grePicker.remove(0);
        setMessage("Green Picker!");
        picker_0.pick();
        picker_0.move(-100);

      }
      else//random picker
      {
        Picker picker_1 = grePicker.remove(0);
        setMessage("Random Picker!");
        picker_1.pick();
        picker_1.move(100);
      }
      resetGumballMachine();
    }

    public void resetGumballMachine()
    {
      World world = getWorld();
      //remove message
      if(m.getWorld() != null){
          world.removeObject(m);
      }
      List<Gumball> gamb = world.getObjects(Gumball.class);
      for(Gumball a: gamb){
          world.removeObject(a);
      }
    }


    public void act()
    {
        // Add your action code here.
    if(Greenfoot.mousePressed(this)){
      if(haveCoin == null) {
        setMessage("No Coin in Slot!");
        resetGumballMachine();
      }

      else {//coin in slot,check it
        if(haveCoin.getValue() == 0) // fake
        {
          setMessage("Fake Coin!");
          resetGumballMachine();
        }
        else if(haveCoin.getValue() == 1) //penny
        {
          setMessage("Not Enough Money!");
          resetGumballMachine();
        }
        else// real quarter
        {
          setMessage("Real Quarter!");
          setMessage("Crank Turned!");
          choosePicker();
          resetGumballMachine();
        }
      }
    }
    Actor coin = getOneObjectAtOffset(+10, +10, Coin.class);
    if(coin != null)
    {
      if(haveCoin != null)
      {
        coin.move(-300);
      }
      else
      {
        haveCoin = (Coin)coin;
        setMessage("Have Coin!");
        ((Coin)coin).inSlot();
      }
    }
  }
}
