package workshop.springioc.domain.formatter;

import workshop.springioc.domain.CommitFormatter;

public class EmptyFormatter implements CommitFormatter {

  @Override
  public String format(String message) {
    return message;
  }

}
