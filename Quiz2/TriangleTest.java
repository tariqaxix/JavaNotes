package Quiz2;

public class TriangleTest {
    public static void main(String[] args) throws TriangleException {
        Triangle one = new Triangle(5,2,7);
        System.out.println(one.isEquilateral());
        System.out.println(one.isIsosceles());
        System.out.println(one.isScalene());
    }
}