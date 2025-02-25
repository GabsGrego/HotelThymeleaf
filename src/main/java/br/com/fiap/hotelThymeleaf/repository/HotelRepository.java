package br.com.fiap.hotelThymeleaf.repository;

import br.com.fiap.hotelThymeleaf.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
