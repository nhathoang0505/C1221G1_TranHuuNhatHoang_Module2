package ss6_inheritance.bai_tap.point2d_and_movable_point;

public class Point {
    protected float x;
    protected float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = 5.5f;
        y = 14.3f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
//        float[] arrayXY;
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
