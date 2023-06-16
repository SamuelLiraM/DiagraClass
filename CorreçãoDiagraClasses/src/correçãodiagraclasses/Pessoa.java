
package correçãodiagraclasses;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    //atributo lista de objetos de telefone.
    private ArrayList<Telefone>telefones;
    //atributo endereco do tipo Endereco.
    private Endereço endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Endereço getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }
    public void imprimir(){
        //imrpimir informação de pessoa
        System.out.println("Nome: "+getNome());
        System.out.println("Cpf: "+getCpf());
        System.out.println("E-mail: "+getEmail());
        
        getEndereco().imprimirEndereco();
        
        for(int i = 0 ; i< getTelefones().size(); i++){
            getTelefones().get(i).imprimirTelefone();
        }
    }
    
}
