package br.com.fiap.hotelThymeleaf.service;

import br.com.fiap.hotelThymeleaf.controller.dtos.HotelDTO;
import br.com.fiap.hotelThymeleaf.entity.Hotel;
import br.com.fiap.hotelThymeleaf.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    private HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }


    public HotelDTO cadastrarHotel(HotelDTO hotelDTO) {
        Hotel hotel = new Hotel(hotelDTO);
        hotel = hotelRepository.save(hotel);
        return new HotelDTO(hotel);
    }

    public List<HotelDTO> listarHoteis(){
        return hotelRepository.findAll().stream().map(
                hotel -> new HotelDTO(hotel.getNome(),
                                        hotel.getEndereco(),
                                        hotel.getTelefone(),
                                        hotel.getReservas())).toList();
    }
}
