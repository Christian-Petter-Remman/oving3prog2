package org.main.api.capitalize;

public class CapitalizeSelectionTextCommand extends  CapitalizeTextCommand {
  private String selection;

  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  public String execute() {
    return super.capitalize(this.selection);
  }

  public String getSelection() {
    return selection;
  }
}
