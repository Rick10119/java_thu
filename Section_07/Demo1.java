// Example for PPT page No.12

public class Demo1 {
    static int count = 0;

    public static void main(String[] args) {
        // Read the index from command line
        int index = Integer.parseInt(args[0]);

        System.out.println("The No." + index + " fibonacci number is: " + fibonacci(index));
        System.out.println("count= " + count);
    }

    // Recursive method for fibonacci series
    public static int fibonacci(int k) {
        count++;

        if (k == 0) {
            return 0;
        } else if (k == 1) {
            return 1;
        } else {
            return fibonacci(k - 1) + fibonacci(k - 2);
        }
    }

    /**
     public static int fibonacci(int k)
     {
     if (k==0)
     {
     return 0;
     }
     else if (k==1)
     {
     return 1;
     }
     else
     {
     int f0=0;
     int f1=1;
     int f2=0;
     for(int i=2;i<k;i++)
     {
     f2=f1+f0;
     f0=f1;
     f1=f2;
     }
     return f2;
     }

     }
     */
}




