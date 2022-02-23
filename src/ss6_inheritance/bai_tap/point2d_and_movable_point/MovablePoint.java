package ss6_inheritance.bai_tap.point2d_and_movable_point;


public class MovablePoint extends Point {
    protected float xSpeed;
    protected float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};

    }

    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + ",speed=(" + xSpeed + "," + ySpeed + ")";
    }
}
