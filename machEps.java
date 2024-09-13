public class machEps {
    public static void main(String[] args) {

        float eps32 = 1;
        int n32 = 0;

        while(1+eps32 > 1)
        {
            eps32 = eps32/2;
            n32++;
        }

        double eps64 = 1;
        int n64 = 0;
        while(1+eps64 > 1)
        {
            eps64 = eps64/2;
            n64++;
        }

        System.out.print("Machine epsilon + 1 for 32 bit system: ");
        System.out.println(eps32*2+1);
        System.out.print("Machine epsilon + 1 for 64 bit system: ");
        System.out.println(eps64*2+1);
        System.out.println();
        System.out.print("Machine epsilon for 32 bit system: ");
        System.out.println(eps32*2);
        System.out.print("Machine epsilon for 64 bit system: ");
        System.out.println(eps64*2);
        System.out.println();
        System.out.print("Machine epsilon divided by 2 and added 1 for 32 bit system: ");
        System.out.println(eps32+1);
        System.out.print("Machine epsilon divided by 2 and added 1 for 64 bit system: ");
        System.out.println(eps64+1);
        System.out.println();
        System.out.print("Number of iteration needed to find Machine epsilon for 32 bit system:");
        System.out.println(n32);
        System.out.print("Number of iteration needed to find Machine epsilon for 64 bit system:");
        System.out.println(n64);
        System.out.println("\nConclusion: \nMachine epsilon for 32 bit system is 2^-23(because it took 24 iterations)\nMachine epsilon for 64 bit system is 2^-52(because it took 53 iterations)");

    }

}
