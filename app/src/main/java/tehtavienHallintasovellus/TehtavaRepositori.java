package tehtavienHallintasovellus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TehtavaRepositori extends JpaRepository<Tehtava, Long> {
}
