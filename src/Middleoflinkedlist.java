public class Middleoflinkedlist {
   Node head;
   class Node{
       int data;
       Node next;
       Node(int data){
           this.data=data;
           this.next=null;
       }
       public Node findmiddle(Node head){
           Node hare=head;
           Node turtle=head;
           while(hare.next !=null || hare.next.next != null){
               hare=hare.next.next;
               turtle=turtle.next;
           }
           return  turtle;

       }

   }
}
