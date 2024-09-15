import java.util.Scanner;
public class PrintLineandNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalLines;
        System.out.print("Enter the total number of lines user needs to give as input: ");
        totalLines = sc.nextInt();
        sc.nextLine(); 

        String[] str = new String[totalLines];
        int i = 0;
        while ( i<totalLines && sc.hasNextLine() ) {
            str[i] = sc.nextLine();
            i++;
        }

        for (int j = 0; j < totalLines; j++) {
            System.out.println((j + 1) + " " + str[j]);
        }

        sc.close();
    }
}
