package br.eduardacf.template.utils;

import static java.nio.file.Files.newInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FileReader {
  private static final Logger LOGGER = LogManager.getLogger(FileReader.class);

  public static InputStream readFile() {
    InputStream input = null;

    String path = "src/main/resources/application.properties";
    try {
      input = newInputStream(Path.of(path));
    } catch (IOException e) {
      LOGGER.error("File not found", e);
    }
    return input;
  }
}
