package giadatonni.CONSEGNA_S18L2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
public class Blog {
    private long blogId;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoLettura;

    public Blog(String categoria, String titolo, String contenuto, int tempoLettura) {
        Random rndm = new Random();
        this.blogId=rndm.nextInt(1, 500);
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.tempoLettura = tempoLettura;
        this.cover = "https://picsum.photos/200/300";
    }
}
