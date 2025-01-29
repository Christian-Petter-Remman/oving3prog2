package capitalize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.main.api.capitalize.CapitalizeSelectionTextCommand;

public class CapitalizeSelectionTextCommandTest {

  @Test
  @DisplayName("Test execute method")

  public void testExecute() {
    CapitalizeSelectionTextCommand capitalizeSelectionTextCommand = new CapitalizeSelectionTextCommand("test");
    String text = "this is a Junit test for this method in java";
    assertEquals("this is a Junit Test for this method in java", capitalizeSelectionTextCommand.execute(text));
  }

  @Test
  @DisplayName("Test execute method with no selection")
  public void testExecuteNoSelection() {
    CapitalizeSelectionTextCommand capitalizeSelectionTextCommand = new CapitalizeSelectionTextCommand("all");
    String text = "this is a Junit test for this method in java";
    assertEquals("this is a Junit test for this method in java", capitalizeSelectionTextCommand.execute(text));
  }

  @Test
  @DisplayName("Test getSelection method")
  public void testGetSelection() {
    CapitalizeSelectionTextCommand capitalizeSelectionTextCommand = new CapitalizeSelectionTextCommand("test");
    assertEquals("test", capitalizeSelectionTextCommand.getSelection());
  }

}
