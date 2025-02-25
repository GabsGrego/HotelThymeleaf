package br.com.fiap.hotelThymeleaf.controller;

import br.com.fiap.hotelThymeleaf.controller.dtos.HotelDTO;
import br.com.fiap.hotelThymeleaf.service.HotelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private HotelService hotelService;

    public HomeController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<HotelDTO> hotelDTOS = hotelService.listarHoteis();
        model.addAttribute("hoteis",hotelDTOS);
        model.addAttribute("rawHtml","<h2>Conteúdo HTML não escapado</h2>");
        return "home";
    }
}
