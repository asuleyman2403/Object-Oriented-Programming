class StarTriangle{
    private int n;
    StarTriangle(int n){
        this.n=n;
    }
    public String toString(){
        String star = "[*]";
        String str="";
        for(int i =1;i<=n;i++){
            for(int j=0;j<i;j++){
                str=str + ""+ star;
            }
            str=str + "\n";
        }
        return str;
    }
}
class two{
    public static void main(String[] args){
        StarTriangle tria = new StarTriangle(5);
        System.out.println(tria.toString());
    }
}