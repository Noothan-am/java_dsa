public class CircularLL {
    private Node head;
    private Node tail;
    public int size = 0;

    private class Node{
        private int info;
        private Node next;
        public Node(int info) {
            this.info = info;
        }
    }

    public void insertFront(int info){
        Node newNode = new Node(info);
        if(head == null){
            head = newNode;
            tail = newNode;
            size += 1;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
        size += 1;
    }
    public void insertRear(int info){
        Node newNode = new Node(info);
        if(head == null){
            head = newNode;
            tail = newNode;
            size += 1;
            return;
        }
        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
        size += 1;
    }
    public void insertAtIndex(int info,int index){
        if(index > size || index < 0){
            System.out.println("invalid index");
            return;
        }
        Node newNode = new Node(info);
        if(index == 0){
            insertFront(info);
            return;
        }
        if(index == size){
            insertRear(info);
            return;
        }
        Node cur = head;
        Node prev = null;
        int i = 0;
        while(i<index){
            prev = cur;
            cur = cur.next;
            i++;
        }
        prev.next = newNode;
        newNode.next = cur;
    }
    public void deleteFront(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        if(head == tail){
            System.out.println("element deleted is "+head.info);
            head = null;
            tail = null;
            size -= 1;
            return;
        }
        System.out.println("element deleted is "+head.info);
        head = head.next;
        tail.next = head;
        size -= 1;
    }
    public void deleteRear() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        if (head == tail) {
            System.out.println("element deleted is " + head.info);
            head = null;
            tail = null;
            size -= 1;
            return;
        }
        Node cur = head;
        while (cur.next != tail) {
            cur = cur.next;
        }
        System.out.println("element deleted is " + tail.info);
        cur.next = head;
        tail = cur;
        size -= 1;
    }
    public void deleteIndex(){

    }
    public void display(){
        if(head == null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node cur = head;
        while (cur != tail){
            System.out.print(cur.info+",");
            cur = cur.next;
        }
        System.out.println(cur.info);
    }
}
