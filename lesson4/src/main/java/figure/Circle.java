package figure;

public class Circle extends Point
{
  protected int radius;

  public Circle(int x, int y, int radius)
  {
    super(x, y);
    this.radius = radius;
  }

  public Circle(int radius)
  {
    this.radius = radius;
  }

  public double square()
  {
    return Math.PI * radius * radius;
  }

  @Override
  public String toString()
  {
    return "Сircle{" +
        "radius=" + radius +
        '}' + super.toString();
  }
}
