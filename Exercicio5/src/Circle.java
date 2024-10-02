public class Circle extends Figura2D {
    Point2D center;
    double radius;

    public Circle(int idFigure2D, Point2D center, double radius){
        this.idFigure2D = idFigure2D;
        this.center = center;
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Esta desenhando");
    }

    public void erase() {
        System.out.println("Esta apagando");
    }
}
