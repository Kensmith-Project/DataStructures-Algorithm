package LinkedList;

public class SingllyLinkedlistCreation {


    private ListNode head;
    private static  class ListNode{
        private int data; //Generic Type
        private ListNode next;
        public  ListNode(int data){
            this.data= data;
            this.next = null;
        }


    }
//   int lengthOfSinglyLinkedList = 0;
    public void display(){
        ListNode current = head;
        while(current != null){

            System.out.print(current.data + " --> ");
            current= current.next;
        }
        System.out.print("null");
        System.out.println("");

    }
    int lengthOfSinglyLinkedList = 0;
    public int length(){

        ListNode current = head;
        if(current== null){
            return  0;
        }
        while(current != null){
            lengthOfSinglyLinkedList++;
            current= current.next;
        }

        return  lengthOfSinglyLinkedList;

    }
    public void insertFirstNode(int value){
       ListNode newNode = new ListNode(value);
       newNode.next= head;
       head = newNode;

    }
    public void insertAtEbdNode(int value){
        ListNode newNode = new ListNode(value);
       if(head == null){
           head = newNode;
           return;
       }
       ListNode current = head;
       while(current.next != null){
           current = current.next;
       }
       current.next = newNode;

    }
    public  void insertAtPosition(int position, int value){
        ListNode node = new ListNode(value);
        if(position== 1){
            node.next= head;
            head = node;

        }else{
            ListNode previous = head;
            int count =1;
            while(count< position-1){
                previous = previous.next;
                count++;

            }

            ListNode current = previous.next;
            node.next= current;
            previous.next= node;

        }

    }

    public static void main(String[] args) {
        SingllyLinkedlistCreation sing= new SingllyLinkedlistCreation();
        sing.head= new ListNode(10);

        ListNode second= new ListNode(1);
        ListNode third= new ListNode(8);
        ListNode fourth= new ListNode(11);
        sing.head.next= second;
        second.next= third;
        third.next= fourth;
        sing.insertFirstNode(25);
        sing.insertAtEbdNode(13);
      sing.display();
      sing.insertAtPosition(3,70);
        System.out.println("LikedList length = "+ sing.length());

    }

}
