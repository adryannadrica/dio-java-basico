public class MinhaClasse2 {
    
    public static void main ( String [] args) {


    String primeiroNome = "Adriana";
    String segundoNome = "Andrea da Silva ";
    String terceiroNome = "Ribeiro";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome, terceiroNome);

    System.out.println(nomeCompleto) ;

 }
 
    public static String nomeCompleto (String primeiroNome,String segundoNome,String terceiroNome) {
        return primeiroNome.concat(" ").concat(segundoNome).concat(terceiroNome); 
        }
        }

    

