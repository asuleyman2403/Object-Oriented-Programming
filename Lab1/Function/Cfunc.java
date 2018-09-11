import java.util.Scanner;

class Cfunc{
    public static int xor(int a,int b){
        int res;
        if(a!=b){
            res = 1;
        }else{
            res = 0;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(xor(a,b));




    }
}