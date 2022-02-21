package ss4_class_and_object_in_java.bai_tap.xay_dung_lop_fan;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan is on. " + "speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius();
        } else {
            return "Fan is off. " + "color: " + getColor() + ", radius: " + getRadius();
        }
    }
}