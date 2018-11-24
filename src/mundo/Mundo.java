package mundo;

public class Mundo {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        p1.nome = "Adão";
        p2.nome = "Eva";
        p1.andar();
        p2.comer();
        
        Bebe b1 = new Bebe("Abel", 'M');
        b1.andar();
    }
    
}
