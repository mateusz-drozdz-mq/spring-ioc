package com.mdrozdz.workshop.springioc.domain.formatter;

import com.mdrozdz.workshop.springioc.domain.CommitFormatter;

public class EmptyFormatter implements CommitFormatter {

  @Override
  public String format(String message) {
    return message;
  }

}
