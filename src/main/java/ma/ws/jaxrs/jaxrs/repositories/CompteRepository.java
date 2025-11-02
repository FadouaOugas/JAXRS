package ma.ws.jaxrs.jaxrs.repositories;

import ma.ws.jaxrs.jaxrs.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
