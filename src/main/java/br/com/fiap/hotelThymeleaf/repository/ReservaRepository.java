package br.com.fiap.hotelThymeleaf.repository;

import br.com.fiap.hotelThymeleaf.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
