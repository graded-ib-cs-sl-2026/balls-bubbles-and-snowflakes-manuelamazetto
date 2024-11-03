import processing.core.PApplet;

public class Sketch extends PApplet {

    /** Represents one ball */
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Bubble bubble1;
    private Bubble bubble2; 
    private Bubble bubble3;
    private Bubble bubble4;
    private Snowflake snowflake1;
    private Snowflake snowflake2;
    private Snowflake snowflake3;
    private Snowflake snowflake4;
    private int p = 0;

    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500, 500);
    }

    /**
     * Runs once at the beginning of the program, after the window is created. Use
     * this to initialize the sketch.
     */
    public void setup() {
        ball1 = new Ball(this);
        ball1.setColors(color(127, 0,0), 0);
        ball2 = new Ball(this, 20, 30, 450, -3, 3);
        ball2.setColors(color (159, 121, 212), 0);
        ball3 = new Ball(this, random(4, 30), random(0, 500), random(0, 500), random (-10, 10), random (-10, 10));
        ball3.setColors(color (random(0, 255), random(0, 255), random(0, 255)), 0);
        ball4 = new Ball(this, random(4, 30), random(0, 500), random(0, 500), random (-10, 10), random (-10, 10));
        ball4.setColors(color (random(0, 255), random(0, 255), random(0, 255)), 0);

        bubble1 = new Bubble(this, random(4, 30), random(0, 500), random(0, 500), random(-5, 5), -random (1, 5));
        bubble1.setColors (0x00ffffff, 0); 
        bubble2 = new Bubble(this, random(4, 30), random(0, 500), random(0, 500), random(-5, 5), -random (1, 5));
        bubble2.setColors(0x00ffffff, 0);
        bubble3 = new Bubble(this, random(4, 30), random(0, 500), random(0, 500), random(-5, 5), -random (1, 5));
        bubble3.setColors(0x00ffffff, 0);
        bubble4 = new Bubble(this, random(4, 30), random(0, 500), random(0, 500), random(-5, 5), -random (1, 5));
        bubble4.setColors(0x00ffffff, 0);

        snowflake1 = new Snowflake(this, random (4, 23), random (0, 500), random(0, 500), random (-5, 5), random(-5, -1));
        snowflake1.setColors(color (random(0, 255), random(0, 255), random(0,255)));
        snowflake2 = new Snowflake(this, random (4, 23), random (0, 500), random(0, 500), random (-5, 5), random(-5, -1));
        snowflake2.setColors(color (random(0, 255), random(0, 255), random(0,255)));
        snowflake3 = new Snowflake(this, random (4, 23), random (0, 500), random(0, 500), random (-5, 5), random(-5, -1));
        snowflake3.setColors(color (random(0, 255), random(0, 255), random(0,255)));
        snowflake4 = new Snowflake(this, random (4, 23), random (0, 500), random(0, 500), random (-5, 5), random(-5, -1));
        snowflake4.setColors(color (random(0, 255), random(0, 255), random(0,255)));
    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        background(180, 180, 255);
        ball1.draw();
        ball1.move();
        ball2.draw();
        ball2.move();
        ball3.draw();
        ball3.move();
        ball4.draw();
        ball4.move();
        
        bubble1.draw();
        bubble1.move();
        bubble2.draw(); 
        bubble2.move();
        bubble3.draw(); 
        bubble3.move();
        bubble4.draw(); 
        bubble4.move();

        snowflake1.draw();
        snowflake1.move();
        snowflake2.draw();
        snowflake2.move();
        snowflake3.draw();
        snowflake3.move();
        snowflake4.draw();
        snowflake4.move();


    if (mouseX == x.ball1 && mouseY == y.ball1) {
        p = p + 2;
    }else {

    }
    }
    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}

