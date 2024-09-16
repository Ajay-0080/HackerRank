import java.util.Scanner;
    class Parallelogram {
        static int B;
        static int H;

        static {
            Scanner sc = new Scanner(System.in);
            B = sc.nextInt();
            H = sc.nextInt();
            sc.close(); 
        }

    
        public static void calculateArea() {
            try {
                if (B <= 0 || H <= 0) {
                    throw new Exception("Breadth and height must be positive");
                }
                int area = B * H;
                System.out.println(area);
            } 
            catch (Exception e) {
                System.out.println(e);
            }
    }
}

public class ParallelogramArea {
    public static void main(String[] args) {
        Parallelogram.calculateArea();
    }
}