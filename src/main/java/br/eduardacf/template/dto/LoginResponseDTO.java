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
public class LoginResponseDTO {
    private int id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String gender;
    private String image;
    private String token;
}
