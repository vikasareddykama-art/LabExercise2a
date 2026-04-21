package demo;

//2a. Java program demonstrating various String operations

import java.util.*;

public class StringOperations {
 public static void main(String[] args) {

     // 1. String Creation and Basic Operations
     String str = " Hello Java World ";
     System.out.println("Original String: '" + str + "'");

     // 2. Length and Character Access
     System.out.println("Length: " + str.length());
     System.out.println("Character at index 2: " + str.charAt(2));

     // 3. String Comparison
     String str2 = "hello java world";
     System.out.println("Equals: " + str.equals(str2));
     System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str2));

     // 4. String Searching
     System.out.println("Contains 'Java': " + str.contains("Java"));
     System.out.println("Index of 'Java': " + str.indexOf("Java"));

     // 5. Substring Operations
     System.out.println("Substring (1 to 6): " + str.substring(1, 6));

     // 6. String Modification
     System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
     System.out.println("Uppercase: " + str.toUpperCase());
     System.out.println("Lowercase: " + str.toLowerCase());

     // 7. Whitespace Handling
     String trimmed = str.trim();
     System.out.println("Trimmed String: '" + trimmed + "'");

     // 8. String Concatenation
     String concat = trimmed + " Programming";
     System.out.println("Concatenated String: " + concat);

     // 9. String Splitting
     String[] words = trimmed.split(" ");
     System.out.println("Split Words:");
     for (String w : words) {
         System.out.println(w);
     }

     // 10. StringBuilder Demo
     StringBuilder sb = new StringBuilder("AIET");
     sb.append(" College");
     System.out.println("StringBuilder Result: " + sb);

     // 11. String Formatting
     int marks = 85;
     String formatted = String.format("Marks: %d", marks);
     System.out.println("Formatted String: " + formatted);

     // 12. Email Validation
     String email = "student@gmail.com";

     if (email.contains("@") && email.startsWith("student") && email.endsWith(".com")) {
         System.out.println("Valid Email");
     } else {
         System.out.println("Invalid Email");
     }
 }
}