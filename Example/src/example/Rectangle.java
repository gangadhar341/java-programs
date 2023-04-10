package example;

public class Rectangle {
    
    int length;
    int breadth;
    Rectangle(int length,int breadth){
        this.length=length;
       this.breadth=breadth;
    }
    public void display(){
        System.out.println("Length:"+length);
         System.out.println("Breadgth:"+breadth);
    }
    
   
    public static void main(String[] args) {
              Rectangle r=new Rectangle(10,200);
              r.display();
    }
}
