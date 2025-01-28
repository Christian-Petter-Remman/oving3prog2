package org.main.api.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private final String selection;

  public WrapSelectionTextCommand(String opening, String ending, String selection) {
    super(opening, ending);
    this.selection = selection;
  }

  public String getSelection() {
    return selection;
  }

  public String execute(String text) {
    if(text.contains(selection)) {
      return text.replace(selection, getOpening() + selection + getEnding());
    }
    return text;
  }
}
