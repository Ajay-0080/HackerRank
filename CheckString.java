import java.util.Scanner;
class Solution {
    int n;
    String s;
    public Solution () {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
    }
   

    public void converttoString() {

        try {
            if(n < -100 || n > 100) {
                throw new Exception("Wrong answer");
            }
                s=Integer.toString(n);   
                System.out.println("Good job"); 

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
class CheckString {
    public static void main (String [] args) {
        Solution obj = new Solution();
        obj.converttoString();
    }
}