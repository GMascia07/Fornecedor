package br.trimestral.senai.trimestral.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column ( name = "nome")
    @NotNull
    @Size (max = 150)
    private String nome;

    @Size (max = 100)
    private String email;

    @Size (max = 60)
    private String telefone;

    //getter e setter

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    //to string
    @Override
    public String toString() {
        return "Fornecedor\n" +
                "ID: " + id +
                "Nome: " + nome + '\'' +
                "Email: " + email + '\'' +
                "Telefone: " + telefone;
    }



}
