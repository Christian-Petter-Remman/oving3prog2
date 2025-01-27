package replace;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.main.api.replace.ReplaceTextCommand;

public class ReplaceTextCommandTest {

  @Test
  @DisplayName("Test constructor")
  public void testConstructor(){
    ReplaceTextCommand replaceTextCommand = new ReplaceTextCommand("a", "b");
    assertEquals("b", replaceTextCommand.execute("a"));
  }

  @Test
  @DisplayName("Test execute")
  public void testExecute(){
    String txt = "I love you!";
    ReplaceTextCommand replaceTextCommand = new ReplaceTextCommand("love", "b");
    assertEquals("I b you!", replaceTextCommand.execute(txt));
  }

  @Test
  @DisplayName("Test getTarget")
  public void testGetTarget(){
    ReplaceTextCommand replaceTextCommand = new ReplaceTextCommand("a", "b");
    assertEquals("a", replaceTextCommand.getTarget());
  }

  @Test
  @DisplayName("Test getReplacement")
  public void testGetReplacement(){
    ReplaceTextCommand replaceTextCommand = new ReplaceTextCommand("a", "b");
    assertEquals("b", replaceTextCommand.getReplacement());
  }

}
