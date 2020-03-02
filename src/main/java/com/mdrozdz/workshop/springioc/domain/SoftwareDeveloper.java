package com.mdrozdz.workshop.springioc.domain;

import com.mdrozdz.workshop.springioc.domain.formatter.JavaFormatter;
import com.mdrozdz.workshop.springioc.domain.repository.BackendRepository;

import java.util.List;

public class SoftwareDeveloper {

  private final BackendRepository repository;
  private final JavaFormatter formatter;

  public SoftwareDeveloper() {
    repository = new BackendRepository();
    formatter = new JavaFormatter();
  }

  public void workOn(String task) {
    repository.commit(formatter.format(task));
  }

  public List<String> getCommits() {
    return List.copyOf(repository.getCommits());
  }

}
