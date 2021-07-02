public class main {

    public static void InOrder(Node current){
        if(current == null){
            return;
        }
        InOrder(current.left);
        System.out.print(current.data + " ");
        InOrder(current.right);

    }

    public static void PreOrder(Node current){
        if(current == null){
            return;
        }
        System.out.print(current.data + " ");
        PreOrder(current.left);
        PreOrder(current.right);
    }

    static void PostOrder(Node current){
        if (current == null){
            return;
        }
        PostOrder(current.left);
        PostOrder(current.right);
        System.out.print(current.data + " ");
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("InOrder:");
        InOrder(root);
        System.out.println();
        System.out.println("PreOrder:");
        PreOrder(root);
        System.out.println();
        System.out.println("PostOrder:");
        PostOrder(root);
    }

    static class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data){
            this(data, null, null);
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
