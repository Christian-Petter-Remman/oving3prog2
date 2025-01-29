package org.main.api.capitalize;

public class CapitalizeTextCommand {

  public CapitalizeTextCommand() {
  }

  public String capitalize(String text) {
    return text.substring(0, 1).toUpperCase() + text.substring(1);
  }
}
