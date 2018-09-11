import java.util.Scanner;


class Practice{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int nnum = num+1;
        int pnum =num-1;
        System.out.println("The next number for the number "+ num + " is " + nnum + ".");
        System.out.println("The previous number for the number "+ num + " is " + pnum + ".");
    }
}