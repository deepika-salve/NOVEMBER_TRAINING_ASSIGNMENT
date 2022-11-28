package collection;

public class Q10InOrderTraversalOfBST {

	// Function to insert data in BST
    public static Node insert(Node root, int data)
    {
        if (root == null)
            return new Node(data);
        if (data < root.data)
            root.left = insert(root.left, data);
        if (data > root.data)
            root.right = insert(root.right, data);
        return root;
    }
 
    // InOrder function to display value of array
    // in sorted order
    public static void inOrder(Node root)
    {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
 
    // Driver Code
    public static void main(String []args){
        int arr[] = { 1, 2, 3, 2, 5, 4, 4 };
 
        // Finding size of array arr[]
        int n = arr.length;
 
        Node root = null;
        for (int i = 0; i < n; i++)
        {
            // Insert element of arr[] in BST
            root = insert(root,arr[i]);
        }
 
        // Inorder Traversal to print nodes of Tree
        inOrder(root);
    }
}
