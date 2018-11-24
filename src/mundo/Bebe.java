package mundo;

public class Bebe extends Pessoa{
    short meses;
    
    //Criação do método construtor
    public Bebe(String nome, char sexo){
        this.nome = nome;
        this.sexo = sexo;
    }
    
    //Reescrita do método
    @Override
    public void andar(){
        System.out.println(nome + " está engatinhando!");
    }
    
}
