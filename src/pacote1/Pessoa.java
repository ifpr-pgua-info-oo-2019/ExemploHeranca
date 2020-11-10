package pacote1;

public class Pessoa extends Object{

    protected String nome;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }


    public void metodoX(){
        System.out.println("Executando o método X em Pessoa...");
    }

    public final void metodoZ(){
        System.out.println("Executando o método Z em Pessoa...");
    }


}
