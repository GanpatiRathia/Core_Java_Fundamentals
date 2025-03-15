// _03_MultipleCatchBlocks.java
package _09_ExceptionHandling;

public class _03_MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }
    }
}