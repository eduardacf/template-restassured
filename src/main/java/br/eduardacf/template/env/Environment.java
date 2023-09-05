package br.eduardacf.template.env;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Environment {
    public static String getEnvironment() {
        String environment = System.getenv("env");
        if (environment != null) {
            System.setProperty("env", environment);
        }
        return System.getProperty("env", "ambiente-1");
    }
}
