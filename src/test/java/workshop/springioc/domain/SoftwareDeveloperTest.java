package workshop.springioc.domain;

import org.junit.jupiter.api.Test;
import workshop.springioc.domain.formatter.JavaFormatter;
import workshop.springioc.domain.formatter.KotlinFormatter;
import workshop.springioc.domain.repository.BackendRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SoftwareDeveloperTest {

  @Test
  void testJavaDeveloper() {
//    given:
    var developer = new SoftwareDeveloper();
    developer.setFormatter(new JavaFormatter());
    developer.setRepository(new BackendRepository());
//    when:
    developer.workOn("CQC-123");
    developer.workOn("CQC-456");
//    then:
    assertIterableEquals(List.of("BE: <J>CQC-123<J>", "BE: <J>CQC-456<J>"), developer.getCommits());
  }

  @Test
  void testKotlinDeveloper() {
    //    given:
    var developer = new SoftwareDeveloper();
    developer.setFormatter(new KotlinFormatter());
    developer.setRepository(new BackendRepository());
//    when:
    developer.workOn("CQC-123");
    developer.workOn("CQC-456");
//    then:
    assertIterableEquals(List.of("BE: |K| CQC-123 |K|", "BE: |K| CQC-456 |K|"), developer.getCommits());

  }
}
