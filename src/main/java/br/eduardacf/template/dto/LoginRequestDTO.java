package br.eduardacf.template.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginRequestDTO {
    private String username;
    private String password;
}
