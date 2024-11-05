package ijpPractice;

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog makes Bark");
    }
}
public class Cat extends dog{
    @Override
    void sound(){
        System.out.println("Cat makes meuuuu");
    }

    public static void main(String[] args) {
        dog d=new dog();
        Cat c=new Cat();
        d.sound();
        c.sound();
    }
}
