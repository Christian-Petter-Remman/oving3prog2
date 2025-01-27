package org.main.api.replace;

import static org.main.api.exceptions.ExceptionHandler.nullPointerException;
import static org.main.api.exceptions.ExceptionHandler.numberInvalidException;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
    nullPointerException(target, replacement);
    numberInvalidException(target, replacement);
  }

  public String execute(String text){
    return text.replaceFirst(getTarget(), getReplacement());
  }
}
