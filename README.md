# Tehtävienhallintasovellus (To-Do App)

## 📋 Projektin Kuvaus

Tämä projekti on yksinkertainen **tehtävienhallintasovellus**, joka tarjoaa RESTful API:n tehtävien hallintaan. Sovellus mahdollistaa tehtävien lisäämisen, hakemisen, päivittämisen ja poistamisen. Tietojen tallennukseen käytetään **SQLite**-tietokantaa, ja sovellus on toteutettu käyttäen **Spring Bootia** ja **JPA:ta**.

---

## 🎯 Ominaisuudet

1. **Tehtävän lisääminen**: Käyttäjä voi luoda uuden tehtävän.
2. **Tehtävien hakeminen**: Käyttäjä voi hakea kaikki tehtävät tai yksittäisen tehtävän ID:n perusteella.
3. **Tehtävän päivittäminen**: Käyttäjä voi päivittää olemassa olevan tehtävän tietoja.
4. **Tehtävän poistaminen**: Käyttäjä voi poistaa tehtävän ID:n perusteella.
5. **Tietokantaintegraatio**: Käyttää **SQLite-tietokantaa** tietojen tallentamiseen.

---

## 🚀 API:n Käyttö

### 1. Hae kaikki tehtävät
**GET** `/hevonperse`
- **Vastaus**: Lista tehtävistä (JSON).

### 2. Lisää uusi tehtävä
**POST** `/hevonperse`
- **Pyynnön runko (JSON)**:
    ```json
    {
      "nimi": "Testitehtävä",
      "kuvaus": "Kuvaus tehtävälle",
      "deadline": "2024-12-31",
      "tehty": false
    }
    ```
- **Vastaus**: Luodun tehtävän tiedot.

### 3. Päivitä olemassa oleva tehtävä
**PUT** `/hevonperse/{id}`
- **Pyynnön runko (JSON)**:
    ```json
    {
      "nimi": "Päivitetty tehtävä",
      "kuvaus": "Päivitetty kuvaus",
      "deadline": "2025-01-15",
      "tehty": true
    }
    ```
- **Vastaus**: Päivitetyn tehtävän tiedot.

### 4. Poista tehtävä
**DELETE** `/hevonperse/{id}`

---

## 🧠 Oppimiset

Projektin aikana opin seuraavat asiat:

1. **projektin luominen**:
   - Tutustuminen Gradlen Kotlinin ominaisuuksiin
   - Tutustuminen riippuvuuksiin ja niiden määrittäminen Gradle.ktl -tiedostossa

2. **Spring Boot -kehys**:
   - Kuinka rakentaa REST API käyttämällä `@RestController`, `@RequestMapping`, `@GetMapping`, `@PostMapping`, jne.
   - Sovelluksen konfigurointi `application.properties`-tiedoston avulla.

3. **Spring Data JPA**:
   - JPA-entiteetin luominen annotaatioilla kuten `@Entity`, `@Id`, ja `@GeneratedValue`.
   - Repositorion käyttö tietokantaoperaatioihin ilman käsin kirjoitettua SQL:ää.

4. **SQLite-tietokanta**:
   - Kevyen tietokannan integrointi Spring Boot -sovellukseen.
   - Tietokantataulujen automaattinen luonti JPA-entiteettien avulla (`spring.jpa.hibernate.ddl-auto=update`).
   - Yhteyden luonti `application.properties`-tiedoston avulla.
   - riippuvuudet

5. **Postmanin käyttö**:
   - API-pyyntöjen testaus eri HTTP-metodeilla (GET, POST, PUT, DELETE).
   - JSON-datan lähettäminen ja vastaanottaminen.

6. **Virheiden selvitys**:
   - Lokien ja virheilmoitusten analysointi, esimerkiksi 404- ja 405-virheiden korjaaminen.

---

## 🛠️ Teknologiat

- **Java 21**
- **Spring Boot 3.4**
- **Spring Data JPA**
- **SQLite**
- **Postman**

---

## 📂 Sovelluksen Asetukset

**`application.properties`**:
```properties
spring.datasource.url=jdbc:sqlite:tehtavat.db
spring.datasource.driver-class-name=org.sqlite.JDBC
spring.jpa.properties.hibernate.dialect=org.hibernate.community.dialect.SQLiteDialect
spring.jpa.hibernate.ddl-auto=update
