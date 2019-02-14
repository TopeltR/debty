package ee.taltech.debty.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class PersonDto {

    @NotNull
    @Email
    @Length(max=255)
    private String email;
    @NotNull
    @Length(min=8, max=255)
    private String password;
    @NotNull
    @Length(min=8, max=255)
    private String passwordConfirm;
    @NotNull
    @Length(min=1, max=255)
    private String firstName;
    @Length(min=1, max=255)
    private String lastName;

}