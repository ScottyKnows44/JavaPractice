public class main {
    public static void main(String[] args) {
        Node head = new Node(1, null, null);
        Node tail = new Node(2, null, null);
        head.next = tail;
        tail.prev = head;
        add(1,3, head, tail);
        add(3,5,head, tail);
        print(head);
        System.out.println("Size is: " + getSize(head));
        System.out.println(tail.data);
    }

    public static int getSize(Node root){
        int current = 0;
        while(root != null){
            current++;
            root = root.next;
        }
        return current;
    }

    public static void print(Node root){
        while(root != null){
            System.out.println(root.data);
            root = root.next;
        }
    }

    public static void add(int index, int data,Node root, Node tail){
        if(index >= 1 && index <= getSize(root)){
            if(index == getSize(root)){
                Node newNode = new Node(data, null,null);
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            } else{
                int current = 1;
                while(current < index && root.next != null){
                    root = root.next;
                    current++;
                }
                Node newNode = new Node(data, null, null);
                Node temp = root.next;
                root.next = newNode;
                newNode.prev = root;
                newNode.next = temp;
                temp.prev = newNode;
            }
        }

    }

    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }
}
