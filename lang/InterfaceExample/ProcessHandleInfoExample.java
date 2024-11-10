package lang.InterfaceExample;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class ProcessHandleInfoExample {

  public static void main(String[] args) {
    // 現在のプロセスのハンドルを取得
    ProcessHandle currentProcess = ProcessHandle.current();
    ProcessHandle.Info processInfo = currentProcess.info();

    // プロセスIDを取得
    long pid = currentProcess.pid();
    System.out.println("PID: " + pid);

    // コマンドを取得
    Optional<String> command = processInfo.command();
    command.ifPresent(cmd -> System.out.println("Command: " + cmd));

    // 引数を取得
    Optional<String[]> arguments = processInfo.arguments();
    arguments.ifPresent(argsArray -> System.out.println("Arguments: " + String.join(" ", argsArray)));

    // 開始時間を取得
    Optional<Instant> startTime = processInfo.startInstant();
    startTime.ifPresent(time -> System.out.println("Start Time: " + time));

    // ユーザーを取得
    Optional<String> user = processInfo.user();
    user.ifPresent(usr -> System.out.println("User: " + usr));

    // CPU時間を取得
    Optional<Duration> cpuDuration = processInfo.totalCpuDuration();
    cpuDuration.ifPresent(duration -> System.out.println("CPU Time: " + duration));
  }
}
