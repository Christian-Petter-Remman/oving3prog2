package org.main.api.wrap;

import static org.main.api.exceptions.ExceptionHandler.nullPointerException;

public class WrapTextCommand {
  private final String opening;
  private final String ending;

  public WrapTextCommand(String opening, String ending) {
    nullPointerException(opening, ending);
    this.opening = opening;
    this.ending = ending;
  }

  public String execute(String text) {
    return opening + text + ending;
  }

  public String getOpening() {
    return opening;
  }

  public String getEnding() {
    return ending;
  }
}
