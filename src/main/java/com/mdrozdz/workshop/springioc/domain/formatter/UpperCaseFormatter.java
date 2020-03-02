package com.mdrozdz.workshop.springioc.domain.formatter;

import com.mdrozdz.workshop.springioc.domain.CommitFormatter;

public class UpperCaseFormatter implements CommitFormatter {

  @Override
  public String format(String message) {
    return message.toUpperCase();
  }

}
