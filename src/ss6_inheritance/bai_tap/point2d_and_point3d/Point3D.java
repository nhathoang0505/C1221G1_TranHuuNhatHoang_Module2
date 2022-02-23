package ss6_inheritance.bai_tap.point2d_and_point3d;

public class Point3D extends Point2D {
    protected float z;

    public Point3D() {
        z = 8.8f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{x, y, z};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}
