import java.util.Scanner;
class PrintStringandNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] name = new String[3];
        int [] num = new int[3];
        for(int i=0;i<3;i++) {
            name[i]=sc.next();
            num[i]=sc.nextInt();
        }
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {

            System.out.print(name[i]);

            for(int j=0;j<15;j++)
            {
               System.out.print(" ");

            }

            if(num[i]<10) {
                System.out.println("00"+num[i]);
            }
            
            else if(num[i]<100) {
                System.out.println("0"+num[i]);
            }
            else {
            System.out.println(num[i]);
            }
        }
        System.out.println("================================");
    }
}
