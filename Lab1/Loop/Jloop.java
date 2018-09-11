import java.util.Scanner;

class Jloop{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int i =0;i<100;i++){
            int a = scan.nextInt();
            sum+=a;

        }
        System.out.println(sum);
    }
}