import java.util.Scanner;

class Bif{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%4==0){
            if(a%100!=0){
                System.out.println("YES");
            }else{
                if(a%400==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }else{
            System.out.println("NO");
        }
    }
}