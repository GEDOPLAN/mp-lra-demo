package de.gedoplan.showcase.api;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 * Einstiegspunkt für alle REST-Zugriffe.
 * <p>
 * Durch die übernahme der Default-Implementierung {@link Application} "sammelt" diese Klasse alle REST-Ressourcen der Anwendung
 * ein, d. h. diese sind alle über den angegebenen Pfad erreichbar.
 *
 * @author dw
 */
@ApplicationPath("/")
public class RestApplication extends Application {
}
