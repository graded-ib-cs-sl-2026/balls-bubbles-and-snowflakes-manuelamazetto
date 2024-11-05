
class Snowflake {
    // ONLY THE DRAW METHOD IS INCLUDED. YOU MUST FINISH THE REST.
    private Sketch s;
    private float radius;
    private float x;
    private float y;
    private float xSpeed;
    private float ySpeed;
    private int strokeColor;

    public Snowflake(Sketch sketch){
        s = sketch;
        radius = 20;
        x = 100;
        y = 100;
        xSpeed = 2;
        ySpeed = -1;
        strokeColor = s.color(0, 0, 0);
    
    }

    public Snowflake(Sketch sketch, float radius, float x, float y, float xSpeed, float ySpeed){
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
       

    }
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
public void setColors(int border) {
    strokeColor = border;
}

    public void draw() {
        s.stroke(strokeColor);
        s.line(x + radius, y, x - radius, y);
        s.line(x, y + radius, x, y - radius);
        s.line(x + radius * .707f, y + radius * .707f,
               x - radius * .707f, y - radius * .707f);
        s.line(x + radius * .707f, y - radius * .707f,
               x - radius * .707f, y + radius * .707f);

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
}boolean isClicked(float mx, float my){
    return x + radius >= mx && x - radius <= mx && y + radius >= my && y - radius <= my;
}
}

