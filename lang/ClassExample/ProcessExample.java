package lang.ClassExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessExample {
  public static void main(String[] args) {
    try {
      ProcessBuilder processBuilder = new ProcessBuilder("ping", "-c", "4", "google.com");
      Process process = processBuilder.start();

      InputStream inputStream = process.getInputStream();
      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }

      int exitCode = process.waitFor();
      System.out.println("Process exited with code: " + exitCode);

      if (process.isAlive()) {
        System.out.println("The process is still running.");
      } else {
        System.out.println("The process has terminated.");
      }

      process.destroy();
      System.out.println("Process destroyed.");

    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }
}
