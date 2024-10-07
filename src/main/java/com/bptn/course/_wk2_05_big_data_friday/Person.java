package com.bptn.course._wk2_05_big_data_friday;
public class Person {
	

//Create instance variables
private String firstName; 
private String lastName; 
private int birthMonth; 
private int birthDay;
private int birthYear; 
private String ssn;  

// Constructor
 public Person (String firstName,String lastName, int birthMonth, int birthDay, int birthYear, String ssn) {
	 
 
this.firstName = firstName;
this.lastName = lastName;
this.birthMonth = birthMonth;
this.birthDay = birthDay;
this.birthYear  = birthYear;
this.ssn = ssn;
}
// Create methods

//Getting first name
public String getFirstName () {
 return firstName;
}
//Getting last name
 public String getLastName () {
 return lastName;
}


//Setting first name
public void setFirstName (String firstName) {
  this.firstName = firstName;
}

//Setting last name
public void setLastName (String lastName) {
  this.lastName = lastName;
}

//Getting birthday. Note the CONCAT
public String getBirthDay () {
 return birthMonth + "/" + birthDay + "/" + birthYear;
}

//Verifying SSN Using boolean. This returns true if condition is met
public boolean verifySSN (String ssn) {
 return this.ssn.equals(ssn);
}

 //Don't modify the code below:
    public static void main(String[] args) {
            Person person1 = new Person("John", "Doe", 1, 1, 1990, "123-45-6789");
            Person person2 = new Person("Jane", "Doe", 2, 2, 1991, "987-65-4321");
            Person person3 = new Person("Jane", "Smith", 1, 1, 1990, "111-11-1111");
            Person person4 = new Person("Jane", "Smith", 2, 2, 1991, "222-22-2222");
            
            System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getLastName() + " Birthday: " + person1.getBirthDay() + " SSN: " + person1.verifySSN("123-45-6789"));
            System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getLastName() + " Birthday: " + person2.getBirthDay() + " SSN: " + person2.verifySSN("987-65-4321"));
            System.out.println("Person 3: " + person3.getFirstName() + " " + person3.getLastName() + " Birthday: " + person3.getBirthDay() + " SSN: " + person3.verifySSN("111-11-1111"));
            System.out.println("Person 4: " + person4.getFirstName() + " " + person4.getLastName() + " Birthday: " + person4.getBirthDay() + " SSN: " + person4.verifySSN("222-22-2222"));
        }
}










