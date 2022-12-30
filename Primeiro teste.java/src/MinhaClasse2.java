public class MinhaClasse2 {
    public static void main ( String [] args) {


    String primeiroNome = "Adriana";
    String segundoNome = "Ribeiro";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

    System.out.println(nomeCompleto) ;

}
    public static String nomeCompleto ( String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome) ;

    }

}
