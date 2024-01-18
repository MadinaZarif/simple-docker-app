package ru.itgirls.simpledockerapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Docker! Docker поддерживает большинство популярных операционных систем, включая Linux, Windows и macOS, и широко используется в индустрии для разработки, тестирования и развертывания приложений.";

    }
}
