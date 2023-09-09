package br.eduardacf.template.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Endpoints {
    public static final String TEST = "/test";
    public static final String AUTH_LOGIN = "/auth/login";
    public static final String BUSCAR_PRODUTO_COM_UNICO_ID = "/products/{idProduto}";

}
