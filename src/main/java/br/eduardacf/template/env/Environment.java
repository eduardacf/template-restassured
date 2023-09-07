package br.eduardacf.template.env;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static br.eduardacf.template.constants.Gerais.AMBIENTE_1;
import static br.eduardacf.template.constants.Gerais.ENV;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Environment {

    public static String getEnvironment() {
        String environment = System.getenv(ENV);
        if (environment != null) {
            System.setProperty(ENV, environment);
        }
        return System.getProperty(ENV, AMBIENTE_1);
    }
}
