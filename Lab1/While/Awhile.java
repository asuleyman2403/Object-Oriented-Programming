import java.util.Scanner;

class Awhile{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while(i<=n){
            if(Math.sqrt(i)==(int)Math.sqrt(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }





}