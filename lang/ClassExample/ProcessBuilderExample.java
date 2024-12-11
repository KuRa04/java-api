package lang.ClassExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessBuilderExample {
  public static void main(String[] args) {
    try {
      ProcessBuilder processBuilder = new ProcessBuilder("ping", "-c", "4", "google.com");

      processBuilder.redirectErrorStream(true);

      Process process = processBuilder.start();

      BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }

      int exitCode = process.waitFor();
      System.out.println("Process exited with code: " + exitCode);

    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }
}
