/**
   This class implements a binary search tree whose
   nodes hold objects that implement the Comparable
   interface.
*/
public class BinarySearchTree
{
   private Node root;

   /**
      Constructs an empty tree.
   */
   public BinarySearchTree()
   {
      root = null;
   }

   /**
      Inserts a new node into the tree.
      @param obj the object to insert
   */
   public void add(Comparable obj)
   {
      Node newNode = new Node();
      newNode.data = obj;
      newNode.left = null;
      newNode.right = null;
      if (root == null) { root = newNode; }
      else { root.addNode(newNode); }
   }

    /**
     * Tries to find an object in the tree
     * @param obj the object to find
     * @return true if the object is contained in the tree
     */
    public boolean find(Comparable obj)
    {
        Node current = root;
        while(current!=null)
        {
            int f = root.data.compareTo(obj);
            if(f == 0)
                return true;
            else if(f>0)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    }

   /**
      Prints the contents of the tree in sorted order.
   */
   public void print()
   {
      print(root);
      System.out.println();
   }

   /**
      Prints a node and all of its descendants in sorted order.
      @param parent the root of the subtree to print
   */
   private static void print(Node parent)
   {
      if (parent == null) { return; }
      print(parent.left);
      System.out.print(parent.data + " ");
      print(parent.right);
   }

   /**
      A node of a tree stores a data item and references
      to the left and right child nodes.
   */
   class Node
   {
      public Comparable data;
      public Node left;
      public Node right;

      /**
         Inserts a new node as a descendant of this node.
         @param newNode the node to insert
      */
      public void addNode(Node newNode)
      {
          int comp = newNode.data.compareTo(this.data);
          if(comp<0)
          {
              if(left == null){left = newNode;}
              else
                  {
                      left.addNode(newNode);
                    }
            }
          else if(comp>0)
          {
              if(right == null)
              {
                  right = newNode;
                }
              else
              {
                  right.addNode(newNode);
                }
            }
      }
   }
}



