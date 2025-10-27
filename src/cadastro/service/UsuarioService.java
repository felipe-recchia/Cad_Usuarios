package cadastro.service;

import br.com.arthur.cadastro.model.Usuario;
import br.com.arthur.cadastro.repository.UsuarioRepository;
import java.util.List;

public class UsuarioService {
    private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void cadastrarUsuario(Usuario usuario) {
        repository.adicionar(usuario);
    }

    public void editarUsuario(int id, String novoNome, String novoEmail) {
        repository.editar(id, novoNome, novoEmail);
    }

    public void excluirUsuario(int id) {
        repository.remover(id);
    }

    public List<Usuario> listarUsuarios() {
        return repository.listar();
    }
}


// package cadastro.service;

// import cadastro.model.Usuario;
// import cadastro.repository.UsuarioRepository;
// import java.util.List;

// public class UsuarioService {
//     private UsuarioRepository repository = new UsuarioRepository();

//     public void cadastrarUsuario(Usuario usuario) {
//         repository.adicionar(usuario);
//     }
//     public boolean idExiste(int id) {
//         return repository.listar().stream().anyMatch(u -> u.getId() == id);
//     }
    
//     public void editarUsuario(int id, String novoNome, String novoEmail) {
//         repository.editar(id, novoNome, novoEmail);
//     }

//     public void excluirUsuario(int id) {
//         repository.remover(id);
//     }

//     public List<Usuario> listarUsuarios() {
//         return repository.listar();
//     }
// }
