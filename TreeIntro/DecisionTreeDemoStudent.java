import java.util.Scanner;

/**
   This program demonstrates a decision tree for an animal
   guessing game.
*/
public class DecisionTreeDemoStudent
{
   public static void main(String[] args)
   {
      BinaryTree questionTree = new BinaryTree("Is it a mamal?",
          new BinaryTree("Does it have stripes?",
          
              new BinaryTree("is it a carnivore?",
                  new BinaryTree("It is a tiger."),
                  new BinaryTree("It is a zebra.")),
              new BinaryTree("It is a pig")),
   
          new BinaryTree("Does it fly?",
              new BinaryTree("It is an eagle."),
              new BinaryTree("Does it Swim",
                  new BinaryTree("It is a penguin."),
                  new BinaryTree("It is a ostrich"))));



      boolean done = false;
      Scanner in = new Scanner(System.in);
      while (!done)
      {
          
      }
   }
}
