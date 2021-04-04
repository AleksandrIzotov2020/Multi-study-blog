package ru.izotov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.izotov.domain.Message;
import ru.izotov.repos.MessageRepo;

import java.util.List;
import java.util.Map;

@Controller
public class PostControllers {

    @Autowired
    private MessageRepo messageRepo;

    @PostMapping("add")
    public String add(@RequestParam String text, @RequestParam String tag, Map<String, Object> model){
        Message message = new Message(text, tag);

        messageRepo.save(message);

        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);

        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam (required = false, defaultValue = "") String filter, Map<String, Object> model){
        Iterable<Message> messages;

        if (filter != null && !filter.isEmpty()){
            messages = messageRepo.findByTag(filter);
        }else {
            messages = messageRepo.findAll();
        }

        model.put("messages", messages);

        return "main";
    }

}
