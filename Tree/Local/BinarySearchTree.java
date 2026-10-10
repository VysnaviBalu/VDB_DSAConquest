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

        Node findMinimum(Node root){
            while(root.left != null){
                root = root.left;
            }
            return root;
        }
        Node delete(Node root, int data){
            if(root == null){
                System.out.println("Not Found "+data);
                return null;
            }
            // Deleting a node with no child
            else if(root.data > data){
                root.left = delete(root.left, data);
            } else if (root.data < data) {
                root.right = delete(root.right, data);
            } else {
                if (root.left == null){
                    System.out.println("Deleted node "+data);
                    return root.right;
                } else if (root.right == null) {
                    System.out.println("Deleted node " + data);
                    return root.left;
                }

                Node successor = findMinimum(root.right);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
            return root;
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

            System.out.println("**** Traversal Before ****");
            bst.inOrderTraversalDisplay(bst.root); // 1 2 3 5 6 7 8 9
            System.out.println();

            // 1. Delete Node 3 (Leaf node)
            bst.root = bst.delete(bst.root, 3);

            // 2. Delete Node 9 (One child: it has a left child '8')
            bst.root = bst.delete(bst.root, 9);

            // 3. Delete Node 5 (Two children: root node)
           bst.root = bst.delete(bst.root, 5);

            System.out.println("\n**** Traversal After ****");
            bst.inOrderTraversalDisplay(bst.root); // 1 2 6 7 8
            System.out.println();
        }
}
