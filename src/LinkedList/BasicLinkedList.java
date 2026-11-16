package LinkedList;

public class BasicLinkedList {
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head = head.next;
        }
    }
    public static int mid(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int result = count / 2 + 1;
        int index = 1;
        temp = head;
        while (index<=result){
            if(index==result){
                return temp.data;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }
    public static Node mid2(Node head){
        if(head==null) return null;
         Node fast = head;
         Node slow = head;

         while(fast!=null && fast.next!=null) {
             slow = slow.next;
             fast = fast.next.next;
         }
         return slow;
         }
    public static void curse(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+"->");
        curse(head.next);
    }
    public static void main(String[] args){
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println("Method 1");
        System.out.print(a.data + "->");
        System.out.print(a.next.data+"->");
        System.out.print(a.next.next.data+"->");
        System.out.print(a.next.next.next.data+"->");
        System.out.print(a.next.next.next.next.data+"->");

        System.out.println();

        System.out.println("Mehtod 2");
        Node temp = a;
        for(int i = 0; i<5;i++){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println();

        System.out.println("Mehtod 3");
        Node temp2 = a;
        while(temp2 != null){
            System.out.print(temp2.data+"->");
            temp2 = temp2.next;
        }

        System.out.println();

        System.out.println("Method 4");
        display(a);

        System.out.println();

        System.out.println("Method 5");
         curse(a);
        System.out.println();
        System.out.print("Mid:");
        System.out.println(mid(a));
        System.out.println("Mid:"+mid(a));
    }
}
