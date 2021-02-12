import java.io.Console;

class Main {
  public static void main(String[] args) {
    /*
      Gabriel Alves - ADS P3 - POO
      Implementação correspondente à Atividade Individual 3.02.
    */

    try {    
    System.out.println("\nBem-vindo ao GRamers, o maior portal de avaliações de jogos da América Latina! (aqueles que sonham alto)\n");

      System.out.println("\nEu sou a IAdriana, sua guia pelo mundo dos games (e das críticas amadoras). \nPrimeiro, informe o seu nome:\n");

      Console console = System.console();

      String nome = console.readLine();

      System.out.println("\nOlá, " + nome + "! Agora, informe a sua idade, por favor:\n");

      String idade = console.readLine();

      byte idadeInt = (byte) Integer.parseInt(idade);

      boolean ageVer = (idadeInt >= 18);

      if (ageVer)
        {
          System.out.println("\n"+nome+", me diga: qual é o seu tipo de jogo favorito?\n");

          String gameGenre =  console.readLine();

          System.out.println("\nQue insano!! Eu, particularmente, prefiro RPGs de mundo aberto com personagens que evoluem conforme o avanço da história. Se houver muitas armas e veículos no jogo, melhor ainda!");

          System.out.println("\nPor fim, você poderia conferir suas informações?");

          System.out.println("- Você é "+nome+", de "+idade+" anos, e adora games de " +gameGenre+"!\n Digite 1 para confirmar e 0 para rejeitar: ");

          String ansVer = console.readLine();
          byte ansVerInt = (byte) Integer.parseInt(ansVer);
          

          if (ansVerInt==1)
          {
            System.out.println("Sua jornada começará em breve, "+nome+"! Te vejo logo.");
          }
          else {
            System.out.println(" :/ Tente novamente.");
          }
        }
      else {
        System.out.println("\nQue pena,"+nome+". Você precisa ser maior de idade para acessar o portal.");
      }
    }
    catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}