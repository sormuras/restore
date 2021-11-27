import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.spi.ToolProvider;

public class restore implements ToolProvider {

  public static void main(String... args) {
    System.exit(main(System.out, System.err, args));
  }

  public static int main(PrintStream out, PrintStream err, String... args) {
    return new restore().run(out, err, args);
  }

  @Override
  public String name() {
    return "restore";
  }

  @Override
  public int run(PrintWriter out, PrintWriter err, String... args) {
    out.printf("restore %s%n", List.of(args));
    return 0;
  }
}
