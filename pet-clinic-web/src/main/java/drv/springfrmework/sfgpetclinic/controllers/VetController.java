package drv.springfrmework.sfgpetclinic.controllers;

import drv.springfrmework.sfgpetclinic.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"","/","/vets/index.html","/vets.html"})
    public String listVets(Model model){
         model.addAttribute("vets", vetService.findAll());
        return  "vets/index";
    }

    @RequestMapping({"/find"})
    public  String findOwners(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "notimplemented";
    }
}
