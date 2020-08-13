package com.revature.practice.beans;

import com.revature.practice.beans.character_role.CharacterRole;

public class Champion {
 
  // Class Variables such as ----
  // characterName
  // how do i want to set up file location for the text files of character objects
  //
  
  private Integer health;
  private Integer basicDmg;
  private Integer healingPower;
  private Integer rangedDmg;
  private Integer spellDmg;

  // Needs to work Enums and figuring out what methods and how to select role based off enums
  private CharacterRole charRole;
 

/* 
  * Broken switch statement looping through enum of strings and for each case that user input puts results in charRole
  *
  *
  public void setCharRole(CharacterRole charRole){

    // I dont know why im doing a tenery statement
    Integer decision = (instanceof(Integer)) ? "Warrior" ? " Healer"? ? : b;
    if(decision == 0): 
      characterRole = "Warrior";
      break;
    
    if()
    case 1:
      characterRole = "Healer";
      break;
    case 2:
      characterRole = "Archer";
      break;
    case 3:
      characterRole = "Mage";
      break;
    
  }
*/
 
  // Was thinking a builder pattern to build the Champion up by using the setChampionDetails  
  public void setChampionDetails(Integer health, Integer basicDmg,
      Integer healingPower, Integer rangedDmg, Integer spellDmg, Character charRole){
        this.health = health;
        this.basicDmg = basicDmg;
        this.healingPower = healingPower;
        this.rangedDmg = rangedDmg;
        this.spellDmg = spellDmg;
        // Make the static method on enum class
        this.charRole = charRole.setCharRole();
  }


  // getter for the builder for Champion
  public String getChampionDetails(){
      return health.toString() + " : " + basicDmg.toString() + " : " + healingPower.toString() + " : " + rangedDmg.toString() + " : " + spellDmg.toString() + " : " + charRole + " \n";
  }
  
  /*
   * Will have fight methods such as
   * 
   * attacking()
   * getCurrentHealth()
   * receiveAttack()
   *
   */
}
