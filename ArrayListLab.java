/* This program explores the function of Array Lists. In this program, a user will be able to manipulate elements in an Array List based on 
the menu option they choose. A while loop will allows the user to make as many changes as they want until they choose option 6 to exit the loop. 
*/

import java.util.ArrayList; 
import java.util.Scanner; 

public class ArrayListLab {

   public static void main(String[] args) {
   
      //PART ONE
      
      //Create an array list of strings 
      ArrayList<String>stringArrayList = new ArrayList<String>(); 
      
      //Create a scanner to get user input to add elements to the array 
      Scanner scan = new Scanner(System.in); 
      
      //Ask user to enter a list of strings 
      System.out.println("Enter a list of strings followed by EXIT."); 
      
      //Create a string variable to represent the user's input 
      String userInput = scan.next();       
      
      //While the user's input is not exit, add the user's input into the array list  
      //Reassign the userInput value to prevent an infinite loop 
      while(!userInput.equals("EXIT")) {
         stringArrayList.add(userInput); 
         userInput = scan.next(); 
      }
      
      //Ask the user for an index to be removed from the array list 
      System.out.println("What index would you like to remove?"); 
      
      int index = scan.nextInt(); 
           
      stringArrayList.remove(index); 
      
      //Print the array list using a loop 
      for(int i = 0; i < stringArrayList.size(); i++) {
         System.out.println(stringArrayList.get(i)); 
      }
      
      //PART TWO
 
      //create a variable to represent the user's choice 
      int userChoice; 
      
      do {  
         //always want to show the menu 
         System.out.println("Menu:"); 
         System.out.println("1: Add to list"); 
         System.out.println("2: Remove from list"); 
         System.out.println("3: Clear list");
         System.out.println("4: Remove all of a particular name"); 
         System.out.println("5: Print list out"); 
         System.out.println("6: Exit"); 
         
         //make sure the user enters an integer 
         while(!scan.hasNextInt()) {
            String trash = scan.nextLine(); 
            System.out.println("Please enter a whole number"); 
         }
         
         userChoice = scan.nextInt(); 
         
         //make sure the number is between 1 and 5
         while(userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4 || userChoice == 5) {
         
            //use a switch statement to perform the operations based on the menu 
            switch(userChoice) {
               //if the user chooses 1, add a string to the list
               case 1: 
                  //ask the user for a string 
                  System.out.println("What string would you like to add?"); 
                     
                  //store the user's input in a variable
                  String newElement = scan.next();
                     
                  //add the user's element into the array list  
                  stringArrayList.add(newElement); 
                  
                  break; 
                  
               //if the user chooses 2, remove a string from the list
               case 2:
                  //ask the user for an index to remove 
                  System.out.println("What string would you like to remove (by index)?"); 
                     
                  //initialize variables to represent the user's index and the last index in the string array list                  
                  int targetIndex = - 1; 
                  int indexOB = stringArrayList.size()-1; 
                  
                  do {
                     //if the number is an integer, assign the user index to target index 
                     if(scan.hasNextInt()) {
                        targetIndex = scan.nextInt(); 
                        
                        //once the number is an integer, make sure that number is a valid index 
                        //the number should be greater than 0 and less than the arrayList size - 1
                        //so if the target index is out of bounds or less than 0, prompt the user 
                        if(targetIndex > indexOB || targetIndex < 0) {
                           System.out.println("Please enter a valid index"); 
                        }
                     }
                     //if the number is not an integer, tell the user to enter an integer 
                     else {
                        scan.next(); 
                        System.out.println("Please enter a valid index number"); 
                        
                     }
                  }   
                  //as long as the target index is out of bounds, continue to check the user's input 
                  while(targetIndex > indexOB || targetIndex < 0); 
                  
                  stringArrayList.remove(targetIndex);  
                  
                  break; 
                
               //if the user chooses 3, clear the list of all strings 
               case 3: 
                  stringArrayList.clear(); 
                     
                  break; 
                  
               //if the user chooses 4, remove all strings of a particular value
               case 4: 
                  //ask the user for a string 
                  System.out.println("What string do you want removed?"); 
                     
                  //store the user's input
                  String target = scan.next(); 
                     
                  //loop through the array list 
                  for(int i = 0; i < stringArrayList.size(); i++) {                  
                     //if the element at i has the target element, remove it 
                     if(stringArrayList.get(i).equalsIgnoreCase(target)) {
                        stringArrayList.remove(i); 
                     }
                  }
                  
                  break; 
                  
               //if the user chooses 5, print out the array list 
               case 5:
                  System.out.println("The list:"); 
                     
                  //use a loop 
                  for(int i = 0; i < stringArrayList.size(); i++) {
                     System.out.println(i + ": " + stringArrayList.get(i)); 
                  }
                   
                  break; 
               
            } //end of switch statement 
            
            //This prompts the user to enter a new number 
            System.out.println("Menu:"); 
            System.out.println("1: Add to list"); 
            System.out.println("2: Remove from list"); 
            System.out.println("3: Clear list");
            System.out.println("4: Remove all of a particular name"); 
            System.out.println("5: Print list out"); 
            System.out.println("6: Exit"); 
            
            //make sure the user enters an integer 
            while(!scan.hasNextInt()) {
               String trash = scan.nextLine(); 
               System.out.println("Please enter a whole number"); 
            }
            
            //makes it so the loop doesn't go forever 
            userChoice = scan.nextInt(); 
           
         } //end of the while loop 
         
         //if the userChoice is an integer but is not 6 (the user might not want to exit the menu)
         //**implied** the userChoice is not 1, 2, 3, 4, 5 -- the userChoice is not a valid menu option -- the while loop above takes care of this
         if(userChoice != 6) {
            //if the number is not between 1 and 6, prompt the user to enter a valid number 
            System.out.println("Please enter a number between 1 and 6");
         }
  
      }
      //while the user's answer isn't 6, check the user's input, check if it's between 1 and 5
      while(userChoice != 6); 
  
   }

}

      
       
   

               