import org.junit.Test;
import static org.junit.Assert.*;

// Classe de teste unificada
public class ProjetoTest {

    // Implementação de IShape para teste
    class ShapeTeste implements IShape {
        private boolean desenhado = false;
        private boolean apagado = false;

        @Override
        public void draw() {
            desenhado = true;
        }

        @Override
        public void erase() {
            apagado = true;
        }

        public boolean isDesenhado() {
            return desenhado;
        }

        public boolean isApagado() {
            return apagado;
        }
    }

    // Implementação de Figure2D para teste
    class TesteFigure2D extends Figura2D {
        public TesteFigure2D(int id) {
            super();
        }

        @Override
        public void draw() {
            System.out.println("Figura 2D desenhada.");
        }

        @Override
        public void erase() {
            System.out.println("Figura 2D apagada.");
        }
    }

    // Testes da classe Point2D
    @Test
    public void testPoint2DConstructor() {
        Point2D point = new Point2D(3.0, 4.0);
        assertEquals(3.0, point.getX(), 0.001);
        assertEquals(4.0, point.getY(), 0.001);
    }

    @Test
    public void testPoint2DDraw() {
        Point2D point = new Point2D(1.0, 1.0);
        point.draw();
        System.out.println("Método draw chamado com sucesso.");
    }

    @Test
    public void testPoint2DErase() {
        Point2D point = new Point2D(1.0, 1.0);
        point.erase();
        System.out.println("Método erase chamado com sucesso.");
    }

    // Testes da classe Point3D
    @Test
    public void testPoint3DConstructor() {
        Point3D point = new Point3D(1.0, 2.0, 3.0);
        assertEquals(1.0, point.getX(), 0.001);
        assertEquals(2.0, point.getY(), 0.001);
        assertEquals(3.0, point.getZ(), 0.001);
    }

    @Test
    public void testPoint3DDraw() {
        Point3D point = new Point3D(1.0, 2.0, 3.0);
        point.draw();
        System.out.println("Método draw chamado com sucesso.");
    }

    @Test
    public void testPoint3DErase() {
        Point3D point = new Point3D();
    }
}