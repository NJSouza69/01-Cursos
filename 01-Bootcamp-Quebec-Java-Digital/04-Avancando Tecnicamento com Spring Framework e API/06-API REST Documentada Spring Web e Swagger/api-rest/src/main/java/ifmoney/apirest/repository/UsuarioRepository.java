package ifmoney.apirest.repository;


import ifmoney.apirest.handler.BusinessException;
import ifmoney.apirest.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {


        // Tratamento do Exception Error
        if(usuario.getLogin()==null)
            throw new BusinessException("login");
        if(usuario.getPassword()==null)
            throw new BusinessException("password");


        if(usuario.getId()==null)
            System.out.println("SAVE - Recebemdo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebemdo o usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebemdo o id: %d para excluir da camada de repositório", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson","password"));
        usuarios.add(new Usuario("frank","password"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo id: %d para localizar um repositorio", id));
        return new Usuario("gleyson","password");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo username: %d para localizar um repositorio", username));
        return new Usuario("gleyson","password");
    }


}
