
import processing.core.PApplet;

public class Sketch extends PApplet {

    /*
     * This just creates all of the objects so they can be referenced later on in
     * the code
     */
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
    int score = 0; // this is the int for score
    int time = 0; // this is the int for time

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
        background(180, 180, 255);
           
         /** this creates up the object ball with numbers in the parameters that had been
         * set up in the ball constructer*/
        ball1 = new Ball(this);
         /**
         * this gives the options to change the colors as the method that had been
         * set up in ball.
         */
        ball1.setColors(color(127, 0, 0), 0);
        ball2 = new Ball(this, 20, 30, 450, -3, 3);
        ball2.setColors(color(159, 121, 212), 0);
        ball3 = new Ball(this, random(4, 30), random(0, 500), random(0, 500), random(-10, 10), random(-10, 10));
        /*
         * I set it up so the options are random, so it could be any number
         * between the options given in random. I figured this out from JavaScript,
         * since it's the exact same. I like this because it adds variety to the game,
         * so it's not the exact same
         * program every time you run it. I also did the same thing for the colors
         * below, so the color will randomize every time you press play.
         */
        ball3.setColors(color(random(0, 255), random(0, 255), random(0, 255)), 0);
        ball4 = new Ball(this, random(4, 30), random(0, 500), random(0, 500), random(-10, 10), random(-10, 10));
        ball4.setColors(color(random(0, 255), random(0, 255), random(0, 255)), 0);

        bubble1 = new Bubble(this, random(4, 30), random(0, 500), random(0, 500), random(-5, 5), -random(1, 5));
        bubble1.setColors(0x00ffffff, 0);
        bubble2 = new Bubble(this, random(4, 30), random(0, 500), random(0, 500), random(-5, 5), -random(1, 5));
        bubble2.setColors(0x00ffffff, 0);
        bubble3 = new Bubble(this, random(4, 30), random(0, 500), random(0, 500), random(-5, 5), -random(1, 5));
        bubble3.setColors(0x00ffffff, 0);
        bubble4 = new Bubble(this, random(4, 30), random(0, 500), random(0, 500), random(-5, 5), -random(1, 5));
        bubble4.setColors(0x00ffffff, 0);

        snowflake1 = new Snowflake(this, random(4, 23), random(0, 500), random(0, 500), random(-5, 5), random(-5, -1));
        snowflake1.setColors(color(random(0, 255), random(0, 255), random(0, 255)));
        snowflake2 = new Snowflake(this, random(4, 23), random(0, 500), random(0, 500), random(-5, 5), random(-5, -1));
        snowflake2.setColors(color(random(0, 255), random(0, 255), random(0, 255)));
        snowflake3 = new Snowflake(this, random(4, 23), random(0, 500), random(0, 500), random(-5, 5), random(-5, -1));
        snowflake3.setColors(color(random(0, 255), random(0, 255), random(0, 255)));
        snowflake4 = new Snowflake(this, random(4, 23), random(0, 500), random(0, 500), random(-5, 5), random(-5, -1));
        snowflake4.setColors(color(random(0, 255), random(0, 255), random(0, 255)));

    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
         /*
         * frameCount divided by frameRate equals one second, so by setting time
         * as equal to that, it'll go up as the frameRate does
         */
        time = (int) (frameCount / frameRate);
        if (time <= 60) {
            background(180, 180, 255); // creates the background with those colors
            fill(0); // makes the new future fill color 0 (aka black)
            textSize(20); // makes the new future text size 20
              /*
             * creates text that says score and time which then tell you the score and time
             * at the set coordinates
             */
            text("Score: " + score, 10, 30);
            text("Time: " + time, 420, 30);
            ball1.draw();
            ball1.move();
            ball2.draw();
            ball2.move();
            ball3.draw();
            ball3.move();
            ball4.draw();
            ball4.move();
            /*
             * this sets up the draw and move command for each ball. Later on, it's for all
             * the objects.
             */
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

        } 
         /*
             * Now, if the time is above 61 seconds (not 60 because it was glitching, since
             * it would be 60 for both and the screens would move back and forth), the game
             * will be over and the information + option to replay will be given
             */
            else if (time >= 61) {
            background(255, 255, 255);
            /*
             * background over moving objects. They're not actually gone, you just can't see
             * them anymore
             */
            fill(180, 180, 255);
            stroke(180, 180, 255);
            rect(130, 200, 250, 100);
            fill(0, 0, 0);
            text("You got " + score + " points", 185, 230);
            text("Thanks for playing", 175, 250);
            text("Type space to play again", 150, 270);
            /*
             * Text prints out the necessary information for the user, so they can make a
             * decision depending on what they want
             */

             /**
                 * Now, the if statement will detect if the space key is pressed and if the time
                 * is over 61 seconds (because or else, the game would be reset halfway through,
                 * if someone pressed the space button)
                 */
            if (keyPressed && key == ' ' && time >= 61) {
                 /*
                 * This calls the method set up below, that will reset all the parameters
                 * previously established. There isn't a more efficient way to do this, since
                 * setup and draw can only be called once.
                 */
                restartGame();
                time = 0;
                  /*
                 * both time and frameCount are on here because when it was just time, it wasn't
                 * working and kept glitching.
                 */
                frameCount = 0;
                score = 0; // resets score to zero
            }
        }

    }

    public void mousePressed() {
        if (ball1.isClicked(mouseX, mouseY)) {
            score = score + 1;
              /*
             * This makes it so if you press on the ball (as the previous method set up in
             * ball, bubble and snowflake), you'll get one point. It also means the ball
             * will then reappear in another place in the world, to make it more challenging
             * for the user
             */
            ball1.changeParameters(random(0, 500), random(0, 500));
        } else if (ball2.isClicked(mouseX, mouseY)) {
            score = score + 1;
            ball2.changeParameters(random(0, 500), random(0, 500));
        } else if (ball3.isClicked(mouseX, mouseY)) {
            score = score + 1;
            ball3.changeParameters(random(0, 500), random(0, 500));
        } else if (ball4.isClicked(mouseX, mouseY)) {
            score = score + 1;
            ball4.changeParameters(random(0, 500), random(0, 500));
        } else if (bubble1.isClicked(mouseX, mouseY)) {
            score = score + 2;
            bubble1.changeParameters(random(0, 500), 490);
        } else if (bubble2.isClicked(mouseX, mouseY)) {
            score = score + 2;
            bubble2.changeParameters(random(0, 500), 490);
        } else if (bubble3.isClicked(mouseX, mouseY)) {
            score = score + 2;
            bubble3.changeParameters(random(0, 500), 490);
        } else if (bubble4.isClicked(mouseX, mouseY)) {
            score = score + 2;
            bubble4.changeParameters(random(0, 500), 490);
              /*
             * I made it so the snowflakes give you minus points so the user can't just
             * randomly press on the screen as they please. It just makes the game a little
             * harder because you can lose points.
             */
        } else if (snowflake1.isClicked(mouseX, mouseY)) {
            score = score - 1;
            snowflake1.changeParameters(random(0, 500), 10);

        } else if (snowflake2.isClicked(mouseX, mouseY)) {
            score = score - 1;
            snowflake2.changeParameters(random(0, 500), 10);
        } else if (snowflake3.isClicked(mouseX, mouseY)) {
            score = score - 1;
            snowflake3.changeParameters(random(0, 500), 10);
        } else if (snowflake4.isClicked(mouseX, mouseY)) {
            score = score - 1;
            snowflake4.changeParameters(random(0, 500), 10);
        }
    }
  /**
         * This will restart the game once it's called upon, by the if statement above.
         * It's almost exactly the same as the setup method but since that can't be
         * called on twice, you have to do this instead. I remember learning about this
         * from JavaScript, where we had to do something similar. The only difference
         * between this and the setUp method is that it also resets the time to 0. It's
         * already been reset to 0 before, but just in case, because it has been quite
         * finicky.
         */
    private void restartGame() {
      
        time = 0;
        background(180, 180, 255);
        ball1 = new Ball(this);
        ball1.setColors(color(127, 0, 0), 0);
        ball2 = new Ball(this, 20, 30, 450, -3, 3);
        ball2.setColors(color(159, 121, 212), 0);
        ball3 = new Ball(this, random(4, 30), random(0, 500), random(0, 500), random(-10, 10), random(-10, 10));
        ball3.setColors(color(random(0, 255), random(0, 255), random(0, 255)), 0);
        ball4 = new Ball(this, random(4, 30), random(0, 500), random(0, 500), random(-10, 10), random(-10, 10));
        ball4.setColors(color(random(0, 255), random(0, 255), random(0, 255)), 0);

        bubble1 = new Bubble(this, random(4, 30), random(0, 500), random(0, 500), random(-5, 5), -random(1, 5));
        bubble1.setColors(0x00ffffff, 0);
        bubble2 = new Bubble(this, random(4, 30), random(0, 500), random(0, 500), random(-5, 5), -random(1, 5));
        bubble2.setColors(0x00ffffff, 0);
        bubble3 = new Bubble(this, random(4, 30), random(0, 500), random(0, 500), random(-5, 5), -random(1, 5));
        bubble3.setColors(0x00ffffff, 0);
        bubble4 = new Bubble(this, random(4, 30), random(0, 500), random(0, 500), random(-5, 5), -random(1, 5));
        bubble4.setColors(0x00ffffff, 0);

        snowflake1 = new Snowflake(this, random(4, 23), random(0, 500), random(0, 500), random(-5, 5), random(-5, -1));
        snowflake1.setColors(color(random(0, 255), random(0, 255), random(0, 255)));
        snowflake2 = new Snowflake(this, random(4, 23), random(0, 500), random(0, 500), random(-5, 5), random(-5, -1));
        snowflake2.setColors(color(random(0, 255), random(0, 255), random(0, 255)));
        snowflake3 = new Snowflake(this, random(4, 23), random(0, 500), random(0, 500), random(-5, 5), random(-5, -1));
        snowflake3.setColors(color(random(0, 255), random(0, 255), random(0, 255)));
        snowflake4 = new Snowflake(this, random(4, 23), random(0, 500), random(0, 500), random(-5, 5), random(-5, -1));
        snowflake4.setColors(color(random(0, 255), random(0, 255), random(0, 255)));

    }

    /** All processing sketches have to use this main method. Don't touch this :) */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
