package ua.hillel.boichenko.lessons.lesson4;

public class Main {
  public static void main(String[] args) {
        System.out.println(5+10);
        int a = 3;
        int b = 10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);
//      1.System.out.println(); java delit bez octatka toest bez desiatux i cotux(0.14787)
      System.out.println(10/3);
//      2.System.out.println();pokaзуем джаве что это число дабл и она ужэ будет делить с десятыми и сотымит
        System.out.println((double) b / a );
        System.out.println(10.0 / 3.0);
      System.out.println(b / (double)a);

      System.out.println(9 % 4);
      System.out.println(8 % 3);
      System.out.println(10 % 1);
      System.out.println(10 % 2);
      System.out.println(10 % 3);
      System.out.println(10 % 4);
      System.out.println(10 % 5);
      System.out.println(10 % 6);
      System.out.println(10 % 7);
      System.out.println(10 % 8);
      System.out.println(10 % 9);
      System.out.println(10 % 10);

      System.out.println(30 % 5);
//      int x = 10;
//      int y = x+5;
//      x = y;
//      System.out.println(x);
//      int x1 = 10;
//      x = x1 + 5;
//      System.out.println(x);
      int x = 10;
      x +=5;
      x -=5;
      x *=5;
      x /=5;
      x %=5;
      System.out.println(x);
      int q = 10;
//      q = q + 1;
//      System.out.println(q);
//      q +=1;
//      System.out.println(q);
//      q++;
//      System.out.println(q);
//      q--;
//      System.out.println(q);
//      System.out.println(q);
//      q++;
//      System.out.println(q);
//        q++;
//      System.out.println(q);
      ++q;
      System.out.println(q);
      ++q;
      System.out.println(q);
      int w = 5;
      int r = 2;
      int result = --w + r++ + w++ + --w;
      System.out.println("result =" + result);
      System.out.println("w = " + w);
      System.out.println("r = "  + r);
      System.out.println(Math.PI);
      System.out.println(Math.E);
      int absValume = Math.abs(10);
      System.out.println(absValume);
      System.out.println(Math.abs(10));
      System.out.println(Math. pow (4, 5));
      System.out.println(Math.pow (2,  3.5));
      System.out.println(Math.pow (3.2, 2.4));




    }
}
