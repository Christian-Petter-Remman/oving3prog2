package org.main.api.exceptions;

public class ExceptionHandler {

  public static void nullPointerException(String target, String replacement) {
    if (target == null || replacement == null) {
      throw new IllegalArgumentException("Target and replacement cannot be null");
    }
  }

  public static void numberInvalidException(String target, String replacement) {
    if (target.equals(".*\\d.*") || replacement.equals( ".*\\d.*")) {
      throw new IllegalArgumentException("Target and replacement cannot be a number");
    }
  }

}
