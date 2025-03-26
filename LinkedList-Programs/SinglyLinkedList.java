import java.util.Stack;

public class SinglyLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static Node head;
    public static Node tail; 
    public static int size;
    
    public static void addFirst(int data){
       
        Node n=new Node(data);
        size++;
        if(head==null){
         
           head=tail=n;

        }  
            n.next=head;
            head=n;
    }

    public static void addLast(int data){
       
        Node n=new Node(data);
        size++;
        if(head==null){
            n.next=null;
            head=tail=n;
        }
        else{
        
            Node temp=head;

            while(temp.next!=null){
                temp=temp.next;
            }
            
            temp.next=n;
            tail=n;
        }
    }

    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("Currrent Size is :"+size);
    }

    public static void addMid(int data,int k){
       
        if(head==null){
            addFirst(data);
           
        }
        Node temp=head;
        for(int i=1;i<k-1;i++){
           temp=temp.next; 
        }
        Node n=new Node(data);
        size++;
        n.next=temp.next;
        temp.next=n;
    }

    public static void removeFirst(){
        if(head==null){
            print();
        }
        if(size==1){
            head=null;
           print();
        }
        else{
            size--;
            head=head.next;
            print();
        }

    }

    public static void RemoveLast(){
        if(head==null){
            print();
        }
        if(size==1){
            head=null;
           print();
        }
        else{

           Node temp=head;
           while(temp.next.next!=null){
            temp=temp.next;
           }
           temp.next=null;
           size--;
           print();
        }
    }

    public static boolean isPallindrome(Node Head){
        if(head==null){
            return false;
        }
        Node slow =Head;
        Node fast=Head;
        Stack<Integer> stk=new Stack<>();
        while(fast!=null && fast.next!=null){
            stk.push(slow.data);
            slow=slow.next;
            fast=fast.next.next;

        }

        //If LinkedList has odd number of nodes->  1-->0-->1-->null 
        if(fast!=null){
            slow=slow.next;
        }


        while(slow!=null){
            int temp=stk.pop();
            if(temp==slow.data){
                slow=slow.next;
            }
            else{
                return false;
            }
           
        }
        return true;
    }
    

    //reverse a linked list
    public static void reverse(){
        Node curr=head;
        Node next=null;
        Node prev=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
       head=prev;

    }
    public static void main(String[] args) {
        
      addLast(1);
    //   addLast(2);
    //   addLast(3);
     // addLast(3);
      addLast(0);
      addLast(1);
   // addMid(5,3);
        print();
     //   System.out.println();
        System.out.println(size);
     ////   removeFirst();
      //  System.out.println(size);
        //RemoveLast();
        System.out.println(isPallindrome(head));
     //  reverse();
      // print();
    }
}
