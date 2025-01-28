package wrap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.main.api.wrap.WrapLinesTextCommand;

public class WrapLinesTextCommandTest {

  @Test
  @DisplayName("Test execute method")
  public void testExecute() {
    String txt = "Hello\nWorld";
    WrapLinesTextCommand wrapLinesTextCommand = new WrapLinesTextCommand("O", "E");
    assertEquals("O Hello E\nO World E", wrapLinesTextCommand.execute(txt));
  }
}
