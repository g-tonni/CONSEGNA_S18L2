package giadatonni.CONSEGNA_S18L2.services;

import giadatonni.CONSEGNA_S18L2.entities.Blog;
import giadatonni.CONSEGNA_S18L2.entities.User;
import giadatonni.CONSEGNA_S18L2.exceptions.NotFoundException;
import giadatonni.CONSEGNA_S18L2.payload.BlogPayload;
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
public class BlogsService {
    private List<Blog> listaBlog;

    public Blog postaBlog(BlogPayload body) {
        Blog nuovoBlog = new Blog(body.getCategoria(), body.getTitolo(), body.getContenuto(), body.getTempoLettura());
        this.listaBlog.add(nuovoBlog);
        return nuovoBlog;
    }

    public Blog trovaBlog(long blogId){
        Blog found = null;
        for (int i = 0; i < listaBlog.size(); i++) {
            if (listaBlog.get(i).getBlogId() == blogId){
                found = listaBlog.get(i);
            }
        }
        if (found == null) throw new NotFoundException(blogId);
        return found;
    }

    public Blog modificaBlog(long blogId, BlogPayload body){
        Blog found = null;
        for (int i = 0; i < listaBlog.size(); i++) {
            if (listaBlog.get(i).getBlogId() == blogId){
                found = listaBlog.get(i);
                found.setCategoria(body.getCategoria());
                found.setTitolo(body.getTitolo());
                found.setContenuto(body.getContenuto());
                found.setTempoLettura(body.getTempoLettura());
            }
        }
        if (found == null) throw new NotFoundException(blogId);
        return found;
    }
}
