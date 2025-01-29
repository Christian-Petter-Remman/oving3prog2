package capitalize;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.main.api.capitalize.CapitalizeWordsTextCommand;

public class CapitalizeWordsTextCommandTest {

  @Test
  @DisplayName("Test execute method")
  public void testExecute() {
    CapitalizeWordsTextCommand capitalizeWordsTextCommand = new CapitalizeWordsTextCommand();
    String text = "hello world";
    String result = capitalizeWordsTextCommand.execute(text);
    assert result.equals("Hello World");
  }
}
