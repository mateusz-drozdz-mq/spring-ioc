package com.mdrozdz.workshop.springioc.domain.repository;

public class FrontendRepository extends AbstractRepository {

  @Override
  protected String getMessagePrefix() {
    return "FE";
  }

}
