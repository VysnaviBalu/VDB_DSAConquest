package Tree.Local;

public class BinarySearchTree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        Node root;

        BinarySearchTree(int data){
            root = new Node(data);
        }

        void insertBinarySearchTree(Node root, int data){
            if(root == null){
                return;
            }
            if(root.data > data){
                if(root.left == null){
                    root.left = new Node(data);
                } else {
                    insertBinarySearchTree(root.left,data);
                }
            } else {
                if(root.right == null){
                    root.right = new Node(data);
                } else {
                    insertBinarySearchTree(root.right, data);
                }
            }
        }

        Node search(Node root, int data){
            if(root == null){
                System.out.println("Not Found "+data);
                return null;
            }

            if(root.data == data){
                System.out.println("Found "+data);
                return root;
            }

            if(root.data > data){
                return search(root.left, data);
            } else {
                return search(root.right, data);
            }
        }

        void inOrderTraversalDisplay(Node root){
            if(root == null){
                return;
            }
            inOrderTraversalDisplay(root.left);
            System.out.print(root.data);
            inOrderTraversalDisplay(root.right);
        }

        public static void main(String[] args){
            BinarySearchTree bst = new BinarySearchTree(5);
            bst.insertBinarySearchTree(bst.root,2);
            bst.insertBinarySearchTree(bst.root,1);
            bst.insertBinarySearchTree(bst.root,3);
            bst.insertBinarySearchTree(bst.root,7);
            bst.insertBinarySearchTree(bst.root,9);
            bst.insertBinarySearchTree(bst.root,8);
            bst.insertBinarySearchTree(bst.root,6);

            System.out.println("**** Traversal ****");
            bst.inOrderTraversalDisplay(bst.root);
            System.out.println("\n**** Search ****");
            bst.search(bst.root, 4);
            bst.search(bst.root, 8);
        }
}
