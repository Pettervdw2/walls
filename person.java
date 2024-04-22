import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class person extends Actor
{
    /**
     * Act - do whatever the person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        checkKeyboard();
    }
    public person()
    {
        //getImage().scale(50, 50);
    }
    public void checkKeyboard()
    {
        boolean key=Greenfoot.isKeyDown("right");
        if(key==true) {
            setLocation(getX()+2, getY());
            if(isTouching(Wall.class)){
                setLocation(getX()-4, getY());
        }}
        key=Greenfoot.isKeyDown("left");
        if(key==true) {
            setLocation(getX()-2, getY());
            if(isTouching(Wall.class)){
                setLocation(getX()+4, getY());
        }}
        key=Greenfoot.isKeyDown("up");
        if(key==true) {
            setLocation(getX(), getY()-2);
            if(isTouching(Wall.class)){
                setLocation(getX(), getY()+4);
        }}
        key=Greenfoot.isKeyDown("down");
        if(key==true) {
            setLocation(getX(), getY()+2);
            if(isTouching(Wall.class)){
                setLocation(getX(), getY()-4);
        }
        
    }}
}

