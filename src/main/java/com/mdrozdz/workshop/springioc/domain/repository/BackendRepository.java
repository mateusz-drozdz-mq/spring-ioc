package com.mdrozdz.workshop.springioc.domain.repository;

public class BackendRepository extends AbstractRepository {

  @Override
  protected String getMessagePrefix() {
    return "BE";
  }

}
