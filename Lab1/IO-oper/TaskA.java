import java.util.Scanner;
class Hypoten {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double c = Math.sqrt(a * a + b * b);
        System.out.println(c);
    }
}