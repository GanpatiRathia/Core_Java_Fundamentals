package _03_String;

public class _01_String_Operation {
	
    public static void main(String[] args) {
    	// 3.6 Strings - Demonstrating an empty string and a greeting string
        String e = ""; // Empty string
        String greeting = "Hello";
        System.out.println("Empty String: " + e);
        System.out.println("Original String: " + greeting);
        
        // 3.6.1 Substrings - Extracting a portion of a string
        String sub = greeting.substring(0, 3);
        System.out.println("Substring (First 3 characters): " + sub);
        
        // 3.6.2 Concatenation - Merging two strings together
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        System.out.println("Concatenated String: " + message);
        
        // Concatenation with an integer value
        int age = 13;
        String rating = "PG" + age;
        System.out.println("Concatenation with Integer: " + rating);
        
        // Joining multiple strings with a separator
        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println("Joined String: " + all);
        
        // Repeating a string multiple times
        String repeated = "Java".repeat(3);
        System.out.println("Repeated String: " + repeated);
        
        // 3.6.3 Strings Are Immutable - Modifying a string indirectly
        greeting = greeting.substring(0, 3) + "p!";
        System.out.println("Modified String: " + greeting);
        
        // 3.6.4 Testing Strings for Equality - Comparing string values and references
        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println("Equals method (checks content): " + s1.equals(s2)); // true
        System.out.println("== Operator (checks reference): " + (s1 == s2)); // false
        
        // 3.6.5 Empty and Null Strings - Checking for empty and null strings
        String emptyStr = "";
        String nullStr = null;
        System.out.println("Empty String Check (length == 0): " + (emptyStr.length() == 0));
        System.out.println("Null String Check (is null): " + (nullStr == null));
        
        // 3.6.6 Code Points and Code Units - Working with Unicode characters
        String unicodeStr = "𝕆ctonions";
        System.out.println("String Length (code units count): " + unicodeStr.length());
        System.out.println("Code Point Count (actual characters): " + unicodeStr.codePointCount(0, unicodeStr.length()));
        
        // Printing individual Unicode code points
        int[] codePoints = unicodeStr.codePoints().toArray();
        System.out.print("Code Points in String: ");
        for (int cp : codePoints) {
            System.out.print(Character.toString(cp) + " ");
        }
        System.out.println();
        
        // 3.6.7 Most Used String API Examples
        // charAt() - Getting a character at a specific index
        char firstChar = greeting.charAt(0);
        System.out.println("First Character using charAt(): " + firstChar);
        
        // indexOf() - Finding position of a substring
        int index = greeting.indexOf("l");
        System.out.println("Index of 'l': " + index);
        
        // lastIndexOf() - Finding last occurrence of a character
        int lastIndex = greeting.lastIndexOf("l");
        System.out.println("Last Index of 'l': " + lastIndex);
        
        // toUpperCase() and toLowerCase() - Case conversion
        System.out.println("Uppercase: " + greeting.toUpperCase());
        System.out.println("Lowercase: " + greeting.toLowerCase());
        
        // replace() - Replacing characters in a string
        String replacedString = greeting.replace("l", "x");
        System.out.println("Replaced String: " + replacedString);
        
        // trim() - Removing leading and trailing spaces
        String spacedString = "  Java  ";
        System.out.println("Trimmed String: " + spacedString.trim());
        
        // startsWith() and endsWith() - Checking prefixes and suffixes
        System.out.println("Starts with 'He': " + greeting.startsWith("He"));
        System.out.println("Ends with 'lo': " + greeting.endsWith("lo"));
        
        // split() - Splitting a string into an array
        String csv = "apple,banana,orange";
        String[] fruits = csv.split(",");
        System.out.print("Split Strings: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

}