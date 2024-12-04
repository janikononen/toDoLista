package tehtavienHallintasovellus;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//Määrittää luokan REST API:n käsittelijäksi.
@RestController
//Määrittää reitin kaikkien tehtävätoimintojen juureksi.
@RequestMapping("/hevonperse")
public class RestOhjain {   
    //injektoi Tehtavarepositorin käyttöön
    @Autowired
    private TehtavaRepositori tehtavaRepositori;

    @GetMapping
    public List<Tehtava> hankiKaikkiTehtavat(){
        return tehtavaRepositori.findAll();
    }

    @PostMapping
    public Tehtava lisaatTehtava(@RequestBody Tehtava tehtava){
        return tehtavaRepositori.save(tehtava);
    }
    
    @PutMapping("/{id}")
    public Tehtava paivitaTehtava(@PathVariable Long id, @RequestBody Tehtava paivitettuTehtava){
        return tehtavaRepositori.findById(id).map(tehtava -> {
            tehtava.setNimi(paivitettuTehtava.getNimi());
            tehtava.setKuvaus(paivitettuTehtava.getKuvaus());
            tehtava.setDeadline(paivitettuTehtava.getDeadline());
            tehtava.setTehty(paivitettuTehtava.isTehty());
            return tehtavaRepositori.save(tehtava);
        }).orElseThrow(() -> new RuntimeException("Tehtavaa ei loytynyt"));
    }

    @DeleteMapping("/{id}")
    public void poistaTehtava(@PathVariable Long id){
        tehtavaRepositori.deleteById(id);
    }
}
