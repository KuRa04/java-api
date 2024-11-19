package lang.ClassExample;

public class CharacterExample {

  public static void main(String[] args) {
      Character char1 = Character.valueOf('A');
      Character char2 = Character.valueOf('a');

      System.out.println("char1: " + char1);
      System.out.println("char2: " + char2);

      System.out.println("char1.equals(char2): " + char1.equals(char2));
      System.out.println("Character.compare(char1, char2): " + Character.compare(char1, char2));
      System.out.println("char1.compareTo(char2): " + char1.compareTo(char2));

      System.out.println("Character.isDigit('1'): " + Character.isDigit('1'));
      System.out.println("Character.isLetter('A'): " + Character.isLetter('A'));
      System.out.println("Character.isLetterOrDigit('1'): " + Character.isLetterOrDigit('1'));
      System.out.println("Character.isLowerCase('a'): " + Character.isLowerCase('a'));
      System.out.println("Character.isUpperCase('A'): " + Character.isUpperCase('A'));
      System.out.println("Character.isWhitespace(' '): " + Character.isWhitespace(' '));
      System.out.println("Character.isSpaceChar(' '): " + Character.isSpaceChar(' '));
      System.out.println("Character.isISOControl('\u001F'): " + Character.isISOControl('\u001F'));
      System.out.println("Character.isJavaIdentifierStart('A'): " + Character.isJavaIdentifierStart('A'));
      System.out.println("Character.isJavaIdentifierPart('1'): " + Character.isJavaIdentifierPart('1'));
      System.out.println("Character.isUnicodeIdentifierStart('A'): " + Character.isUnicodeIdentifierStart('A'));
      System.out.println("Character.isUnicodeIdentifierPart('1'): " + Character.isUnicodeIdentifierPart('1'));
      System.out.println("Character.isIdentifierIgnorable('\u0000'): " + Character.isIdentifierIgnorable('\u0000'));

      System.out.println("Character.toLowerCase('A'): " + Character.toLowerCase('A'));
      System.out.println("Character.toUpperCase('a'): " + Character.toUpperCase('a'));
      System.out.println("Character.toTitleCase('a'): " + Character.toTitleCase('a'));

      System.out.println("Character.getNumericValue('1'): " + Character.getNumericValue('1'));
      System.out.println("Character.digit('1', 10): " + Character.digit('1', 10));

      System.out.println("Character.BYTES: " + Character.BYTES);
      System.out.println("Character.SIZE: " + Character.SIZE);

      System.out.println("Character.TYPE: " + Character.TYPE);

      System.out.println("char1.hashCode(): " + char1.hashCode());
      System.out.println("char2.hashCode(): " + char2.hashCode());

      System.out.println("Character.toString('A'): " + Character.toString('A'));

      System.out.println("Character.codePointAt(\"Hello\", 1): " + Character.codePointAt("Hello", 1));
      System.out.println("Character.codePointBefore(\"Hello\", 1): " + Character.codePointBefore("Hello", 1));
      System.out.println("Character.codePointCount(\"Hello\", 0, 5): " + Character.codePointCount("Hello", 0, 5));
      System.out.println("Character.offsetByCodePoints(\"Hello\", 0, 2): " + Character.offsetByCodePoints("Hello", 0, 2));

      System.out.println("Character.isSurrogate('A'): " + Character.isSurrogate('A'));
      System.out.println("Character.isHighSurrogate('\uD800'): " + Character.isHighSurrogate('\uD800'));
      System.out.println("Character.isLowSurrogate('\uDC00'): " + Character.isLowSurrogate('\uDC00'));
      System.out.println("Character.isSurrogatePair('\uD800', '\uDC00'): " + Character.isSurrogatePair('\uD800', '\uDC00'));

      System.out.println("Character.toChars(0x1F600): " + new String(Character.toChars(0x1F600)));
      System.out.println("Character.toCodePoint('\uD800', '\uDC00'): " + Character.toCodePoint('\uD800', '\uDC00'));

      System.out.println("Character.UnicodeBlock.of('A'): " + Character.UnicodeBlock.of('A'));
      System.out.println("Character.UnicodeScript.of('A'): " + Character.UnicodeScript.of('A'));
  }
}
