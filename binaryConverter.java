import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class binaryConverter
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is it floating Number(enter 1) or an Integer(enter 0)?");
        int type = scan.nextInt();
        ArrayList convertedFromRightToLeftInt = new ArrayList<>();
        ArrayList convertedFromRightToLeftNonInt = new ArrayList<>();
        if(type == 1)
        {
            System.out.println("Enter a floating number: ");
            float numToConvert = scan.nextFloat();
            float nonIntPart = numToConvert;
            int intPart = 0;
            while(nonIntPart>1)
            {
                nonIntPart--;
                intPart++;
            }
            while(intPart>0)
            {
                int binaryIntDigit = intPart%2;
                intPart = intPart/2;
                convertedFromRightToLeftInt.add(binaryIntDigit);
            }
            for(int i = 0;i<8;i++)
            {
                System.out.println(nonIntPart);
                nonIntPart = nonIntPart*2;
                if(nonIntPart>1)
                {
                    convertedFromRightToLeftNonInt.add(1);
                    System.out.println(nonIntPart);
                    nonIntPart = nonIntPart-1;
                    System.out.println(nonIntPart);
                    System.out.println();
                }
                else if(nonIntPart<1)
                {
                    convertedFromRightToLeftNonInt.add(0);
                }

            }

        }
        else if(type == 0)
        {
            System.out.println("Enter an integer: ");
            int numToConvert = scan.nextInt();
            while(numToConvert>0)
            {
                int binaryDigit = numToConvert%2;
                numToConvert = numToConvert/2;
                convertedFromRightToLeftInt.add(binaryDigit);
            }
        }
        else
        {
            System.out.println("Enter either 1(floating number) or 0(integer)");
            while(type!=0||type!=1)
            {
                type = scan.nextInt();
            }
        }
        System.out.println("Answer: ");
        for(int i = 0;i<convertedFromRightToLeftInt.size();i++)
        {
            System.out.print(convertedFromRightToLeftInt.get(convertedFromRightToLeftInt.size()-i-1));
        }
        System.out.print(".");
        for(int i = 0;i<8;i++)
        {
            System.out.print(convertedFromRightToLeftNonInt.get(i));
        }
    }
}