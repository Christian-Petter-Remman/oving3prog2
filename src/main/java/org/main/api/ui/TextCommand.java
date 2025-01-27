package org.main.api.ui;

import org.main.api.back_end.ReplaceTextCommand;

public class TextCommand {
  private String target;
  private String replacement;
  ReplaceTextCommand replaceTextCommand = new ReplaceTextCommand(target, replacement);

  String execute(String text){
    return replaceTextCommand.execute(text);
  }
}
