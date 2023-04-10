package linkedlist;

public class LinkedList {
    
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
}
    public static int findLength(Node head){
       Node t = head;
       int count = 0;
       while(t != null){
           count++;
           t = t.next;
       }
       return count;
    }
    public static int findk(Node head ,int  k){
        Node t = head;
        for(int i =0 ;i<k-1 ;i++){
            t = t.next;
        }
        return t.data;
    }
    public static Node insertNode(Node head, int k, int ele){
        Node t = head;
        for(int i = 0; i<k-3 ; i++){
            t = t.next;
        }
        Node n = new Node(ele);
        n.next = t.next;
        t.next = n;
        return t;
    }
    public static void main(String[] args) {
       int[] a = {10,20,30,40,50,60,70};
       Node head = null;
       for(int i =0;i<a.length;i++){
           Node n = new Node(a[i]);
           if(head == null){
               head = n;
           }
           else{
               Node t = head;
               while(t.next != null){
                   t=t.next;
               }
               t.next = n;
           }
       }
       Node t  = head;
       while(t != null){
           System.out.print(t.data + " ");
           t  = t.next;
        }
       System.out.println();
       
       
       System.out.println(findLength(head));
       
       System.out.println(findk(head,5));
       
       System.out.println(insertNode(head,5,100));
        t = head;
       while(t != null){
           System.out.print(t.data + " ");
           t  = t.next;
        }
       
    }
}
