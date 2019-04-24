package figure;

public class Point
{
  @Override
  public String toString()
  {
    return "Point{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }

  public Point(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  protected int x;
  protected int y;

  public Point()
  {
  }
}
