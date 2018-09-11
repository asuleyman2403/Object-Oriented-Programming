import java.util.Scanner;

class Earr{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        for(int i=1;i<n-1;i++){
            if(a[i-1]<a[i] && a[i+1]<a[i]){
               cnt++;
            }
        }
        System.out.println(cnt);
    }
}