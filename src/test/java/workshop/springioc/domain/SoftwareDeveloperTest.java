package workshop.springioc.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SoftwareDeveloperTest {

  @Test
  void testSoftwareDeveloper() {
//    given:
    var developer = new SoftwareDeveloper();
//    when:
    developer.workOn("CQC-123");
    developer.workOn("CQC-456");
//    then:
    assertIterableEquals(List.of("BE: <J>CQC-123<J>", "BE: <J>CQC-456<J>"), developer.getCommits());
  }
}
