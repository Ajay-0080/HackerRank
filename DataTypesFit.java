import java.util.Scanner;

public class DataTypesFit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[5]; 
        
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextDouble(); 
        }

        for (int i = 0; i < 5; i++) {
            
            if (arr[i] >= -128 && arr[i] <= 127) {
                System.out.println((long)arr[i] + " can be fitted in:\n* byte\n* short\n* int\n* long");
            } 
            else if (arr[i] >= -32768 && arr[i] <= 32767) {
                System.out.println((long)arr[i] + " can be fitted in:\n* short\n* int\n* long");
            } 
            else if (arr[i] >= -2147483648L && arr[i] <= 2147483647L) {
                System.out.println((long)arr[i] + " can be fitted in:\n* int\n* long");
            } 
            else if (arr[i] >= -9223372036854775808L && arr[i] <= 9223372036854775807L) {
                System.out.println((long)arr[i] + " can be fitted in:\n* long");
            }
            else if (arr[i] >= -3.40282347e38 && arr[i] <= 3.40282347e38) {
                System.out.println(arr[i] + " can be fitted in:\n* float");
            } 
            else if (arr[i] >= -1.7976931348623157e308 && arr[i] <= 1.7976931348623157e308) {
                System.out.println(arr[i] + " can be fitted in:\n* double");
            } 
            else { 
                System.out.println(arr[i] + " can't be fitted anywhere.");
            }
            
        }

        sc.close();
    }
}
