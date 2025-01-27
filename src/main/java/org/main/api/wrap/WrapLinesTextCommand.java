package org.main.api.wrap;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WrapLinesTextCommand extends WrapTextCommand {

  public WrapLinesTextCommand(String opening, String ending) {
    super(opening, ending);
  }

  public String execute(String text) {
    return Arrays.stream(text.split("\n"))
        .map(line -> getOpening() + " " + line + " " + getEnding())
        .collect(Collectors.joining("\n"));
  }

  public String getSelection() {
    return null;
  }
}
