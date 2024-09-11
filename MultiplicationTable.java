import java.util.Scanner;
class MultiplicationTable {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        int first;
        int limit;
        System.out.print("enter a number : ");
        num = sc.nextInt();
        System.out.print("enter the first number : ");
        first = sc.nextInt();
        System.out.print("enter the limit : ");
        limit = sc.nextInt();

        while(first<=limit) {
            System.out.println(num+" x "+first+" = "+num*first);
            first++;
        
        }


    }
}