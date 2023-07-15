class Node{
    public Object item;
    public Node next;
}
public class QueueImpUsingLinkedList {
    private int size;
    private Node head;
    private int front = -1, rear = -1;
    public QueueImpUsingLinkedList(int size) {
        this.head = null;
        this.size = size;
    }
    public void enqueue(int i) {
        if(front == size) {
            System.out.println("Queue is full");
        }else{
            if(front == -1) {
                front = rear = 0;
            }
            front++;
            Node n = new Node();
            n.item = i;
            n.next = this.head;
            this.head = n;
        }
    }
    public void dequeue() {
        if(rear >= front) {
            System.out.println("Queue is empty");
        }else{
            rear++;
            Node cur = this.head;
            Node prev = null;
            while(cur.next != null) {
                prev = cur;
                cur = cur.next;
            }
            System.out.println("The element removed is : " + cur.item);
            prev.next = null;
        }
    }
    public void display() {
        if(rear >= front) {
            System.out.println("Queue is empty");
        }else{
            Node curr = this.head;
            System.out.print("The elements of the queue are : ");
            for(int i = rear; i  < front; i++) {
                System.out.print(curr.item + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueImpUsingLinkedList q1 = new QueueImpUsingLinkedList(5);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(6);
        q1.enqueue(8);
        q1.display();
        q1.dequeue();
        q1.display();
    }
}
