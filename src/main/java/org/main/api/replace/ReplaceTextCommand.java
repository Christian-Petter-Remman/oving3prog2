package org.main.api.replace;

import static org.main.api.exceptions.ExceptionHandler.nullPointerException;
import static org.main.api.exceptions.ExceptionHandler.numberInvalidException;

public class ReplaceTextCommand {
  private final String target;
  private final String replacement;

  public ReplaceTextCommand(String target, String replacement) {
    nullPointerException(target, replacement);
    numberInvalidException(target, replacement);
    this.target = target;
    this.replacement = replacement;
  }

  public String execute(String text) {
    return text.replace(target, replacement);
  }

  public String getTarget() {
    return target;
  }

  public String getReplacement() {
    return replacement;
  }
}
