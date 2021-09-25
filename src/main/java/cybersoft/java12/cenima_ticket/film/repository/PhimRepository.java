package cybersoft.java12.cenima_ticket.film.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cybersoft.java12.cenima_ticket.film.entity.Phim;

@Repository
public interface PhimRepository extends JpaRepository<Phim, Long> {

}
