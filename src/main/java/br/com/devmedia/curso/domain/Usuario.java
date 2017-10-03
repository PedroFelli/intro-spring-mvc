package br.com.devmedia.curso.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Usuario {
    private Long id;
    private String nome;
    private String sobrenome;
    private TipoSexo sexo;


    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dtNascimento;

    public Usuario(long id, String ana, String da_silva, LocalDate of, TipoSexo feminino){

        super();
    }


    public Usuario(Long id, String nome, String sobrenome, TipoSexo sexo, LocalDate dtNascimento) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dtNascimento = dtNascimento;
    }

    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public Long getId() {

        return id;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
