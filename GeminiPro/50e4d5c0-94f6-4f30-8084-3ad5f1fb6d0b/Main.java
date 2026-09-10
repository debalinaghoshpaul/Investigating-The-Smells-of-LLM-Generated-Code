import java.util.*;
public class Main
{
public boolean endsNg(String str) 
{
  int len = str.length();
  String ng = "ng";
  if (len < 2)
    return false;
  else if (ng.equals(str.substring(len-2,len)))
    return true;
  else
    return false;
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "string";
      System.out.println("The given strings is: "+str1);
      System.out.println("The string containing ng at last: "+m.endsNg(str1));
    }
}