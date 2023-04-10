package inheritence;
class Hello{
    public void display(){
        System.out.println("This is Hello");
    }
}
class Hii extends Hello{
    @Override
    public void display(){
        System.out.println("This is Hii");
    }
}


public class Inheritence{

    public static void main(String[] args) {
        Hello h=new Hii();
        h.display();
    }
    
}
