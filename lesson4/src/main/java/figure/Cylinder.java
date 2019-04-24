package figure;

public class Cylinder extends Circle
{
  protected int hуight;

  public Cylinder(int x, int y, int radius, int hуight)
  {
    super(x, y, radius);
    this.hуight = hуight;
  }

  public Cylinder(int radius, int hуight)
  {
    super(radius);
    this.hуight = hуight;
  }

  @Override
  public double square()
  {
    return super.square()*2 + (2*Math.PI*radius*hуight);
  }
  public double volumeCylinder(){
    return super.square()*hуight;
  }

  @Override
  public String toString()
  {
    return "Cylinder{" +
        "hуight=" + hуight +
        '}' + super.toString();
  }
}
