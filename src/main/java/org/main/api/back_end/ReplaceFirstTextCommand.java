package org.main.api.back_end;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  public String execute(String text){
    return text.replaceFirst(getTarget(), getReplacement());
  }
}
