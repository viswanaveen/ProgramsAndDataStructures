package com.naveen.programs;

public class ReverseString {

    /**
    * @param args
    */
    String reverse(String s)
    {
          System.out.println(s);
          if (s == null) return null;

          if (s.length() == 0)
          return "";

          if (s.length() == 1)
          return s;
         // System.out.println("s.substring(1)"+s.substring(1));
         // System.out.println("s.charAt(0)"+s.charAt(0));
          System.out.println("s:"+s);
          System.out.println("reverse(s.substring(1)) + s.charAt(0)"+(s.substring(1)) + s.charAt(0));
          return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
          // TODO Auto-generated method stub
          ReverseString rs=new ReverseString();     
          rs.reverse("Naveen");
    }

}

