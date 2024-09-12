import java.util.Scanner;
class SeriesPrint {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        int a;
        int b;
        int n;
        int sum=0;
        System.out.print("enter the value of a: ");
        a=sc.nextInt();
        System.out.print("enter the value of b: ");
        b=sc.nextInt();
        System.out.print("enter the value of n: ");
        n=sc.nextInt();
        sum=a+(int) Math.pow(2,0)*b;
        System.out.print(sum+" ");
        for(int i=1;i<n;i++) {
            sum = sum + (int) Math.pow(2,i)*b;
            System.out.print(sum+" ");

        }
        sc.close();
        
    }
}