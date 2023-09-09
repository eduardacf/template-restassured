package br.eduardacf.template.factory;

import br.eduardacf.template.dto.request.TituloRequestDTO;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static br.eduardacf.template.constants.auth.Auth.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TituloRequestFactory {

    public static TituloRequestDTO buildTituloDTO(String title) {
        return TituloRequestDTO
                .builder()
                .title(title)
                .build();
    }

    public static TituloRequestDTO buildTituloAdicionadoComSucesso() {
        return buildTituloDTO("Titulo NOVO!!!");
    }
    public static TituloRequestDTO buildTituloAlteradoComSucesso() {
        return buildTituloDTO("Titulo ALTERADO!!!");
    }
}
