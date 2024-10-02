public class Point3D implements IPoint3D{
    double x,y,z;

    public Point3D(double x,double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D() {
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }
    @Override
    public double getZ() {
        return z;
    }

    public void draw() {
        System.out.println("Esta desenhando");
    }

    public void erase() {
        System.out.println("Esta apagando");
    }
}
