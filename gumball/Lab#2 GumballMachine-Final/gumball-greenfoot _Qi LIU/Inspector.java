import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Inspector here.
 * CMPE 202, original file from professor Paul
 * @author Qi LIU
 * @version 3/9/2017
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private ArrayList<Picker> pickers = new ArrayList<Picker>();
    Message m = new Message();
    Coin haveCoin = null;
    
    public void setMessage(String msg){
        int mouseX, mouseY;
        MouseInfo mouse = Greenfoot.getMouseInfo();
        mouseX = mouse.getX();
        mouseY = mouse.getY();
        World world = getWorld();
        if(m.getWorld() != null){
           world.removeObject(m);
        }
        world.addObject(m, mouseX, mouseY);
        m.setText(msg);
    }
    
    public void addPicker(Picker obj){
        pickers.add(obj);
    }
    
    public void removePicker(Picker obj){
        pickers.remove(obj);
    }
    
    public void inspect(Coin coin)
    {
        // Add your action code here.
        System.out.println("Coin: " + coin.getClass());
        setMessage(coin.getClass().getName());
        int whichPicker = Greenfoot.getRandomNumber(pickers.size());
        Picker pickerChosen = pickers.get(whichPicker);
        System.out.println("Picker: " + pickerChosen.getClass());
        if(coin.getClass() == Quarter.class)
            pickerChosen.pick();
    }    
}
