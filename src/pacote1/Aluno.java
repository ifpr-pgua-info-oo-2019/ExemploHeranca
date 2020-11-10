package pacote1;

public class Aluno extends Pessoa{

    private String matricula;
    private String[] conceitos;


    public Aluno(String nome,String cpf, String email, String matricula, String[] conceitos){
        super(nome,cpf,email);
    }


    public void umMetodo(){
        nome = "x";
    }


}
