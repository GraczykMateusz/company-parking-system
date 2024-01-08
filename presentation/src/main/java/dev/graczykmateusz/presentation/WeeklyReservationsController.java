package dev.graczykmateusz.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/x")
class WeeklyReservationsController {
    
    @GetMapping
    String x() {
        return "{\"x\": \"x\"}";
    }
}
