package workshop.springioc.domain;

import workshop.springioc.domain.formatter.JavaFormatter;
import workshop.springioc.domain.repository.BackendRepository;

import java.util.List;

public class SoftwareDeveloper {

  private CodeRepository repository;
  private CommitFormatter formatter;

  public void workOn(String task) {
    repository.commit(formatter.format(task));
  }

  public List<String> getCommits() {
    return List.copyOf(repository.getCommits());
  }

  public void setRepository(CodeRepository repository) {
    this.repository = repository;
  }

  public void setFormatter(CommitFormatter formatter) {
    this.formatter = formatter;
  }
}
