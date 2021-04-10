package ru.izotov.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*  Controller -> программный модуль, который слушает по определенному пути запросы от пользователя
 *   и возвращает некоторые данные
 * */
@Controller
public class ViewController {

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

    @GetMapping("/info")
    public String info(Model model) {return "info";}
}
