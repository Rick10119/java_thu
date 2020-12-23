import java.util.Scanner;

public class HW4 {
    public static void main (String [] args) {
        // define the Scanner
        Scanner input = new Scanner(System.in);

        // input
        System.out.println("please input the gene group:");
        String geneGroup = input.nextLine();

        int numberOfGene = 0;
        // loop the String
        for (int i = 0;i + 3 < geneGroup.length() - 1;i ++) {

            // to find ATG
            if (geneGroup.charAt(i) == 'A' && geneGroup.charAt(i + 1) == 'T'
            && geneGroup.charAt(i + 2) == 'G') {

                // to judge the next 3 char; loop the rest of the String
                for(int j = 3;i + j +2 < geneGroup.length();j += 3) {
                    String next = geneGroup.substring(i + j, i + j + 3);

                    // to end with a gene found
                    if (next.equals("TAG") || next.equals("TAA") || next.equals("TGA")) {
                        numberOfGene ++;
                        System.out.println("here is a gene found: " + geneGroup.substring(i + 3, i + j));
                    }

                    // to end without a gene
                    if (next.equals("ATG") || next.equals("TAG")
                            || next.equals("TAA") || next.equals("TGA")) {
                       break;
                    }
                }
            }
        }

        // if no gene found
        if(numberOfGene == 0) {
            System.out.println("no gene was found.");
        }
    }
}
