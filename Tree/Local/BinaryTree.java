package Tree.Local;

public class BinaryTree {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        Node root;

        BinaryTree(int data){
            root = new Node(data);
        }

        void insertLeft(Node node, int data){
            node.left = new Node(data);
        }

        void insertRight(Node node, int data){
            node.right = new Node(data);
        }

        void preOrderTraversalDisplay(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data);
            preOrderTraversalDisplay(root.left);
            preOrderTraversalDisplay(root.right);
        }

        void inOrderTraversalDisplay(Node root){
            if(root == null){
                return;
            }
            inOrderTraversalDisplay(root.left);
            System.out.print(root.data);
            inOrderTraversalDisplay(root.right);
        }

        void postOrderTraversalDisplay(Node root){
            if (root == null){
                return;
            }
            postOrderTraversalDisplay(root.left);
            postOrderTraversalDisplay(root.right);
            System.out.print(root.data);
        }

        public static void main(String[] args){
            BinaryTree binaryTree = new BinaryTree(1);
            binaryTree.insertLeft(binaryTree.root, 2);
            binaryTree.insertRight(binaryTree.root, 3);
            binaryTree.insertLeft(binaryTree.root.left, 4);
            binaryTree.insertRight(binaryTree.root.right,5);
            binaryTree.insertRight(binaryTree.root.right.right,6);
            System.out.println("\n**** Pre Order Traversal ****");
            binaryTree.preOrderTraversalDisplay(binaryTree.root);
            System.out.println("\n**** In Order Traversal ****");
            binaryTree.inOrderTraversalDisplay(binaryTree.root);
            System.out.println("\n**** Post Order Traversal ****");
            binaryTree.postOrderTraversalDisplay(binaryTree.root);
        }
}

