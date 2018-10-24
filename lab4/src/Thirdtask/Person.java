package Thirdtask;


class Person implements Cloneable {
    String name;
    String surname;
    String id;
    Person(){}
    Person(String name,String surname,String id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getId(){
        return id;
    }
    public boolean equals(Object o){
        Person p = (Person)o;
        return (p.getSurname().equals(surname) && p.getName().equals(name) && p.getId().equals(id));
    }
    public String toString(){
        return name + " " + surname + " " + id;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person cloned = (Person)super.clone();
        cloned.name = this.getName();
        cloned.id = this.getId();
        cloned.surname = this.getSurname();
        return cloned;
    }
}


