package adventure;

import java.util.Scanner;

import Final.Dialog;

public class Skeleton2 {

	public static void main(String[] args) {
		
		text();

	}
	
	public static void text() {
		String input4;
		String input5;
		int input6;
		int input7;
		String inputName;
		
		Scanner input = new Scanner(System.in);
		System.out.println(" And here begins your journey as a Skeleton sorcerer, the most tragic of them all. ");
		System.out.println("   	rise from thy grave child");
		System.out.println("   	Press any key to continue! ");
		input4 = input.next();
		
		System.out.println("You have risen out the grave and the graveyard is foggy but peaceful in all, \nAfter walking straight for five minutes"
				+ " you have encountered the strongest A posing man of your life." );
		System.out.println("Do you attack the old man? after this 1 is yes, 2 is no.  \nYes? \nOr \nNo");
		input5 = input.next();
		if (input5.equalsIgnoreCase("Yes") || input5.equalsIgnoreCase("y")) {
			System.out.println("You slowly approach the old man and \nthe"
					+ " old mans pose leaves you frightened and terrified, \nyou feel threatened do you attack? Yes or no?");
			input6 = input.nextInt();
			 if (input6 == 2 ) {
				System.out.println(" The old man grabs you with his mind and he confuzzles you with his A posing abilites, "
						+ "\nyou float in the air and he snaps your neck, you have died.  ");
			}
			 else if (input6 == 1) {
				  System.out.println(" You attacked the old man and the old man can't handle the lighting strike and is knocked back and now is T posing meaning he became passive"
				  		+ "\nthe now t posing man lets you through into a building. The building old and falling apart slowly. ");
				  System.out.println("This building holds the one and only staff of the dead, "
				  		+ "\nafter taking many turns and twists climbing and falling there is a big open part after falling into a cave,"
				  		+ "\nthis part of the cave many torches lighting it up and has a stone hut with alittle window, the cave has an underground lake, and is very damp."
				  		+ "\nThe stone hut has a little window with a torch and there is a humanoid, a Mangkukulam, approaching him. ");
				 System.out.println("The person speaks.\nMangkukulam: Name and purpose. Speak your name>> ");
				 inputName = input.next();
				 System.out.println("Mangkukulam: Well " + inputName + " you have stumbled deep down here, what do you need?"
						 + "\nSpeaking you say, You:I look for the Staff of the dead, \nMangkukulam:"
						 + " It lies in the middle of the rocks of the lake. after hearing this you decide to look."
						 + "\nYou see the rocks and the staff shining for no reason at the middle but there is what looks to be a siren also there. ");
				 
			 }
			 else {
				 System.out.println("Not a choice, Starting over." );
			 	Dialog.text();}
			
		}
		
	}

}
