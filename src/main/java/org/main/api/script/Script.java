package org.main.api.script;

import java.util.List;
import java.util.ArrayList;
import org.main.api.ui.TextCommand;

public class Script {
  private List<TextCommand> textCommands;

  public Script(List<TextCommand> textCommands) {
    this.textCommands = new ArrayList<>(textCommands);
  }

  public String execute(String initialText) {
    String currentText = initialText;
    for (TextCommand command : textCommands) {
      currentText = command.execute(currentText);
    }
    return currentText;
  }

  public List<TextCommand> getTextCommands() {
    return new ArrayList<>(textCommands);
  }
}
