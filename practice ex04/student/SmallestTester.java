public class SmallestTester
{
   public static void main(String[] args)
   {
      BinarySearchTree names = new BinarySearchTree();
      names.add("Romeo");
      names.add("Juliet");
      names.add("Tom");
      names.add("David");
      names.add("Harry");

      System.out.println(names.smallest());
      System.out.println("Expected: David");
   }
}
