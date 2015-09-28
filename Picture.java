/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square upperhalf;
    private Square middle;
    private Square lowerhalf;
    private Triangle roof;
    private Circle ground;
    private Person blueguy;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        upperhalf = new Square();
        upperhalf.changeColor("black");
        upperhalf.moveHorizontal(210);
        upperhalf.moveVertical(60);
        upperhalf.changeSize(60);
        upperhalf.makeVisible();
        
        middle = new Square();
        middle.changeColor("black");
        middle.moveHorizontal(210);
        middle.moveVertical(120);
        middle.changeSize(60);
        middle.makeVisible();
        
        lowerhalf = new Square();
        lowerhalf.changeColor("black");
        lowerhalf.moveHorizontal(210);
        lowerhalf.moveVertical(180);
        lowerhalf.changeSize(60);
        lowerhalf.makeVisible();

        roof = new Triangle();  
        roof.changeColor("black");
        roof.changeSize(60, 70);
        roof.moveHorizontal(240);
        roof.moveVertical(0);
        roof.makeVisible();

        ground = new Circle();
        ground.changeColor("green");
        ground.moveHorizontal(-250);
        ground.moveVertical(230);
        ground.changeSize(1000);
        ground.makeVisible();
        
        blueguy = new Person();
        blueguy.changeColor("blue");
        blueguy.changeSize(60, 30);
        blueguy.moveHorizontal(280);
        blueguy.moveVertical(190);
        blueguy.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (upperhalf != null)   // only if it's painted already...
        {
            upperhalf.changeColor("black");
            middle.changeColor("black");
            lowerhalf.changeColor("black");
            roof.changeColor("black");
            ground.changeColor("black");
            blueguy.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (upperhalf != null)   // only if it's painted already...
        {
            upperhalf.changeColor("black");
            middle.changeColor("black");
            lowerhalf.changeColor("black");
            roof.changeColor("black");
            ground.changeColor("green");
            blueguy.changeColor("blue");
        }
    }
}
