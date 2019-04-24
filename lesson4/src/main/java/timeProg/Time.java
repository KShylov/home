package timeProg;

public class Time
{
  private int hour;
  private int minutes;
  private int seconds;


  public Time(int hour, int minutes, int seconds)
  {
    this.hour = hour;
    this.minutes = minutes;
    this.seconds = seconds;

  }

  public void tick()
  {
    if (seconds == 59)
    {
      seconds = 0;
      if (minutes == 59)
      {
        minutes = 0;
        if (hour == 23)
        {
          hour = 0;
        }
        else
        {
          hour++;
        }
      }
      else
      {
        minutes++;
      }
    }
    else
    {
      seconds++;
    }
  }

  public void printStandardTime()
  {
    System.out.print(partTime(hour) + ":" + partTime(minutes) + ":" + partTime(seconds) + " - ");
  }

  public void printAmericanTime()
  {
    if (hour == 0)
    {
      System.out.println(partTime(hour + 12) + ":" + partTime(minutes) + ":" + partTime(seconds) + " AM");
    }
    else if (hour < 12)
    {
      System.out.println(partTime(hour) + ":" + partTime(minutes) + ":" + partTime(seconds) + " AM");
    }
    else if (hour == 12)
    {
      System.out.println(partTime(hour) + ":" + partTime(minutes) + ":" + partTime(seconds) + " PM");
    }
    else
    {
      System.out.println(partTime(hour - 12) + ":" + partTime(minutes) + ":" + partTime(seconds) + " PM");
    }

  }


  public int getHour()
  {
    return hour;
  }


  public int getMinutes()
  {
    return minutes;
  }


  public int getSeconds()
  {
    return seconds;
  }

  public void setHour(int hour)
  {
    this.hour = hour;
  }

  public void setMinutes(int minutes)
  {
    this.minutes = minutes;
  }

  public void setSeconds(int seconds)
  {
    this.seconds = seconds;
  }

  private String partTime(int num)
  {
    String str;
    if (num < 10)
    {
      str = "0" + num;
    }
    else
    {
      str = String.valueOf(num);
    }
    return str;
  }
}
