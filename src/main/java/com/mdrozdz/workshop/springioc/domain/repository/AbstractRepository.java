package com.mdrozdz.workshop.springioc.domain.repository;

import com.mdrozdz.workshop.springioc.domain.CodeRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository implements CodeRepository {

  private static final String SEPARATOR = ": ";

  protected final List<String> commits = new ArrayList<>();

  @Override
  public void commit(String message) {
    commits.add(getMessagePrefix() + SEPARATOR + message);
  }

  @Override
  public List<String> getCommits() {
    return List.copyOf(commits);
  }

  protected abstract String getMessagePrefix();

}
