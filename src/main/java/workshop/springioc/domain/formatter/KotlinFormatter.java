package workshop.springioc.domain.formatter;

import workshop.springioc.domain.CommitFormatter;

public class KotlinFormatter implements CommitFormatter {

  @Override
  public String format(String message) {
    return "|K| " + message + " |K|";
  }

}
