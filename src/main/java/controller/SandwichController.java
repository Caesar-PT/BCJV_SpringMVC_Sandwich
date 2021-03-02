package controller;

import model.Sandwich;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SandwichController {

    @GetMapping("index")
    public String showForm(){
        return "index";
    }

    @PostMapping("save")
    public ModelAndView save(@RequestParam ("condiment") List<String> condiment){
        ModelAndView modelAndView = new ModelAndView("view");
        String result = "";
        for (String s: condiment) {
            result += s + " ";
        }
        modelAndView.addObject("result", result);
        return modelAndView;
    }

}
