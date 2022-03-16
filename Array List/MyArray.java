
import java.util.Scanner;

public class MyArray {

    public static int size; // Tells the current size of the Array
    public static String[] Array; // The Array where the ingredients are stored
    public static int lastIndex; // Tells the last index and signifies the capacity

    public MyArray() { //Constructor for calling the variables above
        MyArray.size = 4; 
        MyArray.Array = new String [size];
        MyArray.lastIndex = 0;


    }

    public static void addIngredient (String input){  // Function for adding ingredients/elements on the array list
        if(lastIndex == Array.length){ // Indicator that the array is about to reach full capacity
            String[] newArray = new String[size*2];  // Calls for a temporary new array with double the size of the original array
            size = size * 2;  // Doubles the current size
            for(int i = 0; i<Array.length; i++){
                newArray[i] = Array[i]; // Transferring the elements of the original array to the new temporary array

            }
            Array = newArray; // Transferring back the elements to the original array from the new temporary array
            }

        Array[lastIndex] = input; // adding the additional input/element from the user to the original array
        lastIndex++;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        lastIndex = 0; 
        size = 4;
        Array = new String [size]; // Setting the starting size of the array to 4 
        int i;
        System.out.println("Welcome to Abdu's Borgir!");
        System.out.println("Unang kagat, tinapay lahat");
        System.out.println("Choose four ingredients you want to put in your burger:");   
        for(i = 0 ; i < Array.length; i++) {
            addIngredient(scanner.nextLine()); // User puts the 4 initial elements/ingredients of their desired burger
        }
        System.out.println("\n");
      
        while(true){
        System.out.println("Press 1 if you want to add more ingredients"); 
        System.out.println("Press 2 if you want to check an ingredient"); 
        System.out.println("Press 3 if you want to check if an ingredient is already included"); 
        System.out.println("Press 4 if you want to check your burger"); 
        System.out.println("Press 5 if you want to exit "); 

    
        
        int choice = scanner.nextInt();
        switch(choice) {
            case 1: // For adding elements/ingredient
                System.out.println("Enter the number of ingredients you want to add:");
                int addtional = scanner.nextInt(); // User input for the desired number of additional elements to add
                int currentLength = lastIndex + addtional; // The speculated capacity after the additional elements were added
                System.out.println("Enter the ingredients you want to add");
                scanner.nextLine(); 
                for (int j = lastIndex ; j < currentLength; j++){
                    String input = scanner.nextLine(); // User input fot the additional ingredient
                    addIngredient(input); // Puts the user input into the array
                }
            break;  
            case 2: // For getting the ingredient/element from its index in the Array list
                System.out.println("Enter the index of the ingredient you want to find:");
                int index = scanner.nextInt();
                    try{
                        if(Array[index] == null){
                            System.out.println("The index has no item on it, please re-enter your index."); // Indicates the user that index is currently null
                        }else{
                        System.out.println(Array[index] + " is currently on the list."); // Shows the element from the index given by the user
                        } 
                    }catch (Exception e){
                        System.out.println("The index you put is out of bounds."); // Happens when the user inputs an invalid character or integer that is out of bounds in the current array
                    }
                break;
            case 3: // For checking if the element is in the Array List
                System.out.println("Enter the ingredient you want to check:");
                 String input = scanner.next();
                 boolean search = false; // Setting that the ingredient/element is not on the array
                try{
                 for(String x : Array) { // Searches every element of the array
                     if(x.equals(input)) { // Happens when the input matches a certain element in the array
                         search = true; 
                         break;
                     }
                    }
                } catch (Exception e){ // for catching null characters
                }
                 if(search)
                    System.out.println("The ingredient you entered is already included.");
                 else
                    System.out.println("The ingredient you entered is not yet included.");
                break;
            case 4: // For printing the current array list
                System.out.println("Here are all the ingredients you chose");
                for(i = 0; i < lastIndex; i++) {
                    System.out.println(i+1 + ".) " + Array[i]); // Prints the current array list 
                }
                break;
            case 5: //exit function of the while loop
                System.out.println("Thank you for ordering! Please proceed to the counter.");
                System.out.println("I hope you are satisfied with our service.");
                return; // ends the while loop and the program
        }
        }
    }
}