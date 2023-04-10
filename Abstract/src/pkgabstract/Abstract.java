package pkgabstract;

abstract class Super{
    public Super(){
        System.out.println("This is super class constructor");
    }
    public void meth1(){
        System.out.println("This is meth1");
    }
    abstract public void display();
}
class Sub extends Super{

    @Override
    public void display() {
        System.out.println("This is Sub class display method ");
    }
    @Override
    public void meth1(){
        System.out.println("This is Sub class meth1.");
    }
    
}

public class Abstract  {

    public static void main(String[] args) {
        Super s1=new Sub();
        s1.display();
        s1.meth1();
    }
    
}
