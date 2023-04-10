package arraylist;
import java.util.*;   
public class ListDemo {

    public static void main(String[] args) {
       ArrayList<Integer> arrayList = new ArrayList<>();
       arrayList.add(2);
       arrayList.add(3);
       arrayList.add(4);
       arrayList.add(0, 1);
       System.out.println(arrayList);
       arrayList.remove(2);
       System.out.print(arrayList);
    }
    
}
