package faculdade.exercicios.arvore.AVL;

public class Teste {
	int data;
    Teste left, right;
    Teste(int d)
    {
        data = d;
        left = right = null;
    }
}
 
class BinaryTree {
    Teste root;
 
    /* Returns true if binary tree with root as root is
     * height-balanced */
    boolean isBalanced(Teste node)
    {
        int lh; /* for height of left subtree */
 
        int rh; /* for height of right subtree */
 
        /* If tree is empty then return true */
        if (node == null)
            return true;
 
        /* Get the height of left and right sub trees */
        lh = height(node.left);
        rh = height(node.right);
 
        if (Math.abs(lh - rh) <= 1 && isBalanced(node.left)
            && isBalanced(node.right))
            return true;
 
        /* If we reach here then tree is not height-balanced
         */
        return false;
    }
 
    /* UTILITY FUNCTIONS TO TEST isBalanced() FUNCTION */
    /*  The function Compute the "height" of a tree. Height
       is the number of nodes along the longest path from
       the root node down to the farthest leaf node.*/
    int height(Teste node)
    {
        /* base case tree is empty */
        if (node == null)
            return 0;
 
        /* If tree is not empty then height = 1 + max of
         left height and right heights */
        return 1
            + Math.max(height(node.left),
                       height(node.right));
    }
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Teste(9);
        tree.root.left = new Teste(5);
        tree.root.right = new Teste(12);
        tree.root.right.left = new Teste(11);
        tree.root.left.left = new Teste(3);
        tree.root.left.right = new Teste(6);
        tree.root.left.right.right = new Teste(7);
        tree.root.left.left.left = new Teste(2);
        tree.root.left.left.left.left = new Teste(1);
        tree.root.left.left.right = new Teste(4);
 
        if (tree.isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}
