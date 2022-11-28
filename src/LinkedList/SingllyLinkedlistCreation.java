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
            previous.next= node;
            node.next= current;


        }

    }

   public ListNode DeleteFirst(){
        if(head ==null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;

   }
    public ListNode DeleteLast(){

        if(head ==null|| head.next== null){
            return null;
        }
       ListNode current = head;
        ListNode prev = null;
        while(current.next != null){
            prev = current;
            current= current.next;

        }
        prev.next = null;
        return current;

    }
    public void DeleteAtPosition(int position){
        if(position==1){
            head = head.next;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }

    }
    public  boolean searchElement (int ele){
        ListNode current = head;
        while(current != null){
            if(current.data== ele){
                return true;

            }
            current = current.next;
        }
        return false;
    }
    public ListNode reversed(ListNode head){
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        SingllyLinkedlistCreation sing= new SingllyLinkedlistCreation();
        ListNode head= new ListNode(10);
//
//        ListNode second= new ListNode(1);
//        ListNode third= new ListNode(8);
//        ListNode fourth= new ListNode(11);
//        sing.head.next= second;
//        second.next= third;
//        third.next= fourth;
//        sing.insertFirstNode(25);
//        sing.insertAtEbdNode(13);
        sing.insertAtPosition(1,3);
        sing.insertAtPosition(2,5);
        sing.insertAtPosition(1,6);
        sing.insertAtPosition(1,70);
        sing.DeleteAtPosition(3);

      sing.display();
        System.out.println(sing.searchElement(1));
        sing.reversed(head);

        System.out.println("LikedList length = "+ sing.length());

    }

}
