package getset;


class Hello{
    public int l;
    public int b;
    
    public int getLen(){
        return l;
    }
    public void setLen(int x){
        l=x;
    }
     public int getBre(){
        return b;
    }
    public void setBre(int y){
        b=y;
    }
    
    public void area(){
       
        System.out.println("Area is: "+(l*b));
    }
    public void peremeter(){
        System.out.println("peremeter is :"+ 2*l*b);
    }
}
public class GetSet {

    public static void main(String[] args) {

        Hello h=new Hello();
        h.setLen(20);
        h.setBre(30);
        
        h.peremeter();
        h.area();
        
        System.out.println("Length is :"+h.getLen());
        System.out.println("Breadth is :"+h.getBre());
    }
    
}
