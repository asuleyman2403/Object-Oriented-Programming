class Student{
    private String name;
    private int id;
    private int yos = 1;
    Student(String name,int id){
        this.name = name;
        this.id = id;
    }
   /* public void setname(String newname){
        name = newname;
    }
    public void setid(int newid){
        id = newid;
    }
    public void setYos(int nyos){ yos = nyos;}*/
    public int getyos(){
        return yos;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
    public int incid(){
        ++yos;
        return yos;
    }
}
class one{
    public static void main(String[] args){
        Student assyl = new Student("Assyl",15);
        Student newstd = new Student("newstud",10);
        System.out.println(assyl.getname());
        System.out.println(assyl.getid());
        System.out.println(newstd.getyos());
        System.out.println(assyl.incid());

        System.out.println(newstd.getname());
        System.out.println(newstd.getid());
        System.out.println(newstd.getyos());
    }
}