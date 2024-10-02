public class Point2D implements IPoint {

    double x,y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    public void draw() {
        System.out.println("Esta desenhando");
    }

    public void erase() {
        System.out.println("Esta apagando");
    }
}
