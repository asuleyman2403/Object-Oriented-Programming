import java.util.Scanner;

class Kloop{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            if(x==0){
                sum++;
            }
        }
        System.out.println(sum);



    }

}