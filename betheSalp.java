import java.util.Random;
import java.util.Scanner;

public class betheSalp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int i = 0;
        double s = 0;
        int m = 1000;
        double a = Math.PI;
        double b = (3/2)*Math.PI;
        while(i<m){
            //double r = (b-a)*random.nextDouble(0,1)+a; 
            double rand = 0 + (1 - 0) * random.nextDouble();
            double r = (b-a)*rand+a;
            s = (Math.sin(r))*r + s;
            i++;   
           // System.out.println(s/i);
        }
        System.out.println(s/m);


    }
    
}
