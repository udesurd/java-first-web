package com.udesurd.web.test.app.Controllers;

import com.udesurd.web.test.app.Models.WallModel;
import com.udesurd.web.test.app.Services.WallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@Controller
public class MainController {
    private final WallService wallService;

    public MainController(WallService wallService) {
        this.wallService = wallService;
    }

    @GetMapping("")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @GetMapping("/wall")
    public String wall(Map<String, Object> model) {
        Iterable<WallModel> messages = wallService.findAll();
        model.put("messages", messages);
        return "home";
    }

}