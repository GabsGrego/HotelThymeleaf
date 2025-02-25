package br.com.fiap.hotelThymeleaf.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int quarto;

    private String cliente;

    private int estadia; //quantos dias ficará hospedado
}
