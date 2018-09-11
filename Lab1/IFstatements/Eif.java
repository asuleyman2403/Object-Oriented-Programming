import java.util.Scanner;


class Eif{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a>b){
            System.out.println(1);
        }
        if(a<b){
            System.out.println(2);
        }
        if(a==b){
            System.out.println(0);
        }

    }





}