package figure;

public class Test
{
  public static void main(String[] args)
  {
    Point point = new Point();
    System.out.println(point);
    Circle circle = new Circle(10);
    System.out.println(circle);
    Cylinder cylinder = new Cylinder(10, 3);
    System.out.println(cylinder);
    System.out.println(circle.square());
    System.out.println(cylinder.square());
    System.out.println(cylinder.volumeCylinder());
  }
}
