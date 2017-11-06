/**
 * 
 */
package Assignment_9;																					// Package declared
import java.util.HashMap;																				// Import HashMap class for util package
import java.util.Iterator;																				// Import Iterator class for util package
/**
 * Create an application having a Generic HashMap with Empcode as key and EmpName as value.
 *
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */
public class Assignment_9_1 {																			// Class Declared
	public static void main(String[] args) {															// Main method started
		System.out.println("\nPlease find below the List of New Joinees in the Company :");				// Print Statement
		HashMap<Integer,String> myHashMapVariable = new HashMap<Integer,String>();                      // we are going to store a set of String objects (Values) and each such object is identified by an Integer object (Key). 
		myHashMapVariable.put(561,"Sahil");																// put() method is used to store a employ data we can specify Integer and String.
		myHashMapVariable.put(566,"Virat");  															// put() method is used to store a employ data we can specify Integer and String.
		myHashMapVariable.put(560,"Rahul");																// put() method is used to store a employ data we can specify Integer and String.
		myHashMapVariable.put(562,"Sunil");																// put() method is used to store a employ data we can specify Integer and String.
		myHashMapVariable.put(567,"Neha");																// put() method is used to store a employ data we can specify Integer and String.	
        Iterator<Integer> myKeySet=myHashMapVariable.keySet().iterator(); 
        
        /*keySet and the myHashMapVariable object will serve as “views” into the Map.
        The elements in the set and collection are merely references to the entries in the map
        The Iterator() that is created has a view of the empty HashMap, because we have yet to add anything to it. 
        When we call hasNext(), even if the HashMap itself contains elements, the Iterator's view doesn't see it.*/
        
        while(myKeySet.hasNext()) {																		// hasNext() check if the scanner has a token after printing the line
            System.out.println(myHashMapVariable.get(myKeySet.next())); } 								// Print statement
        }																								// Main method closed
	}																									// class Assignment_9_1 closed

