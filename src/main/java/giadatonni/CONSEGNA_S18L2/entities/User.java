package giadatonni.CONSEGNA_S18L2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Random;

@Getter
@Setter
@ToString
public class User {
    private long userId;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataNascita;
    private String avatar;

    public User(String nome, String cognome, String email, LocalDate dataNascita) {
        Random rndm = new Random();
        this.userId=rndm.nextInt(1, 500);
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;
        this.avatar = "https://ui-avatars.com/api/?name=" + nome + "+" + cognome;
    }
}
