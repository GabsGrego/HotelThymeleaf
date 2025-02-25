package br.com.fiap.hotelThymeleaf.entity;

import br.com.fiap.hotelThymeleaf.controller.dtos.HotelDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String endereco;

    @OneToMany
    private List<Reserva> reservas;

    private int telefone;


    public Hotel(HotelDTO hotelDTO) {
        this.id = hotelDTO.getId();
        this.nome = hotelDTO.getNome();
        this.endereco = hotelDTO.getEndereco();
        this.telefone = hotelDTO.getTelefone();
        this.reservas = hotelDTO.getReservas();
    }


}
