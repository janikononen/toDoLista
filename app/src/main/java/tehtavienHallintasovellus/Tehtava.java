package tehtavienHallintasovellus;

import java.time.LocalDate;

import jakarta.persistence.*;

//määrittää että luokalla on oltava vastaavan niminen taulu tietokannassa
@Entity
public class Tehtava {
    //Tässä tietokanta luo id-arvot automaattisesti
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // määritellään tehtävä-olion parametritiedot
    private String nimi;
    private String kuvaus;
    private LocalDate deadline;
    private boolean tehty;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNimi() {
        return nimi;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    public String getKuvaus() {
        return kuvaus;
    }
    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }
    public LocalDate getDeadline() {
        return deadline;
    }
    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
    public boolean isTehty() {
        return tehty;
    }
    public void setTehty(boolean tehty) {
        this.tehty = tehty;
    }


}
