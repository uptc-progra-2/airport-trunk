package com.uptc.edu.presenter;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.edu.model.*;
import com.uptc.edu.view.View;

@RestController
@RequestMapping("/routes")
public class RoutesController {

    Route route;
    View view;

    public RoutesController() {
        route = new Route();
        view = new View();
        init();
    }

    public void init() {
        view.showGraphicMessage(
                "Bienvenido al menu de rutas\n1. Crear destino\n2. Crear ruta\n3. Mostrar rutas\n4. Salir");
        int option = view.readGraphicInt("Ingrese una opcion");
        switch (option) {
            case 1:
                createRoute();
                break;
            case 2:
                break;

            case 3:
                view.showGraphicMessage("Ha decidido salir.");
                System.exit(0);
                break;
            default:
                break;
        }
    }

    public void createRoute() {
        String origin = view.readGraphicString("Ingrese la ciudad de origen");
        String destination = view.readGraphicString("Ingrese la ciudad de destino");
        int durationTimeByHours = view.readGraphicInt("Ingrese la duracion de la ruta en horas");
        int durationTimeByMinutes = view.readGraphicInt("Ingrese la duracion de la ruta en minutos");
        int durationTimeBySeconds = view.readGraphicInt("Ingrese la duracion de la ruta en segundos");
        route.setOrigin(origin);
        route.setDestination(destination);
        route.setDurationTimeByHours(durationTimeByHours);
        route.setDurationTimeByMinutes(durationTimeByMinutes);
        route.setDurationTimeBySeconds(durationTimeBySeconds);
        view.showGraphicMessage("Ruta creada con exito");
    }

    public static void main(String[] args) {
        new RoutesController();
    }
}
