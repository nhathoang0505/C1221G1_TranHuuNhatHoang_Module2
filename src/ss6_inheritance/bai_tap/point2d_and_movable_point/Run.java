package ss6_inheritance.bai_tap.point2d_and_movable_point;

public class Run {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3,3,2,2);
        System.out.println(movablePoint);
//        MovablePoint temp = movablePoint.move();
//        movablePoint.move();
        System.out.println(movablePoint.move());
    }
}
