package lang.sampleInterface;

import java.io.IOException;

public class AppendableExample {
    public static void main(String[] args) {
        Appendable appendable = new StringBuilder();

        try {
            appendable.append('A');
            appendable.append("ppendable Example ");
            appendable.append(new StringBuilder("in Java!"));
            System.out.println(appendable.toString());
        } catch (IOException e) {
            System.err.println("エラーが発生しました: " + e.getMessage());
        }
    }
}
