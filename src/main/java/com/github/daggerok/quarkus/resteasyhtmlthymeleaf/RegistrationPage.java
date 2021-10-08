package com.github.daggerok.quarkus.resteasyhtmlthymeleaf;

import org.jboss.resteasy.annotations.Form;
import org.jboss.resteasy.plugins.providers.html.Renderable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDateTime;

@Path("/registration")
@Produces(MediaType.TEXT_HTML)
public class RegistrationPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegistrationPage.class);

    @Inject
    private Rendering render;

    @GET
    @Path("")
    public Renderable query() {
        return render.view("index")
                .with("now", LocalDateTime.now())
                .with("registration", new Registration());
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("")
    public Renderable path(@Form Registration registration) {
        LOGGER.info("registration: '{}'", registration);
        return render.view("index")
                .with("registration", registration)
                .with("now", LocalDateTime.now());
    }
}
