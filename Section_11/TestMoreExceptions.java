// Example for PPT page No.15, No.20(modify needed)

public class TestMoreExceptions {
    /**
     * Main method with argument[0]: 0 - sample exception, 1 - sample exception 1, 2 - sample exception 2, others - no exceptions
     */
    public static void main(String[] args) throws SampleException, SampleException1, SampleException2 {
        System.out.println("The statements before try-catch block...");
        System.out.println();

        try {
            System.out.println("The statements before throw an exception...");

            switch (args[0].charAt(0)) {
                case '0':
                    throw new SampleException();
                case '1':
                    throw new SampleException1();
                case '2':
                    throw new SampleException2();
                default:
                    System.out.println("No exception has been throw...");
            }

            System.out.println();
            System.out.println("The statements follow the throw blocks...");
            System.out.println();
        } catch (SampleException1 ex1) {
            System.out.println("----------------------------");
            System.out.println("Handle for Sample Exception 1...");
            System.out.println(ex1.getMessage());
            System.out.println("-----------------------------");
            System.out.println();

            throw ex1;
        } catch (SampleException2 ex2) {
            System.out.println("----------------------------");
            System.out.println("Handle for Sample Exception 2...");
            System.out.println(ex2.getMessage());
            System.out.println("-----------------------------");
            System.out.println();
        } catch (SampleException ex) {
            System.out.println("----------------------------");
            System.out.println("Handle for Sample Exception...");
            System.out.println(ex.getMessage());
            System.out.println("-----------------------------");
            System.out.println();
        }

        System.out.println("The statements after try-catch block...");
    }
}