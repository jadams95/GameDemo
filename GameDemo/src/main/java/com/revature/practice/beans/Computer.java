package com.revature.practice;

public class Computer extends User {
  private String password;
  private String lastName;
  private String firstName;
  private String role;

  public void setPassword(String password){
    this.password = password;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }
  
  public void setRole(String role){
    this.role = role;
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

  public Strin getRole(){
    return role;
  }

}
