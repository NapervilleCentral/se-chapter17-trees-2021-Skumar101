import java.util.Scanner;
/**
   Below is a renamed and modified version of the DecisionTreeDemo
   program from Section 17.2. Implement the animal guessing game described
   in Section 17.2.1. Start with the tree in Figure 4, but present
   the leaves as "Is it a(n) X?" If it wasn't, ask the user what the
   animal was, and ask for a question that is true for that animal
   but false for X. For example:

      Is it a mammal? Y
      Does it have stripes? N
      Is it a pig? N
      I give up. What is it? A hamster
      Please give me a question that is true for a hamster and false for a pig.
      Is it small and cuddly?

   In this way, the program learns additional facts.
   Use the BinaryTree class from Section 17.2.
*/
public class GuessingGame
{
   public static void main(String[] args)
   {
      BinaryTree questionTree = new BinaryTree("Is it a mammal?",
         new BinaryTree("Does it have stripes?",
            new BinaryTree("Is it a carnivore?",
               new BinaryTree("Is it a tiger?"),
               new BinaryTree("Is it a zebra?")),
            new BinaryTree("Is it a pig?")),
         new BinaryTree("Does it fly?",
            new BinaryTree("Is it an eagle?"),
            new BinaryTree("Does it swim?",
               new BinaryTree("Is it a penguin?"),
               new BinaryTree("Is it an ostrich?"))));

      BinaryTree current = questionTree;

      boolean done = false;
      String response;
      Scanner in = new Scanner(System.in);
      System.out.println("Let's play a guessing game.");
      String correct;
      String newQuestion;
      while (!done)
      {
        BinaryTree left = questionTree.left();
        BinaryTree right = questionTree.right();
        if(left.isEmpty() && right.isEmpty())
        {
           System.out.println(questionTree.data());
           System.out.println("Was this correct? Y/N");
           response = in.next();
           if(response.equals("Y"))
               done = true;
           else
               {
                   
                   System.out.println("What is the correct answer?");
                   correct = in.next();
                   System.out.println("What's a question that gets this answer?");
                   in.nextLine();
                   newQuestion = in.nextLine();
                   
               }
        }
        else
        {
            do{
                System.out.print(questionTree.data()+" Y/N");
                response = in.next().toUpperCase();
              }
              while(!response.equals("Y") && !response.equals("N"));
             if(response.equals("Y"))
              questionTree = left;
            else
                questionTree = right;  
          }
      }

      String message = "Great, " + current.data();
      System.out.println(message);
   }
}
