

class Bubble {



    private Sketch s;
    private float radius;
    private float x;
    private float y;
    private float xSpeed;
    private float ySpeed;
    private int fillColor;
    private int borderColor;

    public Bubble(Sketch sketch){
        s = sketch;
        radius = 20;
        x = 100;
        y = 100;
        xSpeed = 2;
        ySpeed = -1;
        fillColor = 0x00ffffff;
        borderColor = s.color(0, 0, 0);
    }

    public Bubble(Sketch sketch, float radius, float x, float y, float xSpeed, float ySpeed){
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
       

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
public void setColors(int fill, int border) {
    borderColor = border;
    fillColor = fill;
}

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
}

