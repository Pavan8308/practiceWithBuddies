package ijpPractice;

public class Family extends Child{
    public static void main(String[] args) {
        GrandParents gp=new GrandParents();
        Parent p=new Parent();
        Child ch=new Child();
        gp.age();
        p.age();
        ch.age();
    }
}
class GrandParents{
    void age(){
        System.out.println("Age of GrandParent =83");
    }
}
class Parent extends GrandParents{
    @Override
    void age(){
        System.out.println("Age of Parent =45");
    }
}
class Child extends Parent{
    void age(){
        System.out.println("Age of child =27");
    }
}


