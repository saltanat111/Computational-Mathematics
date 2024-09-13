public class machInf {
    public static void main(String[] args) {
        double mi = 2;
        int n = 0;
        while(!(mi==mi*2))
        {
            mi = mi*2;
            n++;
            if(!(mi==mi*2))
            {
                System.out.println(mi);
            }
        }
        System.out.println(mi);
        System.out.println(n);
    }
    
}
