//1st task
public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}

//2nd task
import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}

//3rd task
import java.util.Scanner;

public class Solution {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(n+" x "+ i +" = "+n*i);
        }
    }
}
//4thtask
import java.util.Scanner;


class Solution{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int i=0;i<q;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int sum = a;
            for(int j=0;j<n;j++){
                sum=sum+(int)(Math.pow(2,j)*b);
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}

//5th task
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            String x = sc.next();
            int k=x.length();
            for(int j=0;j<3-k;j++){
                x="0"+x;
            }

            int emp = 15-s1.length();
            String spc = "";
            for(int j=0;j<emp;j++){
                spc+=" ";
            }
            System.out.println(s1+spc+x);
        }
        System.out.println("================================");

    }
}
//6thtask
import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%2!=0){
            System.out.println("Weird");
        }else{
            if(n<=5 && n>=2){
                System.out.println("Not Weird");
            }
            if(n<=20 && n>=6){
                System.out.println("Weird");
            }
            if(n>20){
                System.out.println("Not Weird");
            }
        }
    }
}
//7thtask
import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cnt =0;
        while(scan.hasNext()){
            String s = scan.nextLine();
            cnt++;
            System.out.println(cnt+" "+s);
        }
    }
}

//8thtask
import java.util.Scanner;


class Checker implements Comparator<Player> {
    public int compare(Player p1, Player p2) {
        if (p2.score == p1.score) {
            return p1.name.compareTo(p2.name);
        } else {
            return p1.score > p2.score ? -1 : 1;    
        }
    }
}


class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
//9thtask
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String IP = scanner.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String IPnumber = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
    String pattern = IPnumber + "." +  IPnumber + "." +  IPnumber + "." + IPnumber;
}

//10thtask
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            System.out.println(input);
        }
        in.close();
    }
}