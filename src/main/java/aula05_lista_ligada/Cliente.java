package aula05_lista_ligada;

public class Cliente {
    private String cpf;
    private String nome;
    
    public Cliente(String novoCpf, String novoNome){
        this.cpf = novoCpf;
        this.nome = novoNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString(){
        return this.nome;
    }
}
