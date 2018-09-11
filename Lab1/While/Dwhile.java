import java.util.Scanner;

class Dwhile{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=1;
        boolean ispow = false;
        while(i<=n){
            if(i==n){
                ispow=true;
                break;
            }
            i*=2;
        }
        if(ispow){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }





}