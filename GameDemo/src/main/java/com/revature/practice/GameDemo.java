package com.revature.practice;

import java.util.Scanner;


public class GameDemo {  
  public static void main(String[] args){
    
    // Identifiers for the decision making and control flow for the program
    private int decision;
    private User userName;
    private int numberOfPlayers;


    // for loop to create number of users depending on
    // how many the user sets
    for(int x = 0; x <= numberOfPlayers; x++){
      Game userNames = new User();
    }

    // Also identifier for the user
    System.out.println("Set your first name, last name, role, and password ? ");
    System.out.println("select your username, play the game, or exit ?");
    
    // Switch statement with cases to set the game logic for rather to select character, play game, or exit
    // inputs: decision
    // outputs: set the username if 1, 
    // set the game to play if 2,
    // set the game to close if 3,
    // default print enter a number
    //
    Switch(decision){
      case 1:
        return 1;
        break;
      
      case 2:
        return 2;
        break;

      case 3:
        return 3;
        break;

      default:
        System.out.println("Please select a number? If you did not select a number then try again, and enter number");
    }
   

    // While loop that sets the user to play the game
    while(decision != 3){
      if(decision == 2){}
      if(decision == 1){

        userName.setFirstName(sc.nextLine());
        userName.setLastName(sc.nextLine());
        userName.setRole(sc.nextLine());
        userName.setPassword(sc.nextLine());
      }
    
    
    }
    // Identifier in the program that symbolizies the input thread     
    Scanner sc = new Scanner(System.in);

  }
}
