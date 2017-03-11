import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Quarter here.
 * CMPE 202, original file from professor Paul
 * @author Qi LIU
 * @version 3/9/2017
 */
public class Quarter extends Coin
{

    public Quarter()
    {
        GreenfootImage image = getImage() ;
        image.scale( 80, 80 ) ;
        this.value = 25;         
    }

}
