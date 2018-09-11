import java.util.Scanner;


class Dloop{
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int x = scan.nextInt();
       for(int i =2;i<=x;++i){
           if(x%i==0){
               System.out.println(i);
               break;
           }
       }


   }

}