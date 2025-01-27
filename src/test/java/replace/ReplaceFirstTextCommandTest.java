package replace;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.main.api.replace.ReplaceFirstTextCommand;

public class ReplaceFirstTextCommandTest {

  @Test
  @DisplayName("Test constructor")
  public void testConstructor() {
    ReplaceFirstTextCommand replaceFirstTextCommand = new ReplaceFirstTextCommand("Hello", "Goodbye!");
    assertEquals("Hello", replaceFirstTextCommand.getTarget());
    assertEquals("Goodbye!", replaceFirstTextCommand.getReplacement());
  }

  @Test
  @DisplayName("Test execute")
  public void testExecute() {
    String text = "Hello welcome to the world of Java";
    ReplaceFirstTextCommand replaceFirstTextCommand = new ReplaceFirstTextCommand("Hello", "Goodbye!");
    assertEquals("Goodbye! welcome to the world of Java", replaceFirstTextCommand.execute(text));
  }

}
