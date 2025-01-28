package wrap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.main.api.wrap.WrapSelectionTextCommand;

public class WrapSelectionTextCommandTest {

  @Test
  @DisplayName("Test constructor")
  public void testConstructor() {
    WrapSelectionTextCommand wrapSelectionTextCommand = new WrapSelectionTextCommand("opening", "ending", "selection");
    assertEquals("opening", wrapSelectionTextCommand.getOpening());
    assertEquals("ending", wrapSelectionTextCommand.getEnding());
    assertEquals("selection", wrapSelectionTextCommand.getSelection());
  }

  @Test
  @DisplayName("Test execute method")
  public void testExecute() {
    String txt = "Hello\nWorld";
    WrapSelectionTextCommand wrapSelectionTextCommand = new WrapSelectionTextCommand("O", "E", "Hello");
    assertEquals("OHelloE\nWorld", wrapSelectionTextCommand.execute(txt));
  }

  @Test
  @DisplayName("Test negative execute method")
  public void testNegativeExecute() {
    String txt = "Hello\nWorld";
    WrapSelectionTextCommand wrapSelectionTextCommand = new WrapSelectionTextCommand("O", "E", "i");
    assertEquals("Hello\nWorld", wrapSelectionTextCommand.execute(txt));
  }
}
