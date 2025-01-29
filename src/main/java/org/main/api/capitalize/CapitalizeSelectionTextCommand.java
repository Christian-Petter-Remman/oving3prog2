package org.main.api.capitalize;

public class CapitalizeSelectionTextCommand extends  CapitalizeTextCommand {
  private String selection;

  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  public String execute(String text) {
    if(text.contains(selection)) {
      return text.replace(selection, super.capitalize(selection));
    }
    return text;
  }

  public String getSelection() {
    return selection;
  }
}
