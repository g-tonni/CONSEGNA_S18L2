package giadatonni.CONSEGNA_S18L2.services;

import giadatonni.CONSEGNA_S18L2.entities.User;
import giadatonni.CONSEGNA_S18L2.payload.UserPayload;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
@ToString
@AllArgsConstructor
public class UsersService {
    private List<User> listaUser;

    public User postaUtente(UserPayload body){
        User nuovoUtente = new User(body.getNome(), body.getCognome(), body.getEmail(), body.getDataNascita());
        this.listaUser.add(nuovoUtente);
        return nuovoUtente;
    }

}
