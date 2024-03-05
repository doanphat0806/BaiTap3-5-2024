import model.Point2D;
import model.Point3D;

public class main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.0f, 3.0f);
        System.out.println("Point2D: " + point2D);
        Point3D point3D = new Point3D(4.0f, 5.0f, 6.0f);
        System.out.println("Point3D: " + point3D);
    }
}
