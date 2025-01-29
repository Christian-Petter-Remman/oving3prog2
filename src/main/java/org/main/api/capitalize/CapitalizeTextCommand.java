package org.main.api.capitalize;

import org.main.api.ui.TextCommand;

public class CapitalizeTextCommand extends TextCommand {

  public CapitalizeTextCommand() {
  }

  public String execute(String text) {
    return text.substring(0, 1).toUpperCase() + text.substring(1);
  }
}
