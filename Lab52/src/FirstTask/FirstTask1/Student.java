package FirstTask.FirstTask1;

public class Student implements Comparable{
    private String lastName;
    private String name;
    private int score;
    Student(String lastName,String name,int score){
        this.lastName = lastName;
        this.name = name;
        this.score = score;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student)obj;
        boolean ok = false;
        if(s.getScore() == this.score && s.getName().equals(this.name) && s.getLastName().equals(this.lastName)){
            ok = true;
        }
        return ok;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        int res = 0;
        if(s.getScore()>this.getScore()){
            res = 1;
        }else{
            if(s.getScore()<this.getScore()){
                res = -1;
            }else{
                if(this.getLastName().equals(s.getLastName())){
                    if(this.getName().equals(s.getName())){
                        res = 0;
                    }else{
                        if(this.getName().compareTo(s.getName())==1){
                            res = -1;
                        }else{
                            if(this.getName().compareTo(s.getName())== -1){
                                res = 1;
                            }
                        }
                    }
                }else{
                    if(this.getLastName().compareTo(s.getLastName()) == 1){
                        res = -1;
                    }else{
                        if(this.getLastName().compareTo(s.getLastName()) == -1){
                            res = 1;
                        }
                    }
                }
            }
        }
        return res;
    }
}
