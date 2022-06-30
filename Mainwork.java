import java.util.Scanner;
public class Mainwork extends GameFeatures  {
	
	public static boolean EnteredAlready;
	public static boolean UserGuess;
	public static boolean IsGameFinished;	
	public static String GuessTheRandomWords;	
	public static int MainGamelives = 0;
	public static int warnings;	
	public static char letters[];
	public static String LettersNotUsed;
	static Scanner scanner = new Scanner(System.in); //If player wants to play again
	static String loopanswer;
		
	public static void main(String[] args)  {
		
		do {
			warnings = 3;
			Startofgame(); // 1 - Prints rules etc
			UserLivesD(); // 2 - Shows lives modes
			WordLevel(); // 3 - Shows word levels
			GuessTheRandomWords = Featureswords[ (int) (Math.random()* Featureswords.length)]; //picks random index of array
			letters = new char[GuessTheRandomWords.length()];// Create an array to store already entered letters//helps with validation of user input 
			LettersNotUsed = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";//letters not used	
			StorePlayerInputs(); // 4 - Saves inputs from the player
			while (MainGamelives > 0) {//lives == 10
				LivesWarningsWordSize(); // 5 - Prints out warnings etc
				PlayerEntersLetters(); // 6 - Allows for input
				Printword(); // 7 - Prints the word/checks if game is done
				LettersandNumbererrors(); // 8 - Checks for input errors
				PrintNonUsedLetters(); // 9 - Prints letters the plater hasn't used
			    if(Mainwork.UserGuess ==  true && Mainwork.EnteredAlready == true) {
			    	GuessTheFullWord(); //10 - Lets player guess the full word
			    }
			    if(IsGameFinished) {//links to boolean above, if it is true then the game ends
			    	PlayerHasWon();
			    		break;
			    }
		    }
			if(MainGamelives == 0 || MainGamelives < 0) {
				PlayerHasLost();
		    }
		    System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n"); 	
		    boolean PlayAgain = true; 
		    while(PlayAgain == true){
			    try {
					System.out.println(" Would you like to play again? [Y/N]: ");
					loopanswer = scanner.next().toLowerCase();
				    if(loopanswer.equals("y")||loopanswer.equals("n")) {
				    	PlayAgain = false;
				    }else {
				    	throw new Exception();	    			 
				    }
			    }catch(Exception ex){
					 System.out.println(" Invalid input");
					 scanner.nextLine();
			    	}
		    } 
		} 	
		while(loopanswer.toLowerCase().equals("y"));
			System.out.println("Thank you for playing my game Hangman. The game has now ended. Goodbye!!");
		}
}