package lang.ClassExample;

public class StringExample {
  public static void main(String[] args) {
    String str = " Hello, World! ";

    System.out.println("Length: " + str.length());
    System.out.println("Char at index 6: " + str.charAt(6));
    System.out.println("Substring (7, 12): " + str.substring(7, 12));
    System.out.println("Index of 'World': " + str.indexOf("World"));
    System.out.println("Last index of 'o': " + str.lastIndexOf("o"));
    System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
    System.out.println("Ends with '!': " + str.endsWith("!"));
    System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));
    System.out.println("Equals 'hello, world!' ignoring case: " + str.equalsIgnoreCase("hello, world!"));
    System.out.println("Lowercase: " + str.toLowerCase());
    System.out.println("Uppercase: " + str.toUpperCase());
    System.out.println("Trimmed: '" + str.trim() + "'");
    System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

    String[] words = str.split(",");
    System.out.println("Split by ',': " + String.join(" | ", words));
    System.out.println("Contains 'World': " + str.contains("World"));
    System.out.println("Formatted string: " + String.format("The string is: %s", str.trim()));
    System.out.println("Value of 123: " + String.valueOf(123));
    System.out.println("Concatenated: " + str.concat(" Have a nice day!"));
    System.out.println("Region matches 'Hello' (0, 5): " + str.regionMatches(0, "Hello", 0, 5));
    System.out.println("Matches regex '\\w+': " + str.matches("\\w+"));
    System.out.println("HashCode: " + str.hashCode());
    System.out.println("Compare 'Hello' with 'World': " + "Hello".compareTo("World"));
    System.out.println("Compare 'hello' with 'HELLO' ignoring case: " + "hello".compareToIgnoreCase("HELLO"));
  }
}
