public class CalendarPrinter1
{
  public static void main (String[] args) 
  {
   int x = 1;
   String y = "";
   while (x < 31)
   {
      if (x==5||x==6||x==12||x==13||x==19||x==20||x==26||x==27)
        y = "-WEEKEND";
      else if (x==7)
        y = "-NO SCHOOL LABOR DAY";
      else if (x==25)
        y = "-END OF THE MARKING PERIOD";
      else
        y = "";
      System.out.println(" September" + x + y);
      x++;
    }
  }
}