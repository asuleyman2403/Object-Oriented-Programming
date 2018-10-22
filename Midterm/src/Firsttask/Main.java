package Firsttask;

class Sequence {
    private String str;
    Sequence(){
    }
    Sequence(String str){
        this.str = str;
    }
    public void setStr(String str){
        this.str = str;
    }
    public String getStr(){
        return this.str;
    }
    public boolean isPalindrom(){
        int cnt = 0;

        for(int i = 0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length() - 1 - i)){
                cnt++;
            }else{
                break;
            }
        }
        if(cnt == str.length()/2){
            return true;
        }else{
            return false;
        }
    }

    public boolean isSubString(Sequence s){
        if(str.contains(s.getStr())){
            return true;
        }else{
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args){
        Sequence sq = new Sequence("ABBA");
        Sequence sq2 = new Sequence();
        sq2.setStr("ABBA");
        System.out.println(sq.isPalindrom());
        System.out.println(sq.isSubString(sq2));
    }
}
