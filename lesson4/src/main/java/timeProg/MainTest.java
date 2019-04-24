package timeProg;

public class MainTest
{
  public static void main(String[] args) throws InterruptedException
  {
    Time time2 = new Time(23, 59, 50);

    test(time2);
    time2.setHour(11);
    time2.setMinutes(59);
    time2.setSeconds(50);
    test(time2);

  }

  private static void test(Time time) throws InterruptedException
  {
    for (int i = 0; i < 20; i++)
    {
      time.printStandardTime();
      time.printAmericanTime();
      time.tick();
      Thread.sleep(1000);
    }
  }


}
