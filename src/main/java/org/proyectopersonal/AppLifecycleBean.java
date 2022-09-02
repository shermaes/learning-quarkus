package org.proyectopersonal;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import java.util.logging.Logger;

@ApplicationScoped
public class AppLifecycleBean {
    //Des esta manera se puede agrega logica de negocio al momento en que la aplicacion se inicie y se detenga
    //creamos dos metodos cpaces de escuchar estos eventos

    private static final Logger LOGGER = Logger.getLogger("ListenerBean");

    void onStart(@Observes StartupEvent evt){
        LOGGER.info("The application is starting...");
    }

    void onStop(@Observes ShutdownEvent evt){
        LOGGER.info("The application is stopping...");
    }

}
