import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
 String itemInJar;
  int maxNumberOfItemInJar;
  int numberOfItemInJar;
  int userGuess;
  int attempt = 0;
  Scanner reader = new Scanner(System.in);
  System.out.println("Administrator SetUp \n======================");
  System.out.print("What type of item are in the jar? ");
  itemInJar = reader.nextLine();
  System.out.print("Maximum number of "+ itemInJar + " in the jar?");
  maxNumberOfItemInJar = reader.nextInt();
  

  Jar jar = new Jar(itemInJar, maxNumberOfItemInJar);
  numberOfItemInJar = jar.getNumberOfItemInJar();

  System.out.println("\n\nPlayer\n======================");
  System.out.println("Your goal is to guess how many "+itemInJar + " are in the Jar. Your guess should be between 1 and " + maxNumberOfItemInJar);

  do{
    System.out.print("Guess: ");
    userGuess = reader.nextInt();
    attempt++;
  } while(userGuess != numberOfItemInJar );
  reader.close();
  
  System.out.println("NICE!! You guessed that there are "+ numberOfItemInJar +" "+itemInJar+ " in the jar"+ " and it took you "+ attempt +" tries.");
    }
}
