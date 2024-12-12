package lang.ClassExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProcessBuilderRedirectExample {
  public static void main(String[] args) {
    try {
      ProcessBuilder processBuilder = new ProcessBuilder("ping", "-c", "4", "google.com");
      ProcessBuilder.Redirect redirect = processBuilder.redirectOutput();
      
      System.out.println("Redirect type: " + redirect.type());
      System.out.println("Redirect file: " + redirect.file());
      
      processBuilder.redirectErrorStream(true);

      Process process = processBuilder.start();

      BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }

      int exitCode = process.waitFor();
      System.out.println("Process exited with code: " + exitCode);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}