package br.eduardacf.template.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Gerais {
    public static final String BASE_URL = "base_url";
    public static final String MESSAGE = "message";
    public static final String MSG_INVALID_CREDENTIALS = "Invalid credentials";
    public static final String MSG_PRODUTO_NAO_ENCONTRADO = "Product with id '11111111' not found";
    public static final String USERNAME_VALIDO = "kminchelle";
    public static final String EMAIL_VALIDO = "kminchelle@qq.com";
    public static final int ID_VALIDO = 15;
    public static final String SENHA_VALIDA = "0lelplR";
    public static final String SENHA_INVALIDA = "0lelplXXXXXXXXX";
    public static final String ENV = "env";
    public static final String AMBIENTE_1 = "ambiente-1";
    public static final String BUSCAR_PRODUTO_COM_UNICO_ID = "/products/{idProduto}";
}
