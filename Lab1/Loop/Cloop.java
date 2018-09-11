import java.util.Scanner;

class Cloop{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i=a;i<=b;i++){
            if((int)Math.sqrt(i)==Math.sqrt(i)){
                System.out.print(i+" ");
            }
        }
    }





}