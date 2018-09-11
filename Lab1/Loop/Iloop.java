import java.util.Scanner;


class Dloop{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int cnt = 0;
        for(int i=1;i<=Math.sqrt(x);++i){
            if(x%i==0){
                cnt++;
            }
        }
        if((int)Math.sqrt(x)*(int)Math.sqrt(x)==x){
            cnt=cnt*2-1;
        }else{
            cnt=cnt*2;
        }
        System.out.println(cnt);

    }
}