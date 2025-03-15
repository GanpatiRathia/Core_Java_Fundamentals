package _03_String;

public class _02_String_Builder {
    public static void main(String[] args) {
        // Difference between String and StringBuilder:
        // 1. String is immutable, meaning once created, it cannot be changed.
        // 2. StringBuilder is mutable, allowing modifications without creating new objects.
        // 3. StringBuilder is more efficient for frequent modifications, reducing memory overhead.

        // Creating a StringBuilder instance
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sb);
        
        // 1. Append - Adding text at the end
        sb.append(" World");
        System.out.println("After Append: " + sb);
        
        // 2. Insert - Adding text at a specific index
        sb.insert(5, " Java");
        System.out.println("After Insert: " + sb);
        
        // 3. Replace - Replacing characters between indexes
        sb.replace(6, 10, "C++");
        System.out.println("After Replace: " + sb);
        
        // 4. Delete - Removing characters between indexes
        sb.delete(6, 9);
        System.out.println("After Delete: " + sb);
        
        // 5. Reverse - Reversing the entire string
        sb.reverse();
        System.out.println("After Reverse: " + sb);
        
        // 6. Capacity - Checking the capacity of the StringBuilder
        System.out.println("Capacity: " + sb.capacity());
        
        // 7. Ensure Capacity - Ensuring a minimum capacity
        sb.ensureCapacity(50);
        System.out.println("New Capacity after ensuring: " + sb.capacity());
        
        // 8. Convert to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);

        // Comparison of String and StringBuilder
        String str = "Hello";
        str += " World"; // Creates a new object due to immutability
        System.out.println("Modified String: " + str);
        
        // StringBuilder modifies the same object, making it more efficient
        StringBuilder sbCompare = new StringBuilder("Hello");
        sbCompare.append(" World");
        System.out.println("Modified StringBuilder: " + sbCompare);
    }
}
