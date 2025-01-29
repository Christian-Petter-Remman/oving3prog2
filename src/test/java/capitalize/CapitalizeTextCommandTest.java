package capitalize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.main.api.capitalize.CapitalizeTextCommand;


public class CapitalizeTextCommandTest {

  @Test
  @DisplayName("Test capitalize method")
  public void testCapitalize() {
    CapitalizeTextCommand capitalizeTextCommand = new CapitalizeTextCommand();
    assertEquals("Hello", capitalizeTextCommand.capitalize("hello"));
  }
}
