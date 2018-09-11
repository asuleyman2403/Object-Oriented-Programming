import java.util.Scanner;

class Mkad{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int v  = scan.nextInt();
        int t  = scan.nextInt();
        if(v<0){
            if(v*t%109==0){
                System.out.println("0");
            }else{
                System.out.println(109 + v*t%109);

            }
        }else
            {
            System.out.println(v*t%109);
            }
    }
}