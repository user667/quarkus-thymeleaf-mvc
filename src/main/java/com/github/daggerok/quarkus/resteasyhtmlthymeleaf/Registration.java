package com.github.daggerok.quarkus.resteasyhtmlthymeleaf;

import javax.ws.rs.FormParam;
import java.time.LocalDate;

public class Registration {

    @FormParam("surname")
    private String surname;
    @FormParam("firstname")
    private String firstname;
    @FormParam("birthday")
    private LocalDate birthday;

    public Registration() {
    }

    public Registration(String surname, String firstname, LocalDate birthday) {
        this.surname = surname;
        this.firstname = firstname;
        this.birthday = birthday;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
