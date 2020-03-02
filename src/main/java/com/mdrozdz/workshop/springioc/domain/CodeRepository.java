package com.mdrozdz.workshop.springioc.domain;

import java.util.List;

public interface CodeRepository {

  void commit(String message);

  List<String> getCommits();

}