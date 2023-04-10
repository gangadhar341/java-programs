package abstract1;

abstract class Shape{
    abstract public void area(int r);
    abstract public void perimeter(int r);
}

class Circle extends Shape{
    
    @Override
    public void area(int r){
        System.out.println("Circle Area is :"+3.14*r*r);
    }
    @Override
    public void perimeter(int r){
        System.out.println("Circle peremeter is: "+2*3.14*r);
    
    }
}
class A{

}

abstract class b extends A{

}
/*class Rectangle extends Shape{
    int r;
    @Override
    public void area(int r){
        System.out.println("Rectangle Area is :"+);
    }
    @Override
    public void perimeter(int r){
        System.out.println("Rectangle peremeter is: "+);
    
    }
}*/

public class Abstract1 {

    public static void main(String[] args) {
        Circle c=new Circle();
        c.area(5);
        c.perimeter(5);
    }
    
}
