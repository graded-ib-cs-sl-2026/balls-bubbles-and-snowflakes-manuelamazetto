

class Bubble {



    private Sketch s; 
    private float radius; //the radius of the bubble (as it's built as a ball)
    private float x; //the x position it's on in the world
    private float y; //the y position it's on in the world
    private float xSpeed; //the speed at which it's moving on the x plane
    private float ySpeed; //the speed at which it's moving on the y plane
    private int fillColor; //the color on the inside of the bubble
    private int borderColor; //the color on the outside (outline) of the bubble
    /* This sets up all the parameters for the object bubble. So, radius, x, y, xSpeed, ySpeed, 
    etc are all parameters within the object bubble and they control the characteristics about 
    the object bubble. The characteristics they each control are shown above*/

    public Bubble(Sketch sketch){
        s = sketch;
        radius = 20;
        x = 100;
        y = 100;
        xSpeed = 2;
        ySpeed = -1;
        fillColor = 0x00ffffff;
        borderColor = s.color(0, 0, 0);
        /* This creates the bubble as a set object, with set parameters. Later on, there will
         * be the chance to change these as pleased */
    }

    /** Here is the part of the code that lets the parameters of the object Bubble be set when
       the object Bubble is intitialized. Per bubble object created, the parameters can be changed
       as needed, without ever having to edit this original code. */
    public Bubble(Sketch sketch, float radius, float x, float y, float xSpeed, float ySpeed){
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }
    /** This is used in Sketch, when the bubble is spressed, the method "change parameters" will be
         * called and it allows the parameters in the object ball to be changed after they've been 
         * initially set. I got the idea to do this from the method changeColors which allows the colors 
         * to be changed despite not being in the original parameters for the bubble object code. */
    public void changeParameters(float x, float y){
        this.x = x;
        this.y = y;
        
    }


 public float getRadius() {
    return radius;
}

public float getDiameter() {
    return radius * 2;
}

public float getX() {
    return x;
}

public float getY() {
    return y;
}
/** This will later on be used to change the colors of the bubble right after it's been set 
    up and initiliazed in the sketch part of the code  */
public void setColors(int fill, int border) {
    borderColor = border;
    fillColor = fill;
    
}
/** This draw the bubble with the previous information we have. */
public void draw() {
    s.stroke(borderColor);
    s.fill(fillColor);
    s.circle(x, y, radius*2);
   
}

public void move() {
    x = x + xSpeed;
    y = y + ySpeed;
    if (x > s.width - radius) {
        x = radius;
    } else if(x < radius) {
        x = s.width - radius;
    } else if (y > s.height - radius) {
        y = radius;
    } else if (y < radius) {
        y = s.height - radius;
    }
   
}
 /** This makes it so if the mouse is clicked, it will track the position of the mouse and where
    it's been clicked. Then, if the position is within the position of x or y (and plus or minus it's
    radius on both sides, because that way you don't have to click exactly on x and y to get the point),
    the game will award you a point. I got the idea to create a boolean saying if it's been clicked from
    ChatGPT but the return part I figured out on my own and in the Sketch part, I applied the boolean 
    with my own knowledge, not copying off of ChatGPT. */
boolean isClicked(float mx, float my){
    return x + radius >= mx && x - radius <= mx && y + radius >= my && y - radius <= my;
    
}
}

