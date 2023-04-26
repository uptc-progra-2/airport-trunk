package com.uptc.edu.presenter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.edu.model.*;

@RestController
@RequestMapping("/routes")
public class RoutesController {
    
    Route route;

    public RoutesController() {
        route = new Route();
    }

}
