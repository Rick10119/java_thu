public class Test {
    public static void main(String [] args) {
        String a = String.format("%.3fine", 4.3);
        String b = "1";
//        System.out.println(Integer.parseInt(a));
        System.out.println(a);
        System.out.println(a.toCharArray());
        for(int i = 0;i < a.length();i++) {
            System.out.println(a.toCharArray()[i]);

        }
        System.out.println(a.substring(0,3));

    }
}
