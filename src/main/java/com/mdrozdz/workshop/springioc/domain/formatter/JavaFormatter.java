package com.mdrozdz.workshop.springioc.domain.formatter;

import com.mdrozdz.workshop.springioc.domain.CommitFormatter;

public class JavaFormatter implements CommitFormatter {

  @Override
  public String format(String message) {
    return "<J>" + message + "<J>";
  }

}
