package io.securecodebox.persistence;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.securecodebox.models.V1Scan;
import io.securecodebox.models.V1ScanSpec;
import io.securecodebox.models.V1ScanStatus;
import io.securecodebox.persistence.util.DescriptionGenerator;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class DescriptionGeneratorTest {
  DescriptionGenerator descriptionGenerator;
  V1Scan scan;

  @Before
  public void setUp() {
    descriptionGenerator = new DescriptionGenerator();
    descriptionGenerator.setClock(Clock.fixed(Instant.ofEpochSecond(1546876203), ZoneId.of("Europe/Berlin")));
    scan = new V1Scan();
    scan.setMetadata(new V1ObjectMeta());
    scan.setSpec(new V1ScanSpec());
    scan.setStatus(new V1ScanStatus());
    scan.getSpec().setScanType("nmap");
    scan.getMetadata().setName("test-scan");
    scan.getMetadata().setCreationTimestamp(DateTime.parse("2010-06-30T01:20+02:00"));
    scan.getStatus().setFinishedAt(DateTime.parse("2010-06-30T01:25+02:00"));

    scan.getSpec().setParameters(List.of());
  }

  @Test
  public void generate() {
    assert scan.getMetadata() != null;

    scan.getMetadata().setName("nmap");
    scan.getSpec().setScanType("nmap");
    scan.getSpec().setParameters(List.of("http://example.target"));

    assertEquals(
      String.join(
        System.getProperty("line.separator"),
        "# Nmap Scan",
        "Started: 30.06.2010 01:20:00",
        "Ended: 30.06.2010 01:25:00",
        "ScanType: nmap",
        "Parameters: [http://example.target]"
      ),
      descriptionGenerator.generate(scan)
    );
  }

  @Test
  public void nullGenerate() {
    assertEquals(String.join(
      System.getProperty("line.separator"),
      "# Nmap Scan",
      "Started: 30.06.2010 01:20:00",
      "Ended: 30.06.2010 01:25:00",
      "ScanType: nmap",
      "Parameters: []"
    ), descriptionGenerator.generate(scan));
  }

  @Test
  public void shouldUseCurrentTimeIfEndedAtIsntSet() {
    scan.getStatus().setFinishedAt(null);

    assertEquals(String.join(
      System.getProperty("line.separator"),
      "# Nmap Scan",
      "Started: 30.06.2010 01:20:00",
      "Ended: 07.01.2019 16:50:03",
      "ScanType: nmap",
      "Parameters: []"
    ), descriptionGenerator.generate(scan));
  }
}
