package com.github.daggerok.quarkus.resteasyhtmlthymeleaf;

import javax.ws.rs.ext.ParamConverter;
import java.time.LocalDate;

public class LocalDateParamConverter implements ParamConverter<LocalDate> {

    @Override
    public LocalDate fromString(String s) {
        return LocalDate.parse(s);
    }

    @Override
    public String toString(LocalDate localDate) {
        return localDate.toString();
    }
}
