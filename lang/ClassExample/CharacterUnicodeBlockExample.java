package lang.ClassExample;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class CharacterUnicodeBlockExample {

    public static void main(String[] args) {
        Character.UnicodeBlock block1 = Character.UnicodeBlock.of('A');
        Character.UnicodeBlock block2 = Character.UnicodeBlock.of('あ');
        Character.UnicodeBlock block3 = Character.UnicodeBlock.of(0x1F600);

        System.out.println("block1: " + block1);
        System.out.println("block2: " + block2);
        System.out.println("block3: " + block3);

        System.out.println("block1.equals(block2): " + block1.equals(block2));
        System.out.println("block1.equals(block1): " + block1.equals(block1));

        System.out.println("block1.hashCode(): " + block1.hashCode());
        System.out.println("block2.hashCode(): " + block2.hashCode());

        Character.UnicodeBlock block4 = Character.UnicodeBlock.forName("BASIC_LATIN");
        System.out.println("block4: " + block4);

        Field[] fields = Character.UnicodeBlock.class.getFields();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    System.out.println("Field: " + field.getName() + " = " + field.get(null));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}