package org.main.api.wrap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class WrapLinesTextCommand extends WrapTextCommand {

  public WrapLinesTextCommand(String opening, String ending) {
    super(opening, ending);
  }

  public String execute(String text) {
    return text.lines()
        .map(line -> getOpening() + " " + line + " " + getEnding())
        .collect(Collectors.joining("\n"));
  }
}
