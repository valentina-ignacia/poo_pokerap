/**
 * Módulo de la aplicación Pokerap.
 *
 * opens: paquetes que otras bibliotecas leen por reflexión (FXML inyecta los
 *        @FXML de los controladores, la TableView lee los getters del modelo
 *        y Gson lee los campos de las clases del JSON).
 * java.net.http: cliente HTTP con el que se consulta la PokeAPI.
 */
module cl.dsy1102.pokerap {
    requires javafx.controls;
    requires javafx.fxml;
    // TODO R1: agrega el módulo con las interfaces de JDBC.
    requires java.sql;
    requires java.net.http;
    requires com.google.gson;

    opens cl.dsy1102.pokerap.controller to javafx.fxml;
    opens cl.dsy1102.pokerap.model to javafx.base;
    opens cl.dsy1102.pokerap.json to com.google.gson;

    exports cl.dsy1102.pokerap;
}
