package br.com.devmedia.curso.dao;

import br.com.devmedia.curso.domain.TipoSexo;
import br.com.devmedia.curso.domain.Usuario;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {

    private static List<Usuario> us;

    public UsuarioDaoImpl() {
        createUserList();
    }

    private List<Usuario> createUserList() {
        if (us == null) {
            us = new LinkedList<>();
            us.add(new Usuario(System.currentTimeMillis()+1L, "Ana", "da Silva", LocalDate.of(1992,5,1), TipoSexo.FEMININO));
            us.add(new Usuario(System.currentTimeMillis()+2L, "Luiz", "dos Santos", LocalDate.of(1990,8,11), TipoSexo.FEMININO));
            us.add(new Usuario(System.currentTimeMillis()+3L, "Mariana", "Mello", LocalDate.of(1988,9,17), TipoSexo.FEMININO));
            us.add(new Usuario(System.currentTimeMillis()+4L, "Caren", "Pereira Mello", LocalDate.of(1968,9,17), TipoSexo.FEMININO));
            us.add(new Usuario(System.currentTimeMillis()+5L, "Sonia", "Fagundes", LocalDate.of(1968,9,17), TipoSexo.FEMININO));
            us.add(new Usuario(System.currentTimeMillis()+6L, "Norberto", "de Souza", LocalDate.of(1968,9,17), TipoSexo.FEMININO));
        }
        return us;
    }

    @Override
    public void salvar(Usuario usuario) {
        usuario.setId(System.currentTimeMillis());
        us.add(usuario);
    }

    @Override
    public void editar(Usuario usuario) {
        us.stream()
                .filter((u) -> u.getId().equals(usuario.getId()))
                .forEach((u) -> {
                    u.setNome(usuario.getNome());
                    u.setSobrenome(usuario.getSobrenome());
                    u.setDtNascimento(usuario.getDtNascimento());
                });
    }

    @Override
    public void excluir(Long id) {
        us.removeIf((u) -> u.getId().equals(id));
    }

    @Override
    public Usuario getId(Long id) {
        return us.stream()
                .filter((u) -> u.getId().equals(id))
                .collect(Collectors.toList()).get(0);
    }

    @Override
    public List<Usuario> getTodos() {
        return us;
    }
}


