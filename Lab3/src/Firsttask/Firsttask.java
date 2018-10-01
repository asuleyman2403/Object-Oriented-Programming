class Animal{
    int paws;
    boolean hasWool;
    String name;
    Animal(){}
    Animal(int paws,boolean haswool){
        this.paws = paws;
        this.hasWool = haswool;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
}
class Dog extends Animal{
    String breed;
    Dog(){
        super();                            //using super constructor;
    }
    Dog(int paws,boolean hasWool,String breed){
        super(paws,hasWool);                //using of super constructor with variables
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public int CountPaws(){
        return super.paws;
    }
    public void setName(String newName){
        this.name = newName;                 //overloading
    }
    public String getName(){
        return this.name + " is a dog breed of " + this.breed;   //overriding
    }
}

public class Firsttask{

    public static void main(String[] args){
        Animal siyr = new Animal();
        Dog aktos = new Dog(4,true,"Golden RETRIEVER");
        siyr.hasWool = true;
        siyr.setName("MyCow");
        aktos.setName("ThebestDog");
        System.out.println(siyr.getName());
        System.out.println(aktos.getName());
        System.out.println(aktos.CountPaws());
        System.out.println(aktos.getBreed());
    }
}