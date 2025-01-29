package org.main.api.capitalize;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

  public CapitalizeWordsTextCommand() {
  }

  public String execute(String text) {
    String[] words = text.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
      sb.append(super.capitalize(word)).append(" ");
    }
    return sb.toString().trim();
  }
}
