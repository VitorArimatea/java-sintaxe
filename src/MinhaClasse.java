public class MinhaClasse {
  public static void main (String [] args) {
    String primeiroNome = "Vítor";
    String segundoNome = "Oliveira";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.print(nomeCompleto);
  }

  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do metódo " + primeiroNome.concat(" ").concat(segundoNome);
  }
}
