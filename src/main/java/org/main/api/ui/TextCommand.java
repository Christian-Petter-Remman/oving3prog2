package org.main.api.ui;

public class TextCommand {
  private String target;
  private String replacement;


  String execute(String text){
    return text.replace(target, replacement);
  }
}
