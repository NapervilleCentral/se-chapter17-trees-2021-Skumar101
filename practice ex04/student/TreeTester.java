
/**
 * Write a description of class TreeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeTester
{
    public static void main()
    {
        BinarySearchTree t = new BinarySearchTree();
        t.add("D");
        t.add("B");
        t.add("A");
        t.add("C");
        t.add("F");
        t.add("E");
        t.add("I");
        t.add("G");
        t.add("H");
        t.add("J");
        
        System.out.println(t.find("G"));
        System.out.println(t.find("S"));
    }
}
