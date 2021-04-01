package ru.izotov.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/*  Controller -> программный модуль, который слушает по определенному пути запросы от пользователя
*   и возвращает некоторые данные
* */
@Controller
public class GettingController {

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required = false, defaultValue = "World") String name,
            Map<String, Object> model
    ){
        model.put("name", name);
        return "greeting";
    }

    @GetMapping("/")
    public String main(Map<String, Object> model){
        model.put("some", "This is main page");
        return "main";
    }
}
