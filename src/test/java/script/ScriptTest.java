package script;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.main.api.capitalize.CapitalizeTextCommand;
import org.main.api.replace.ReplaceFirstTextCommand;
import org.main.api.replace.ReplaceTextCommand;
import org.main.api.script.Script;
import org.main.api.ui.TextCommand;
import org.main.api.wrap.WrapLinesTextCommand;

public class ScriptTest {

  @Test
  @DisplayName("Test execute method")
  public void testExecute() {
    List<TextCommand> commands = new ArrayList<>();
    commands.add(new ReplaceTextCommand("old", "new"));
    commands.add(new CapitalizeTextCommand());
    Script script = new Script(commands);
    String text = "old text";
    assertEquals("New text", script.execute(text));
  }

  @Test
  @DisplayName("Test getTextCommands method")
  public void testGetTextCommands() {
    List<TextCommand> commands = new ArrayList<>();
    commands.add(new ReplaceFirstTextCommand("old", "new"));
    Script script = new Script(commands);
    assertEquals(commands.getFirst(), script.getTextCommands().getFirst());
  }

}
