package br.com.fiap.hotelThymeleaf.controller.dtos;

import br.com.fiap.hotelThymeleaf.entity.Hotel;
import br.com.fiap.hotelThymeleaf.entity.Reserva;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelDTO {

    private Long id;

    private String nome;

    private String endereco;

    private List<Reserva> reservas;

    private int telefone;

    public HotelDTO(Hotel hotel) {
    }

    public HotelDTO(String nome, String endereco, int telefone, List<Reserva> reservas) {
    }
}
