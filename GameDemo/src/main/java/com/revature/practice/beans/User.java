package com.revature.practice.beans;

public class User {

  // Setting the variables
  private String password;
  private String lastName;
  private String firstName;
  // Doesnt work right now because of Class Champion
  private Champion character;

  // Encapsulating the User Class
  public void setPassword(String password){
    this.password = password;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }
  
  public void setChampion(Champion character){
    this.character = character;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public String getPassword(){
    return password;
  }
  
  public String getLastName(){
    return lastName;
  }
  
  public String getFirstName(){
    return firstName;
  }

  public Champion getChampion(){
    return character;
  }

}
