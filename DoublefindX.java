import java.util.*;
public class Main
{
     public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             double A = sc.nextDouble();
             double B = sc.nextDouble();

             double X = Math.sqrt(3 * A + 1);
             X = X / B;
             System.out.println(X);
     }
}
