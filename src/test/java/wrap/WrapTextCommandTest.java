package wrap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.main.api.wrap.WrapLinesTextCommand;
import org.main.api.wrap.WrapTextCommand;

public class WrapTextCommandTest {

  @Test
  @DisplayName("Test constructor")
  public void testConstructor() {
    WrapTextCommand wrapTextCommand = new WrapTextCommand("opening", "ending");
    assertEquals("opening", wrapTextCommand.getOpening());
    assertEquals("ending", wrapTextCommand.getEnding());
  }

  @Test
  @DisplayName("Test execute method")
  public void testExecute() {
    String txt = "Hello\nWorld";
    WrapTextCommand wrapTextCommand = new WrapTextCommand("O", "E");
    assertEquals("OHello\nWorldE", wrapTextCommand.execute(txt));
  }



}
