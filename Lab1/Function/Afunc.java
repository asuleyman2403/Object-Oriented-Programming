import java.util.Scanner;

class Afunc{
    static int Mini(int a,int b) {
        if(a < b) return a;
        return b;
    }
    static int min4(int a, int b,int c,int d){
        int mini = a;
        mini = Mini(mini,b);
        mini = Mini(mini,c);
        mini = Mini(mini,d);
        return mini;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        System.out.println(min4(a,b,c,d));
    }
}