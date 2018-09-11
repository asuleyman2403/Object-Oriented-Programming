import java.util.Scanner;

class Bwhile{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=2;
        while(i<=n){
           if(n%i==0){
               System.out.println(i);
               break;
           }
           i++;
        }
    }





}