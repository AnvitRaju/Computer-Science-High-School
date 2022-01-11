import java.util.Scanner;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
*
* @author anvit raju
*/
public class GameOfficial {

static String[] inventory = new String[10];
static int invSize = 0;

static String[] notebook = new String[50];
static int NoteSize = 0;

static int playerhp = 120;
static int enemyhp = 100;

static int playerdmg;
static int enemydmg;

public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);

System.out.println("Hi there, what is your name?");
String name = keyboard.nextLine();

System.out.println("");
System.out.println("Hi " + name + "." + " You are in a critical situation.");//how do you do that thing where the lines automatically adjusts in answer
System.out.println("You have gone for a regular check-up today, and hear that your doctor");
System.out.println("is trying to kill you. They don't know that you figured out their plan.");
System.out.println("You have exactly 20 minutes to escape the hospital before the doctor enters.");
System.out.println("You are currently at the hospital, and you have to look around for clues.");
System.out.println("You can note down things in your notebook anytime during the game.");
System.out.println("--------------------------------------------------------------------------");
System.out.println("*Hint* Pay attention to colors");

System.out.println("███████╗███████╗ ██████╗ █████╗ ██████╗ ███████╗ ████████╗██╗ ██╗███████╗ ██╗ ██╗ ██████╗ ███████╗██████╗ ██╗████████╗ █████╗ ██╗ ██╗\n"
+ "██╔════╝██╔════╝██╔════╝██╔══██╗██╔══██╗██╔════╝ ╚══██╔══╝██║ ██║██╔════╝ ██║ ██║██╔═══██╗██╔════╝██╔══██╗██║╚══██╔══╝██╔══██╗██║ ██║\n"
+ "█████╗ ███████╗██║ ███████║██████╔╝█████╗ ██║ ███████║█████╗ ███████║██║ ██║███████╗██████╔╝██║ ██║ ███████║██║ ██║\n"
+ "██╔══╝ ╚════██║██║ ██╔══██║██╔═══╝ ██╔══╝ ██║ ██╔══██║██╔══╝ ██╔══██║██║ ██║╚════██║██╔═══╝ ██║ ██║ ██╔══██║██║ ╚═╝\n"
+ "███████╗███████║╚██████╗██║ ██║██║ ███████╗ ██║ ██║ ██║███████╗ ██║ ██║╚██████╔╝███████║██║ ██║ ██║ ██║ ██║███████╗██╗\n"
+ "╚══════╝╚══════╝ ╚═════╝╚═╝ ╚═╝╚═╝ ╚══════╝ ╚═╝ ╚═╝ ╚═╝╚══════╝ ╚═╝ ╚═╝ ╚═════╝ ╚══════╝╚═╝ ╚═╝ ╚═╝ ╚═╝ ╚═╝╚══════╝╚═╝\n"
+ " ");
System.out.println(" .---------.\n"
+ " _ |:: [-=-] |\n"
+ " | | |_________|\n"
+ " |~|\n"
+ " |_| ,;;;;,\n"
+ " I\\ ,__ ,;;;, __, ///\\\\\\\\\\\n"
+ " I |{ / . . \\ } / \" \\\\||\n"
+ " I | ) ( _ ) ( \\_= _///\n"
+ " I |{___'-. .-'___}\\___ )_\\\n"
+ " I ||~/,'~~~~~,\\~~|'---(( \\\n"
+ " I \\ // \\\\ | \\ \\ \\\n"
+ " I \\/ // | | /-/\n"
+ " I (/ (/ | |/||\\\n"
+ " I | | | |\n"
+ " I | | |____/\n"
+ " I :-----_o_-----: || |\n"
+ " I | /~~|===|~~\\ | (( |\n"
+ " I || |===| || ||_/\n"
+ " /^\\ \"~ '^^^' \"\" ((__|");

System.out.println("");
System.out.println("--------------------------------------------------------------------------");
System.out.println("Please enter 'go forward', 'go back', 'go right', 'go left', or 'forward', 'back', 'right', 'left', and exit room as the game progresses.");
System.out.println("In addition, please enter 'no', 'yes', or 'n', 'yes' for answering simple yes or no questions.");
System.out.println("Make sure to visit every place in the location. There could be clues.");
System.out.println("Alright, lets begin the adventure! You are at the entrance.");
System.out.println("");

String location = "entrance"
boolean won = false;

System.out.println("You see two posters of the founders of the hospital. Would you like to know about them?");

notebook[NoteSize] = "Picture of Blake Tilton in a background color of red"
NoteSize++;
notebook[NoteSize] = "Picture of John Blue"
NoteSize++;

while ("entrance".equals(location)) {
String entrance = keyboard.nextLine();
System.out.println("");

if ("open notebook".equalsIgnoreCase(entrance)) {
notebook();
}
if ("open inventory".equalsIgnoreCase(entrance)) {
inventory();

} else if ("yes".equalsIgnoreCase(entrance)) {
System.out.println("You found a clue; you might want to note it down in your notebook.");
System.out.println("To access your notebook, say open notebook.");
System.out.println("The picture on the left show a picture of Blake Tilton in a background color of red.");
System.out.println("The picture on the right shows a picture of John Blue.");
System.out.println("");
System.out.println("What would you like to do now?");
} else if ("no".equalsIgnoreCase(entrance) || "n".equalsIgnoreCase(entrance)) {
System.out.println("Are you sure, there might be a clue?");
} else if ("go forward".equalsIgnoreCase(entrance) || "forward".equalsIgnoreCase(entrance)) {
System.out.println("You have now gone past the entrance.");
System.out.println("Would like to go to the laboratory, or enter the elevator, or search the bottom floor first?");
} else if ("go left".equalsIgnoreCase(entrance) || "go right".equalsIgnoreCase(entrance) || "go back".equalsIgnoreCase(entrance) || "left".equalsIgnoreCase(entrance) || "right".equalsIgnoreCase(entrance) || "back".equalsIgnoreCase(entrance)) {
System.out.println("There is nothing behind, to the right of you, or to the left you. You can only go forward from the entrance.");
} else if ("go to the laboratory".equalsIgnoreCase(entrance) || "laboratory".equalsIgnoreCase(entrance) || "lab".equalsIgnoreCase(entrance)) {
System.out.println("Hurry up, you will be late for your appointment.");
System.out.println("To get there, go to the bottom floor, and enter room #1.");
} else if ("enter the elevator".equalsIgnoreCase(entrance) || "elevator".equalsIgnoreCase(entrance)) {
System.out.println("Hurry up, you will be late for your appointment.");
System.out.println("To get there, go to the bottom floor, and enter room #1.");
} else if ("search the bottom floor".equalsIgnoreCase(entrance) || "bottom floor".equalsIgnoreCase(entrance) || "search bottom floor".equalsIgnoreCase(entrance)) {
System.out.println("You are at the bottom floor.");
System.out.println("Hurry up, you will be late for your appointment. Go to room 1.");
location = "bottom floor"
} else if ("go to room 1".equalsIgnoreCase(entrance) || "room1".equalsIgnoreCase(entrance) || "room 1".equalsIgnoreCase(entrance)) {
location = "room 1"
}

}

long end = System.currentTimeMillis() + 120000;

while (end > System.currentTimeMillis() && !won) {
switch (location) {
case "bottom floor":

System.out.println("");
while ("bottom floor".equals(location)) {
String bottomfloor = keyboard.nextLine();

if (bottomfloor.equals("room 1")) {
location = "room 1"
}

}
break;

case "room 1":

System.out.println("");
System.out.println("You are now in room #1.");
System.out.println("Now the mission begins. The nurse has told you to wait in the waiting room for 20 minutes.");
System.out.println("You have to mix 2 acids together, given four acids located in different locations.");
System.out.println("Where would you like to go now?");

while ("room 1".equals(location)) {
String room1 = keyboard.nextLine();
System.out.println("");

if ("open notebook".equalsIgnoreCase(room1) || "notebook".equalsIgnoreCase(room1)) {
notebook();
} else if ("open inventory".equalsIgnoreCase(room1) || "inventory".equalsIgnoreCase(room1)) {
inventory();
} else if ("go forward".equalsIgnoreCase(room1) || "forward".equalsIgnoreCase(room1)) {
System.out.println("You are going back to the waiting room. You have already been there.");//problem with locations
location = "entrance"
} else if ("go left".equalsIgnoreCase(room1) || "left".equalsIgnoreCase(room1)) {
System.out.println("You are now headed towards hallway #2. There are a bunch of waiting rooms to the right and left of you.");
System.out.println("You might want to go visit another room to search for items. ");
System.out.println("Do you still wish to go down the hall?");//copy all the same code in the beginning

String room1g = keyboard.nextLine();

if ("yes".equalsIgnoreCase(room1g) || "y".equalsIgnoreCase(room1g)) {
location = "hallway 2"
} else if ("no".equalsIgnoreCase(room1g) || "n".equalsIgnoreCase(room1g)) {
System.out.println("You are headed back to room 1.");
System.out.println("Where would you like to go now?");
location = "room 1"
}

} else if ("go right".equalsIgnoreCase(room1) || "right".equalsIgnoreCase(room1)) {
System.out.println("There is a dead end. Sorry!");
System.out.println("You have found a small note on the ground with a code 'chingchongmingmong'.");
System.out.println("Would you like to note it down in your notebook?");

String room1g = keyboard.nextLine();

if ("yes".equalsIgnoreCase(room1g) || "y".equalsIgnoreCase(room1g)) {
notebook[NoteSize] = "Code: chingchongmingmong"
NoteSize++;
System.out.println("The note 'Code: chingchongmingmong' has been stored in your notebook.");
location = "dead end1"
} else if ("no".equalsIgnoreCase(room1g) || "n".equalsIgnoreCase(room1g)) {
location = "dead end1"
}

} else if ("go back".equalsIgnoreCase(room1) || "back".equalsIgnoreCase(room1)) {
System.out.println("You are going towards room #2. That is just another empty wating room.");
location = "room 2"
}

}

break;

case "room 2":

while ("room 2".equals(location)) {

System.out.println("");
String room2 = keyboard.nextLine();

if ("open notebook".equalsIgnoreCase(room2) || "notebook".equalsIgnoreCase(room2)) {
notebook();
}
if ("open inventory".equalsIgnoreCase(room2) || "inventory".equalsIgnoreCase(room2)) {
inventory();
}

if ("go left".equalsIgnoreCase(room2) || "left".equalsIgnoreCase(room2)) {
System.out.println("Nothing is there.");
} else if ("go right".equalsIgnoreCase(room2) || "right".equalsIgnoreCase(room2)) {
System.out.println("Nothing is there.");
} else if ("go forward".equalsIgnoreCase(room2) || "forward".equalsIgnoreCase(room2)) {//keeps saying "you are in hallway 2..."
System.out.println("Nothing is there.");
} else if ("go back".equalsIgnoreCase(room2) || "back".equalsIgnoreCase(room2)) {
System.out.println("You are going back to room 1.");
location = "room 1"
}

break;
}

case "dead end1":

while ("dead end1".equals(location)) {

System.out.println("");
String deadend = keyboard.nextLine();

if ("open notebook".equalsIgnoreCase(deadend) || "notebook".equalsIgnoreCase(deadend)) {
notebook();
}
if ("open inventory".equalsIgnoreCase(deadend) || "inventory".equalsIgnoreCase(deadend)) {
inventory();
}

if ("go left".equalsIgnoreCase(deadend) || "left".equalsIgnoreCase(deadend)) {
System.out.println("Nothing is there.");
location = "dead end1"
} else if ("go right".equalsIgnoreCase(deadend) || "right".equalsIgnoreCase(deadend)) {
System.out.println("Nothing is there.");
location = "dead end1"
} else if ("go forward".equalsIgnoreCase(deadend) || "forward".equalsIgnoreCase(deadend)) {
System.out.println("Nothing is there.");
location = "dead end1"
} else if ("go back".equalsIgnoreCase(deadend) || "back".equalsIgnoreCase(deadend)) {
System.out.println("You are going back to room 1.");
location = "room 1"
}

}
break;
case "hallway 2":

System.out.println("");
System.out.println("You are now in hallway 2. ");
System.out.println("You keep walking and then you see a straight dead end.");
System.out.println("But there are there 2 nurses covering a huge metal circular door if u look to the left midway.");
System.out.println("This seems to be going to some other location in the hospital");
System.out.println("Press enter");

while ("hallway 2".equalsIgnoreCase(location)) {

String hallway2 = keyboard.nextLine();

System.out.println("Would you like to attack the nurses to see what is past the door? ");

if ("open notebook".equalsIgnoreCase(hallway2) || "notebook".equalsIgnoreCase(hallway2)) {
notebook();
}
if ("open inventory".equalsIgnoreCase(hallway2) || "inventory".equalsIgnoreCase(hallway2)) {
inventory();
}

if ("yes".equalsIgnoreCase(hallway2) || "y".equalsIgnoreCase(hallway2)) {
System.out.println("");
System.out.println("The fight has begun. To punch the nurse, press 'enter' during the fight.");

while (playerhp > 0 && enemyhp > 0 && !won) {

System.out.println("Press enter to punch");
keyboard.nextLine();

playerdmg = (int) (Math.random() * 20) + 1;
enemydmg = (int) (Math.random() * 20) + 1;

playerhp -= enemydmg;
enemyhp -= playerdmg;

System.out.println("The enemy has done " + enemydmg + " damage to you.");
System.out.println("You have done " + playerdmg + " damage to the nurse.");
System.out.println("You are currently at " + playerhp + " hp");
System.out.println("The nurse is currently at " + enemyhp + " hp");

}
} else if ("no".equalsIgnoreCase(hallway2) || "n".equalsIgnoreCase(hallway2)) {
System.out.println("You are trapped in an unfortunate situation.");
System.out.println("There are security gaurds behind you walking.");
System.out.println("The only option is for you to fight them.");
System.out.println("");
System.out.println("The fight has begun. To punch the nurse, press 'enter' during the fight.");

while (playerhp > 0 && enemyhp > 0 && !won) {

System.out.println("Press enter to punch");
keyboard.nextLine();

playerdmg = (int) (Math.random() * 20) + 1;
enemydmg = (int) (Math.random() * 20) + 1;

playerhp -= enemydmg;
enemyhp -= playerdmg;

System.out.println("The enemy has done " + enemydmg + " damage to you.");
System.out.println("You have done " + playerdmg + " damage to the nurse.");
System.out.println("You are currently at " + playerhp + " hp");
System.out.println("The nurse is currently at " + enemyhp + " hp");

}

}
if (enemyhp <= 0 && playerhp > 0) {
System.out.println("");
System.out.println("Congratulations " + name + "." + " You have defeated the nurse. What a great accomplisment.");
System.out.println("You are now entering level 2!");

location = "lab1"

} else if (enemyhp > 0 && playerhp <= 0) {
System.out.println("You have died. You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
} else if (enemyhp < 0 && playerhp < 0) {
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
}
}
break;

case "lab1":

System.out.println("Since you have defeated the nurses, you are heading towards the laboratory.");
System.out.println("You see extra nurse clothing hanged on a rack. Would you like to put it on?");//infinite loop

while ("lab1".equals(location)) {
String lab1 = keyboard.nextLine();

if ("open notebook".equalsIgnoreCase(lab1)) {
notebook();
}
if ("open inventory".equalsIgnoreCase(lab1)) {
inventory();
}

if ("yes".equalsIgnoreCase(lab1)) {
System.out.println("You have put on the nurse's clothing.");
location = "lab2g"
} else if ("no".equalsIgnoreCase(lab1)) {
System.out.println("You might be in danger!");
location = "lab2b"
}

}
break;

case "lab2g":

System.out.println("");
System.out.println("A nurse just walked right past you. Looks like you are safe.");
System.out.println("What would you like to do now?");

while ("lab2g".equals(location)) {

String lab2g = keyboard.nextLine();

if ("open notebook".equalsIgnoreCase(lab2g)) {
notebook();
}
if ("open inventory".equalsIgnoreCase(lab2g)) {
inventory();
}

if ("go forward".equalsIgnoreCase(lab2g)) {
System.out.println("You see 5 cabinets.");
System.out.println("Would you like to search them?");

String lab2g1 = keyboard.nextLine();
if ("yes".equalsIgnoreCase(lab2g1)) {
System.out.println("You have found an injection needle.");
System.out.println("Would you like to store it?");

String lab2g2 = keyboard.nextLine();
if ("yes".equalsIgnoreCase(lab2g2)) {
System.out.println("The injection needle has been added to your inventory.");
inventory[invSize] = "Injection needle"
invSize++;
System.out.println("Where would you like to go next?");
System.out.println("You probably want to visit all the locations before you proceed.");
System.out.println("Once you have visited all the places in the lab, type 'next location'.");
} else if ("no".equalsIgnoreCase(lab2g1)) {
System.out.println("Where would you like to go next?");
location = "lab2g"
}
}
} else if ("go left".equalsIgnoreCase(lab2g)) {
System.out.println("You see a computer with some test tubes beside it.");
System.out.println("Would you like to log into the computer?");

String logcomp = keyboard.nextLine();

if ("yes".equalsIgnoreCase(logcomp)) {
System.out.println("Please enter the code to log in: ");
if ("chingchongmingmong".equalsIgnoreCase(logcomp)) {//if i say open notebook and then type code nothing happens
System.out.println("You have logged into the computer.");
System.out.println("One file in the computer says that test tube A has ethanol in it.");
System.out.println("This will be added to your inventory.");

notebook[NoteSize] = "You found ethanol in test tube A"
NoteSize++;

inventory[invSize] = "ethanol"
invSize++;

System.out.println("You found one of the four acids! You still have to find more.");
System.out.println("You probably want to visit all the locations before you proceed.");
System.out.println("Once you have visited all the places in the lab, type 'next location'.");

} else {//how do you do if they dont type this word then print incorrect...
System.out.println("Incorrect password, sorry. You have been caught by the security.");
System.out.println("Please restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
}
}

} else if ("go right".equalsIgnoreCase(lab2g)) {
System.out.println("There is some liquid in the blue sink not all washed away.");
System.out.println("Would you like to examine what element it is?");

String lab2g1 = keyboard.nextLine();

if ("yes".equalsIgnoreCase(lab2g1) || "y".equalsIgnoreCase(lab2g1)) {
System.out.println("You have identified that the element is hydrogen.");
System.out.println("You now have hydrogen in your inventory.");

notebook[NoteSize] = "You found hydrogen in the blue sink"
NoteSize++;

inventory[invSize] = "hydrogen"
invSize++;

System.out.println("You found one of the four acids! You still have to find more.");
System.out.println("You probably want to visit all the locations before you proceed.");
System.out.println("Once you have visited all the places in the lab, type 'next location'.");

} else if ("no".equalsIgnoreCase(lab2g1) || "n".equalsIgnoreCase(lab2g1)) {
System.out.println("You probably want to visit all the locations before you proceed.");
System.out.println("Once you have visited all the places in the lab, type 'next location'.");
}
} else if ("go back".equalsIgnoreCase(lab2g) || "back".equalsIgnoreCase(lab2g)) {
System.out.println("You are going back to the entrance of the laboratory.");
location = "lab1"
}
if ("next location".equalsIgnoreCase(lab2g)) {
System.out.println("You are heading out of the laboratory and heading to waiting room 1.");
location = "wroom1"
}
}
break;

case "lab2b":

System.out.println("You have died. You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
location = ""
break;

case "wroom1":

System.out.println("You are now in waiting room 1.");
System.out.println("You see cabinets to your right.");
System.out.println("Would you like to search them?");

String wroom1 = keyboard.nextLine();

while ("wroom1".equals(location)) {

if ("open notebook".equalsIgnoreCase(wroom1) || "notebook".equalsIgnoreCase(wroom1)) {
notebook();
}
if ("open inventory".equalsIgnoreCase(wroom1) || "inventory".equalsIgnoreCase(wroom1)) {
inventory();
}

if ("yes".equalsIgnoreCase(wroom1) || "y".equalsIgnoreCase(wroom1)) {
System.out.println("You have found a small bottle of nitric acid.");

String w2room1 = keyboard.nextLine();

System.out.println("Would you like to store it");

notebook[NoteSize] = "You found nitric acid in the green cabinet."
NoteSize++;

inventory[invSize] = "nitric acid"
invSize++;

if ("yes".equalsIgnoreCase(w2room1) || "y".equalsIgnoreCase(w2room1)) {
System.out.println("A bottle of nitric acid has been stored in your inventory.");
System.out.println("You found one of the four acids! You still need to find one more");
} else if ("no".equalsIgnoreCase(w2room1) || "n".equalsIgnoreCase(w2room1)) {
location = "bhallway3"
}
} else if ("no".equalsIgnoreCase(wroom1) || "n".equalsIgnoreCase(wroom1)) {
location = "bhallway3"
}
}
break;

case "bhallway3":

System.out.println("While you are heading down to hallway 3, you see a nurse who has a suspicious look on her face.");
System.out.println("Would you like to attack her?");

String bhallway3 = keyboard.nextLine();

while ("bhallway3".equals(location)) {

if ("open notebook".equalsIgnoreCase(bhallway3) || "notebook".equalsIgnoreCase(bhallway3)) {
notebook();
}
if ("open inventory".equalsIgnoreCase(bhallway3) || "inventory".equalsIgnoreCase(bhallway3)) {
inventory();
}

if ("yes".equalsIgnoreCase(bhallway3) || "y".equalsIgnoreCase(bhallway3)) {
System.out.println("");
System.out.println("The fight has begun. To punch the nurse, press 'enter' during the fight.");

while (playerhp > 0 && enemyhp > 0 && !won) {

System.out.println("Press enter to punch");
keyboard.nextLine();

playerdmg = (int) (Math.random() * 20) + 1;
enemydmg = (int) (Math.random() * 20) + 1;

playerhp -= enemydmg;
enemyhp -= playerdmg;

System.out.println("The enemy has done " + enemydmg + " damage to you.");
System.out.println("You have done " + playerdmg + " damage to the nurse.");
System.out.println("You are currently at " + playerhp + " hp");
System.out.println("The nurse is currently at " + enemyhp + " hp");

}
} else if ("no".equalsIgnoreCase(bhallway3) || "n".equalsIgnoreCase(bhallway3)) {
System.out.println("You are trapped in an unfortunate situation.");
System.out.println("There are security gaurds behind you walking.");
System.out.println("The only option is for you to fight them.");
System.out.println("");
System.out.println("The fight has begun. To punch the nurse, press 'enter' during the fight.");

while (playerhp > 0 && enemyhp > 0 && !won) {

System.out.println("Press enter to punch");
keyboard.nextLine();

playerdmg = (int) (Math.random() * 20) + 1;
enemydmg = (int) (Math.random() * 20) + 1;

playerhp -= enemydmg;
enemyhp -= playerdmg;

System.out.println("The enemy has done " + enemydmg + " damage to you.");
System.out.println("You have done " + playerdmg + " damage to the nurse.");
System.out.println("You are currently at " + playerhp + " hp");
System.out.println("The nurse is currently at " + enemyhp + " hp");

}

}
if (enemyhp <= 0 && playerhp > 0) {
System.out.println("");
System.out.println("Congratulations " + name + "." + " You have defeated another nurse. You have so many skills!");
System.out.println("You are now entering level 3!");

location = "hallway3"

} else if (enemyhp > 0 && playerhp <= 0) {
System.out.println("You have died. You will now have to restart the game.");
} else if (enemyhp < 0 && playerhp < 0) {
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
}

}
break;

case "hallway3":

System.out.println("You are now in hallway 3.");
System.out.println("Where would you like to go?");

String hallway3 = keyboard.nextLine();

while ("hallway3".equals(location)) {

if ("open notebook".equalsIgnoreCase(hallway3) || "notebook".equalsIgnoreCase(hallway3)) {
notebook();
}
if ("open inventory".equalsIgnoreCase(hallway3) || "inventory".equalsIgnoreCase(hallway3)) {
inventory();
}
if ("go forward".equalsIgnoreCase(hallway3) || "forward".equalsIgnoreCase(hallway3)) {
System.out.println("There are a lot of waiting rooms beside you, but a dead end if you keep going.");
location = "dead end2"
} else if ("go left".equalsIgnoreCase(hallway3) || "left".equalsIgnoreCase(hallway3)) {
System.out.println("You headed to waiting room 2. You see a bottle of acid attatched to the wall.");
System.out.println("Would you like to determine what acid it is?");

String hallway3g = keyboard.nextLine();

if ("yes".equalsIgnoreCase(hallway3g) || "y".equalsIgnoreCase(hallway3g)) {
System.out.println("You have identified that the element is flourine.");
System.out.println("You now have flourine in your inventory.");
System.out.println("You have found the last acid. Now you are going to mix the right two acids.");

notebook[NoteSize] = "You found flourine in the blue sink"
NoteSize++;

inventory[invSize] = "flourine"
invSize++;

location = "mix"
} else if ("no".equalsIgnoreCase(hallway3g) || "n".equalsIgnoreCase(hallway3g)) {
System.out.println("You have exited waiting room 2 and you are now in the entrance of hallway 3.");
location = "hallway 3"
}
} else if ("go right".equalsIgnoreCase(hallway3) || "right".equalsIgnoreCase(hallway3)) {
System.out.println("There is a security guard right there. He is not paying attention.");
System.out.println("You keep walking forward till a dead end.");
location = "dead end2"
} else if ("go back".equalsIgnoreCase(hallway3) || "back".equalsIgnoreCase(hallway3)) {
System.out.println("A security guard catches you as you turn back.");
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
}
}
break;

case "dead end2":

System.out.println("You are now at another dead end");
System.out.println("Where would you like to go?");

while ("dead end2".equals(location)) {

System.out.println("");
String deadend2 = keyboard.nextLine();

if ("open notebook".equalsIgnoreCase(deadend2) || "notebook".equalsIgnoreCase(deadend2)) {
notebook();
}
if ("open inventory".equalsIgnoreCase(deadend2) || "inventory".equalsIgnoreCase(deadend2)) {
inventory();
}

if ("go left".equalsIgnoreCase(deadend2) || "left".equalsIgnoreCase(deadend2)) {
System.out.println("Nothing is there.");
location = "dead end2"
} else if ("go right".equalsIgnoreCase(deadend2) || "right".equalsIgnoreCase(deadend2)) {
System.out.println("Nothing is there.");
location = "dead end2"
} else if ("go forward".equalsIgnoreCase(deadend2) || "forward".equalsIgnoreCase(deadend2)) {
System.out.println("Nothing is there.");
location = "dead end2"
} else if ("go back".equalsIgnoreCase(deadend2) || "back".equalsIgnoreCase(deadend2)) {
System.out.println("You realize that you have little time left to escape the hospital.");
System.out.println("As you try to go in the waiting room to escape, there is a security guard right outside the waiting room.");
System.out.println("He is your last enemy. If you defeat him, you will successfully escape the hospital.");
location = "outwr"
}

}

break;

case "mix":

System.out.println("You will now have to mix the right two acids.");
System.out.println("To mix two acids, state 'mix' and then the two acids.");
System.out.println("For example, 'mix purple and yellow'. But instead of purple and yellow you have to state the real acids you have found.");
System.out.println("Which ones will you mix?");

String mix = keyboard.nextLine();

while ("mix".equals(location)) {

if ("mix ethanol and hydrogen".equalsIgnoreCase(mix)) {
System.out.println("You have created a posinious gas so the smoke alarm started going off in the hospital. You have been spotted.");
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
} else if ("mix ethanol and nitric acid".equalsIgnoreCase(mix)) {
System.out.println("You have created a posinious gas so the smoke alarm started going off in the hospital. You have been spotted.");
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
} else if ("mix ethanol and flourine".equalsIgnoreCase(mix)) {
System.out.println("You have created a posinious gas so the smoke alarm started going off in the hospital. You have been spotted.");
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
} else if ("mix hydrogen and ethanol".equalsIgnoreCase(mix)) {
System.out.println("You have created a posinious gas so the smoke alarm started going off in the hospital. You have been spotted.");
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
} else if ("mix hydrogen and nitric acid".equalsIgnoreCase(mix)) {
System.out.println("You have created a posinious gas so the smoke alarm started going off in the hospital. You have been spotted.");
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
} else if ("mix hydrogen and flourine".equalsIgnoreCase(mix)) {
System.out.println("Congratulations! You have mixed the right two acids.");
} else if ("mix nitric acid and ethanol".equalsIgnoreCase(mix)) {
System.out.println("You have created a posinious gas so the smoke alarm started going off in the hospital. You have been spotted.");
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
} else if ("mix nitric acid and hydrogen".equalsIgnoreCase(mix)) {
System.out.println("You have created a posinious gas so the smoke alarm started going off in the hospital. You have been spotted.");
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
} else if ("mix nitric acid and flourine".equalsIgnoreCase(mix)) {
System.out.println("You have created a posinious gas so the smoke alarm started going off in the hospital. You have been spotted.");
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
} else if ("mix flourine and ethanol".equalsIgnoreCase(mix)) {
System.out.println("You have created a posinious gas so the smoke alarm started going off in the hospital. You have been spotted.");
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
} else if ("mix flourine and hydrogen".equalsIgnoreCase(mix)) {
System.out.println("Congratulations! You have mixed the right two acids.");
} else if ("mix flourine and nitric acid".equalsIgnoreCase(mix)) {
System.out.println("You have created a posinious gas so the smoke alarm started going off in the hospital. You have been spotted.");
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
}
}
break;

case "outwr":

System.out.println("You can do this! Defeat him to earn the victory royale!");

String outwr = keyboard.nextLine();

while ("bhallway3".equals(location)) {

if ("open notebook".equalsIgnoreCase(outwr) || "notebook".equalsIgnoreCase(outwr)) {
notebook();
}
if ("open inventory".equalsIgnoreCase(outwr) || "inventory".equalsIgnoreCase(outwr)) {
inventory();
}

if ("yes".equalsIgnoreCase(outwr) || "y".equalsIgnoreCase(outwr)) {
System.out.println("");
System.out.println("The fight has begun. To punch the nurse, press 'enter' during the fight.");

while (playerhp > 0 && enemyhp > 0 && !won) {

System.out.println("Press enter to punch");
keyboard.nextLine();

playerdmg = (int) (Math.random() * 20) + 1;
enemydmg = (int) (Math.random() * 20) + 1;

playerhp -= enemydmg;
enemyhp -= playerdmg;

System.out.println("The enemy has done " + enemydmg + " damage to you.");
System.out.println("You have done " + playerdmg + " damage to the nurse.");
System.out.println("You are currently at " + playerhp + " hp");
System.out.println("The nurse is currently at " + enemyhp + " hp");

}
} else if ("no".equalsIgnoreCase(outwr) || "n".equalsIgnoreCase(outwr)) {
System.out.println("You have come a long way.");
System.out.println("There is only a little time left.");
System.out.println("The only option is for you to fight them, and escape the hospital.");
System.out.println("");
System.out.println("The fight has begun. To inject the needle into the security guard, say 'inject' during the fight.");

while (playerhp > 0 && enemyhp > 0 && !won) {

System.out.println("Press enter to inject");
keyboard.nextLine();

playerdmg = (int) (Math.random() * 80) + 50;
enemydmg = (int) (Math.random() * 20) + 1;

playerhp -= enemydmg;
enemyhp -= playerdmg;

System.out.println("The enemy has done " + enemydmg + " damage to you.");
System.out.println("You have done " + playerdmg + " damage to the nurse.");
System.out.println("You are currently at " + playerhp + " hp");
System.out.println("The nurse is currently at " + enemyhp + " hp");

}

}
if (enemyhp <= 0 && playerhp > 0) {
System.out.println("");
System.out.println("Congratulations " + name + "." + " You have defeated the last enemy, the security guard.");
System.out.println("You have now beat the game! Congradulations on that scary fight! I like to see that victory royale!");
System.out.println(" ██╗ ██╗ ██╗\n"
+ "████████╗███║\n"
+ "╚██╔═██╔╝╚██║\n"
+ "████████╗ ██║\n"
+ "╚██╔═██╔╝ ██║\n"
+ " ╚═╝ ╚═╝ ╚═╝\n"
+ " ");

} else if (enemyhp > 0 && playerhp <= 0) {
System.out.println("You have died, although you have come a long way. You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
} else if (enemyhp < 0 && playerhp < 0) {
System.out.println("You will now have to restart the game.");
System.out.println(" ▄ ▄ \n"
+ "▐░▌ ▐░▌\n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▐░▌ \n"
+ " ▐░▌ \n"
+ " ▐░▌░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ " ▐░▌ ▐░▌ \n"
+ "▐░▌ ▐░▌\n"
+ " ▀ ▀ \n"
+ " ");
}

}

break;
}//switch location1

}//game loop
}//main

public static void inventory() {

System.out.println("-------------------------------------");
System.out.println("Here are the items in your inventory:");
for (int i = 0; i < invSize; i++) {
System.out.println("\t" + inventory[i]);
}

}

public static void notebook() {
System.out.println("-------------------------------------");
System.out.println("Here are the items in your notebook:");
for (int i = 0; i < NoteSize; i++) {
System.out.println("\t" + notebook[i]);
}
}//end of inventory
}//end of class
