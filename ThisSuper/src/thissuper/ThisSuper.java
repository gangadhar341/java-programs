package thissuper;

class Rectangle{
    
    int length;
    int breadth;
    int x=10;
    
    Rectangle(int length,int breadth){
        this.length=length;
       this.breadth=breadth;
    }
    public void display(){
        System.out.println("Length:"+length);
         System.out.println("Breadgth:"+breadth);
    }
    
}

class Cuboid extends Rectangle{
    
    int heigth;
    int x=20;
    
    Cuboid(int l,int b,int h){
        super(l,b);
        heigth=h;
    }
    
    public void display(){
       
        System.out.println("Heigth:"+heigth);
        System.out.println("Chaild is:"+x);
        System.out.println("Parent is:"+super.x);
         System.out.println("Volume is:"+length*breadth*heigth);
    }
}

public class ThisSuper {

    public static void main(String[] args) {
        Cuboid c =new Cuboid(1,2,3);
        c.display();
    }
    
}
