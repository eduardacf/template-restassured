package br.eduardacf.template.utils;

import static br.eduardacf.template.constants.Gerais.CAMINHO_PROPRIEDADES;
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
    try {
      input = newInputStream(Path.of(CAMINHO_PROPRIEDADES));
    } catch (IOException e) {
      LOGGER.error("File not found", e);
    }
    return input;
  }
}
