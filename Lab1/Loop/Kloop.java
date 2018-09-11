import java.util.Scanner;

class Kloop{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            sum+=x;
        }
        System.out.println(sum);



    }

}