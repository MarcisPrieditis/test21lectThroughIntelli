package models;

import lombok.Data;

@Data
public class UserInformation {
    private String name;
    private String surname;
    private String username;
    private String password;
    private int yearOfBirth;
    private String email;
    private boolean newUser;

}
