package br.com.fiap.hotelThymeleaf.controller;

import br.com.fiap.hotelThymeleaf.controller.dtos.HotelDTO;
import br.com.fiap.hotelThymeleaf.service.HotelService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hotel")
public class HotelController {

    private HotelService hotelService;

    public HotelController(HotelService hotelService){
        this.hotelService = hotelService;
    }

    @PostMapping
    public ResponseEntity<HotelDTO> cadastrarHotel(@RequestBody HotelDTO hotelDTO) {
        HotelDTO novoHotel = hotelService.cadastrarHotel(hotelDTO);
        return ResponseEntity.ok(novoHotel);
    }



}
