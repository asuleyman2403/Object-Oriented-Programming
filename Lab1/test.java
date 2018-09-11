import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();
        System.out.println(first.length()+second.length());
        int minsize = Math.min(first.length(),second.length());
        for(int i=0;i<minsize-1;i++){
            if(first[i]==second[i]){
                if(first[i+1]<second[i+1]){
                    System.out.println("Yes");
                    break;
                }else{
                    System.out.println("No");
                    break;
                }

            }else{
                if(first[i+1]<second[i+1]){
                    System.out.println("Yes");
                    break;
                }else{
                    System.out.println("No");
                    break;
                }
            }
        }
        first[0]=(char)((int)first[0]-32);
        second[0]=(char)((int)second[0]-32);
        System.out.println(first+' '+second);
    }






}


