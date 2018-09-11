import java.util.Scanner;

class Bfunc{
    public static double dpow(double a,int b){
        double res=1;
        for(int i=0;i<b;i++){
            res=res*a;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        int b = scan.nextInt();
        System.out.println(dpow(a,b));
    }
}