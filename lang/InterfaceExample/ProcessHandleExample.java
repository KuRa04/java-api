package lang.InterfaceExample;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class ProcessHandleExample {

  public static void main(String[] args) {
    ProcessHandle currentProcess = ProcessHandle.current();

    // プロセスIDを取得
    long pid = currentProcess.pid();
    System.out.println("PID: " + pid);

    // 親プロセスのハンドルを取得
    Optional<ProcessHandle> parentProcess = currentProcess.parent();
    parentProcess.ifPresent(handle -> System.out.println("Parent PID: " + handle.pid()));

    // プロセスの開始時間を取得
    Optional<Instant> startTime = currentProcess.info().startInstant();
    startTime.ifPresent(time -> System.out.println("Start Time: " + time));

    // CPU時間を取得
    Optional<Duration> cpuDuration = currentProcess.info().totalCpuDuration();
    cpuDuration.ifPresent(duration -> System.out.println("CPU Time: " + duration));

    // コマンドラインを取得
    Optional<String> commandLine = currentProcess.info().commandLine();
    commandLine.ifPresent(cmd -> System.out.println("Command Line: " + cmd));
  }
}
