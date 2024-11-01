package TestDictionary;

import implementations.Dictionary;
import utilities.DictionaryADT.KeyAlreadyExistsException;
import utilities.DictionaryADT.KeyMissingException;

public class TestDictionary {

    public static void main(String[] args) {
        Dictionary<String, String> dictionary = new Dictionary<>();

        try {
         
            dictionary.addEntry("apple", "A fruit");
            dictionary.addEntry("book", "An object to read");

          
            System.out.println("Retrieve apple: " + dictionary.retrieve("apple")); 
            System.out.println("Retrieve book: " + dictionary.retrieve("book"));   

            // Replacing value
            dictionary.replaceValue("book", "A collection of pages");
            System.out.println("Updated book: " + dictionary.retrieve("book"));  

       
            dictionary.deleteEntry("apple");

           
            System.out.println("After deleting apple: " + dictionary.retrieve("apple"));

        } catch (KeyAlreadyExistsException e) {
            System.out.println("Error: Tried to add a duplicate key.");
        } catch (KeyMissingException e) {
            System.out.println("Error: Tried to access or modify a missing key.");
        }
    }
}