public class Main {
    public static void main(String[] args) {
        ReverseLL node = new ReverseLL();
        node.insert(5);
        node.insert(4);
        node.insert(3);
        node.insert(2);
        node.insert(1);
        node.display();
        node.d();
    }
}

public class ReverseLL {
    private Node head;
    public class Node {
        private int info;
        private Node next;
        public Node(int info) {
            this.info = info;
        }
    }
    public void insert(int info){
        Node newNode = new Node(info);
        if(head == null){
            head = newNode;
            return;
        }
        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = newNode;
    }
    public void display(){
        if(head == null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node cur = head;
        while (cur.next != null){
            System.out.print(cur.info+",");
            cur = cur.next;
        }
        System.out.println(cur.info);
    }
    public void display2(Node head){
        if(head == null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node cur = head;
        while (cur.next != null){
            System.out.print(cur.info+",");
            cur = cur.next;
        }
        System.out.println(cur.info);
    }
    public void d(){
        Node hell = rev(head);
        display2(hell);
    }
    public Node rev(Node head){
        Node n = head.next;
        Node t = head.next.next;
        Node p = head;
        p.next = null;
        n.next = p;
        p = n;
        n = t;
        t = t.next;
        while(t != null)
        {
            n.next = p;
            p = n;
            n = t;
            t = t.next;
        }
        if(t == null)
        {
            n.next = p;
            return n;
        }
        return n;
    }
}
