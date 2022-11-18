
/**
 * Write a description of class TreeDemoSimple here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeDemoSimple
{
    public static void main()
    {
        BinaryTree t5 = new BinaryTree("Charlie");
        BinaryTree t4 = new BinaryTree("Savannah");
        BinaryTree t2 = new BinaryTree("Peter", t4,null);
        BinaryTree t3 = new BinaryTree("Zara",null,t5);
        //BinaryTree t3 = new BinaryTree("Zara");
        BinaryTree t1 = new BinaryTree("Anne",t2,t3);
        System.out.println("Expected: 2");
        System.out.println("Size: "+t1.countNodesWithOneChild());

    }
    
}
