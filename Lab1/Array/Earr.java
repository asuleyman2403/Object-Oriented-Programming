import java.util.Scanner;

class Earr{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        boolean ok = false;
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(a[i]*a[i+1]>=0){
                ok=true;
                break;
            }
        }
        if(ok){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}