public abstract class Figura2D implements IShape {
    int idFigure2D;

    public void Figure2D(int idFigure2D) {
        this.idFigure2D = idFigure2D;
    }

    public abstract void draw();
    public abstract void erase();
}

