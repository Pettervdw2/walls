import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int score=0;
    private Label myScore=new Label("Score: "+score,30);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(myScore, 300, 50);
        Wall wall = new Wall();
        addObject(wall,25,75);
        Wall wall2 = new Wall();
        addObject(wall2,100,100);
        person person = new person();
        addObject(person,279,340);
        apple apple = new apple();
        addObject(apple,368,191);
        apple apple2 = new apple();
        addObject(apple2,428,190);
    }

}
