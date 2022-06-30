import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class GameFeatures   {
	
	public static int Featureslives;
	public static String[] Featureswords = {};
	public static Mainwork MainFeatures = new Mainwork();
	public static char letter;
	public static int Score;
	public static int GetLives;
	public static int WordMod;
	
	//1 - First Thing the Game does
		public static void Startofgame() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("\t W⃣E⃣L⃣C⃣O⃣M⃣E⃣ T⃣O⃣ H⃣A⃣N⃣G⃣M⃣A⃣N⃣ ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");	
			System.out.println("    ┃━━━━━+\n"
			+ "    ◉     ┃\n"
			+ "    ┃     ┃ \n"
			+ "   /┃\\    ┃ \n"
			+ "  / ┃ \\   ┃ \n " 
			+ "   ┃     ┃\n"
			+ "   /┃\\    ┃\n"
			+ "  /   \\   ┃\n " 
			+ "         ┃\n" 
			+" ━━━━━━━━━+");
			System.out.println("oo");
			System.out.println(" ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃");
			System.out.println(" ┃                                  GAME RULES                                     ┃");
			System.out.println(" ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃");
			System.out.println(" ┃ • To win the game you need to guess the random word which is selected!          ┃");
			System.out.println(" ┃ • If you run out of lives you lose!                                             ┃");
			System.out.println(" ┃ • DO NOT enter numbers when guessing the word or you will recieve a warning!    ┃");
			System.out.println(" ┃ • DO NOT enter a letter more than once or you will recieve a warning!           ┃");
			System.out.println(" ┃ • You have 3 warnings, once it hits 0 you will lose 1 life each time after      ┃");
			System.out.println(" ┃ • If you guess the full word wrong you lose 2 lives!                            ┃");
			System.out.println(" ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃");
			System.out.println();
			System.out.println( " Enter any key once you have read the rules: hi ");
			String Continue = scanner.nextLine();			
	}
	//2 User decides on how many lives they want
		public static void UserLivesD() {
			System.out.println("\n ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃\n"
						+" ┃    	        Lives             ┃\n"
				        +" ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃\n"
						+" ┃     [1] = Easy(10 lives)       ┃\n"
						+" ┃     [2] = Medium(7 lives)      ┃\n"
						+" ┃     [3] = Legendary(3 lives)   ┃\n"
						+" ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃\n");
			
			Scanner LivesScanner = new Scanner(System.in);
			boolean SelectLives = true;
			while(SelectLives == true){ // when SelectLives is true then it runs the loop, jumps out the loop when its false
				try {
					System.out.println(" Enter mode number: ");
					GetLives = LivesScanner.nextInt();
					if(GetLives == 1 || GetLives == 2 || GetLives == 3) {
						SelectLives = false; // if the conditions are true select lives are set to false and it jumps out the loop
					}else { // else throws an exception 
						throw new Exception();
					}
				}catch(Exception e) {
					System.out.println("Invalid input!!");
					LivesScanner.nextLine();
				}
			}	
			if(GetLives == 1) {
				Featureslives = 10;
				System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("   You have selected EASY Mode. You have 10 Lives!     ");
				System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println();
			}
			if(GetLives == 2) {
				Featureslives = 7;
				System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("   You have selected MEDIUM Mode. You have 6 Lives!   ");
				System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println();
			}
			if(GetLives == 3) {
				Featureslives = 3;
				System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("   You have selected LEGENDARY Mode. You have 2 Lives! ");
				System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println();
			}
			Mainwork.MainGamelives = Featureslives;		
	}		
	//3 - Decide on the level of word they want
		public static void WordLevel () {
			System.out.println("\n ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃\n"
					  +" ┃           Word Level           ┃\n"
			          +" ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃\n"
					  +" ┃     [1] = Easy words           ┃\n"
					  +" ┃     [2] = Moderate words       ┃\n"
					  +" ┃     [3] = Hard words           ┃\n"
					  +" ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃\n");
			Scanner WordLev = new Scanner(System.in);
			boolean SelectWordLevel = true;
			while(SelectWordLevel == true) {
				try {
					System.out.println("Enter mode number: ");
					WordMod = WordLev.nextInt();
					if(WordMod == 1 || WordMod == 2 || WordMod == 3) {
						SelectWordLevel = false;
					}else {
						throw new Exception();
					}
				}catch(Exception e){
					System.out.println("Inavlid Input!!!");
					WordLev.nextLine();
				}
			}
			if(WordMod == 1) {	
				String EasyWords[] = {"BED","CAR","TAB","CONTINUE","MAKE", "COME","HOUSE", "HAIR", "EAT","EYE","HELLO","AIR","COW","FOOD","SOAP"};
				Featureswords = EasyWords;
				System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("   Your random word chosen will now be an easy word!    ");
				System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			}
			if(WordMod == 2) {
				String ModWords[] = {"TELEVISION","GLASS","GNARLY","HEATER","SWIVEL","AUTOMOBILE","LAPTOP","POWER","KEYBOARD","ELECTRIC","TABLET","GALAXY"};
				Featureswords = ModWords;
				System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("   Your random word chosen will now be a moderate word! ");
				System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			}
			if(WordMod == 3) {
				String HardWords[] = {"COLONEL","IRONIC","IRREGARDLESS","WHOM","NONPLUSSED","DISINTERESTED","ENORMITY","OXYMORON","OXYGEN","EXODUS","FLAPJACK","BANJO"};
				Featureswords = HardWords;
				System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("   Your random word chosen will now be a hard word!    ");
				System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			}	
	}
	//5 - Saves correctly guessed letters and reveals them
		public static void StorePlayerInputs() {
			for (int i =0; i<Mainwork.letters.length; i++){
				Mainwork.letters[i] = '_';//Stores inputs from the player. Helps to validate if the game is finished or not and sets all letters to '_'
			}
	}
	//6 - //Displays amount of lives/size of word and warnings while playing the game
		public static void LivesWarningsWordSize() {
			System.out.println("\n\n------------------------------------------------------------------");
	    	System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	    	System.out.println(" • Random word has: " +  MainFeatures.GuessTheRandomWords.length() + " letters    ");
	    	System.out.println(" • Lives remaining: " + MainFeatures.MainGamelives + "            ");
	    	System.out.println(" • Warnings remaining: " + MainFeatures.warnings + "        ");
	    	System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	        System.out.println();
	        System.out.println(" Enter a letter: ");
	}
	
	//7 - Player inputs their guesses and this checks it agaisnt the random word
		public static void PlayerEntersLetters() {
			Scanner Playerinput = new Scanner(System.in);
			String input = Playerinput.next().toUpperCase();
			letter = input.charAt(0);//grabs 1st character from user and turns it from string to character - grabs index 0 from user input
			Mainwork.UserGuess = false;//set userguess to automatically false     
			for (int i = 0; i < Mainwork.GuessTheRandomWords.length(); i++) {
				char l = Mainwork.GuessTheRandomWords.charAt(i);//iterates through every chracter within the randomword selected and saved under variable l
					if (l == letter) {//checks if the Players Letter is equal to the letter within the random word
					Mainwork.letters[i] = l;// If it the Players letter is equal to l then it adds it to letters  
					Mainwork.UserGuess = true;//if the if statment is true then this becomes true    
				}
			}
			if (!Mainwork.UserGuess) {//compares it against if statement above, if the users guess is wrong then it takes away a life
				Mainwork. MainGamelives = Mainwork.MainGamelives - 1;
			} 
	}
	//8 - Prints players correct guesses within the word and checks if the game is finished or not
		public static void Printword() {
			Mainwork.IsGameFinished = true;//linked to the for loop and if statement below to check if the game is finished or not
	        System.out.print(" Word: " );	
	        for (int i = 0; i < Mainwork.letters.length; i++) {
	            if(Mainwork.letters[i] == '_') {//checks to see if there is still '_' within the program, if there is then the game doesn't finish
	            	Mainwork.IsGameFinished = false;// if there is still _ left then isgamefinished is false
	            }
	            System.out.print(Mainwork.letters[i]);//printing out letters 
	        }
	        System.out.println();
	        System.out.println();
	}
		
	//9 - Checks to see repeated letters and numbers, and hands out warnings accordingly	
		public static void LettersandNumbererrors() {
			Mainwork.EnteredAlready = false;
		    for(int i = 0; i < Mainwork.LettersNotUsed.length(); i++ ){
			    char l = Mainwork.LettersNotUsed.charAt(i);//sets to character l and looks through each character within it
			    if(l == letter) {// if l is equal to a charcter within lettersnotused then Enteredalready = true
			    	//else if there is an '_' in its place then it remains as false
			    Mainwork.EnteredAlready = true;//switches entered already to true 
			    }
		    }
		    if(letter >= '0' && letter <= '9' ) {
			     System.out.println(" ∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅");
			     System.out.println("   DO NOT ENTER NUMBERS");
			     System.out.println("   YOU HAVE NOW LOST 1 WARNING! ");
			     System.out.println(" ∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅");
				 Mainwork.warnings--;
				 Mainwork.MainGamelives++;
				 Mainwork.EnteredAlready = true; 			
		    }
		    if(!Mainwork.EnteredAlready) { //if there is an '_' then it remains false and this is triggered 
			       System.out.println();
				   System.out.println(" ∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅");
				   System.out.println("   DO NOT ENTER REPEAT LETTERS! ");
				   System.out.println("   YOU HAVE NOW LOST 1 WARNING! ");
				   System.out.println(" ∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅");
			       Mainwork.warnings--;
			       if(!Mainwork.UserGuess) {
			    	   		Mainwork.MainGamelives++;
			       }
		    }
		    if(Mainwork.warnings == -1) {
				System.out.println(" ∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅");
				System.out.println("   You have run out of warnings, 1 life will now be deducted! ");
				System.out.println(" ∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅");
				Mainwork.warnings++;
				Mainwork.MainGamelives--;
		    }    
	}
	//10 - Gives the player the opportunity to guess the full word	
		public static void GuessTheFullWord() {
			Scanner YesOrNo = new Scanner(System.in);
			Scanner FullWordGuess = new Scanner(System.in);
			System.out.println("Would you like to guess the full word [Y/N]: ");
			String YorN = YesOrNo.nextLine().toLowerCase();	
			if(YorN.equals("y")) {	
				System.out.println("\nYou have chosen to guess the full word. If you get this wrong you lose 2 lives!");
				System.out.println("\nEnter your full word guess: ");
				String GuessWord = FullWordGuess.nextLine().toLowerCase();
				if(GuessWord.equals(Mainwork.GuessTheRandomWords.toLowerCase())) {
					Mainwork.IsGameFinished = true;
				}
				else{
					System.out.println("\n∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅");
					System.out.println("You have failed to guess the word and thus have lost 2 lives!");
					System.out.println("∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅∅\n");
					Mainwork.MainGamelives = Mainwork.MainGamelives - 2;
					}
			}
			System.out.println("The game will now continue\n");	
		    System.out.println("------------------------------------------------------------------\n");
	}
	//11 - Stores and prints letters the player hasn't used
		public static void PrintNonUsedLetters() {
			Mainwork. LettersNotUsed = Mainwork.LettersNotUsed.replace(letter, '_'); 
		    System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		    System.out.println("  Letters not used yet: " + Mainwork.LettersNotUsed + " ");
		    System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
		    System.out.println("------------------------------------------------------------------\n");
	}
	// 12 - Displays whether they have won or not
		public static void PlayerHasWon()  {
			String UniqueLetters = MainFeatures.GuessTheRandomWords; // sets UniqueLetters to the randmword
			String StoresUniqueLetters = ""; // stores the letters 
			for (int i = 0; i < UniqueLetters.length(); i++){
				char AddsUniqueLetters = UniqueLetters.charAt(i); // iterating through test and adding it to current 
				if (StoresUniqueLetters.indexOf(AddsUniqueLetters) < 0){ // finds something at more than one instance then it triggers the else statment
					StoresUniqueLetters = StoresUniqueLetters + AddsUniqueLetters; 
					} else {
						StoresUniqueLetters = StoresUniqueLetters.replace(String.valueOf(AddsUniqueLetters),""); // when it finds something twice it gets blanked out
				}
			}
			Score = MainFeatures.MainGamelives * StoresUniqueLetters.length();
			System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("                           ░Y░O░U░ ░H░A░V░E░ ░W░O░N░                             ");
			System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println(" • Congratulations, you guessed the word " +  MainFeatures.GuessTheRandomWords + " successfully!!!"); 
			System.out.println(" • Your score is: " + Score);//score of the user guesses remaining*letters in word 
	}
	//13 - Displays whether the Player has lost or not 
		public static void PlayerHasLost() {
			System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("                            ░Y░O░U░ ░H░A░V░E░ ░L░O░S░T░                             ");
			System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println(" • You have run out of lives. The game has now ended! ");
			System.out.println(" • Unfortunately, you failed to guess the word " + MainFeatures.GuessTheRandomWords + ". Better luck next time!");
			System.out.println(" • Your score is 0");		
	}
}