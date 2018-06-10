import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Actor
{
    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage[] images=new GreenfootImage[8];
    private int jeda=10, num=0, deltax=30;
    
    public void addedToWorld(World MyWorld)
    {
        for(int i=0; i<images.length; i++)
        {
            images[i]=new GreenfootImage(i+".png.png");
        }
        setImage(images[0]);
    }
    
    public void act() 
    {
        if(jeda==0) jeda=10;
        if(jeda==1)
        {
            setImage(images[num]);
            num++;
            if(num>=images.length) num=0;
            //setLocation(getX()+deltax, getY());
            //if(getX()>getWorld().getWidth()+100) setLocation(-100, getY());
        }
        if(jeda>0)jeda--;
        //getWorld().removeImage(getWorld().getGreenfootImage(i+".png.png"));
    }    
}
