package pacote1;

public class Docente extends ServidorPublico{

    String[] disciplinas;

    public Docente(String nome, String cpf, String email){
        super(nome,cpf,email);
    }

    @Override
    public void metodoX(){
        System.out.println("Executou métodoX em Docente...");
    }
        
    public void metodoY(){
        System.out.println("Executou métodoY em Docente...");
    }
}
