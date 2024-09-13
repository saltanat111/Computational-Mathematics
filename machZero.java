public class machZero {
     public static void main(String[] args) {
        double mz = 1;
        int n = 0;
        while(mz*2 > mz)
        {
            if(!(mz*2 == mz))
            {
                System.out.println(mz);
            }
            mz = mz/2;
            n++;
        }
        System.out.println(mz);
        System.out.println(n);
     }
    
}