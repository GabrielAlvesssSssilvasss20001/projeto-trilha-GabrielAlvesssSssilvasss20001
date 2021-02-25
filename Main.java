import java.io.Console;

import java.util.Random;

import org.w3c.dom.ranges.RangeException;

class Main {
  public static void main(String[] args) {
    /*
      Gabriel Alves - ADS P3 - POO
      Implementação correspondente à Atividade Individual 3.02.
    */

    try {
      Random rd = new Random();

      System.out.println("\nBem-vindo ao GRamers, o maior portal de avaliações de jogos da América Latina! (aqueles que sonham alto)\n");

      System.out.println("Para começarmos, escolha uma opção:\n - Digite 1 : Cadastre-se\n - Digite 2: Login\n - Digite 9: Sair da Aplicação\n");
      
      Console console = System.console();

      String opt = console.readLine();

      byte optInt = (byte) Integer.parseInt(opt);

      switch(optInt) {
        case 1:
          System.out.println("\nEu sou a IAdriana, sua guia pelo mundo dos games (e das críticas amadoras). \nPrimeiro, informe o seu nome:\n");

          String nome = console.readLine();

          System.out.println("\nOlá, " + nome + "! Agora, informe a sua idade, por favor:\n");

          String idade = console.readLine();

          byte idadeInt = (byte) Integer.parseInt(idade);

          // Funciona: boolean ageVer = (idadeInt >= 18);, mas quis usar o operador ternário:
          boolean ageVer = (idadeInt >= 18) ? true : false;

          if (ageVer)
            {
              System.out.println("\n"+nome+", me diga: qual é o seu tipo de jogo favorito?\n");

              String gameGenre =  console.readLine();

              System.out.println("\nQue insano!! Eu, particularmente, prefiro RPGs de mundo aberto com personagens que evoluem conforme o avanço da história. Se houver muitas armas e veículos no jogo, melhor ainda!");

              System.out.println("\nPor fim, você poderia conferir suas informações?");

              System.out.println("- Você é "+nome+", de "+idade+" anos, e adora games de " +gameGenre+"!\n Digite 1 para confirmar e qualquer outro número para rejeitar: ");

              String ansVer = console.readLine();
              byte ansVerInt = (byte) Integer.parseInt(ansVer);
              

              if (ansVerInt==1)
              {
                System.out.println("Última coisinha: sua senha!");
                String password = console.readLine();

                System.out.println("Só pra confirmar, sua senha novamente:");
                String passwordConfirm = console.readLine();

                if (password.equalsIgnoreCase(passwordConfirm)) {
                  System.out.println("\nSua jornada começará em breve, "+nome+"! Te vejo logo.");
                }
                else {
                  System.out.println("\n");                  
                  throw new Exception(" Erro nas credenciais - Opa! Senha e Confirmação não são iguais!");
                }
              }
              else{
                System.out.println("\n");
                throw new Exception("Erro nas credenciais - :/ Tenta novamente, vai. Seus dados estão incorretos.");
              }
            }
          else if (idadeInt <= 5 && idadeInt >=0) {
            System.out.println("\n");
            throw new Exception("Erro de permissão - Você não possui autorização para acessar esse website!");
          }
          else if (idadeInt<0 || idadeInt>150) {
            System.out.println("\nImpossível!");
            throw new Exception("Erro nas credenciais - BROKEN - BIP, BIP, BIP... - REPAIR NOW, BIP...");
          }
          else {
            int wait = (18 - idadeInt);
            System.out.println("\nQue pena, "+nome+". Você precisa ser maior de idade para acessar o portal. :( \nEspere só mais "+wait+" anos ou acesse o site acompanhado de um responsável maior de idade.");
          }
        break;
      
        case 2:
          System.out.println("Já realizou cadastro aqui? Então, bem-vindo(a)(e) de volta!\nInforme seu endereço de login:");
          
          String enderecoLog = console.readLine();
          String msg1 = "\nSeu endereço de login é %s\n";

          System.out.println(String.format(msg1, enderecoLog));
          
          System.out.println("Agora, sua senha:");
          String senhaLog = console.readLine();
          String msg2 = "\nA sua senha cadastrada é %s\n";

          System.out.println(String.format(msg2, senhaLog));

          System.out.println("Autenticando...");

          boolean bool = rd.nextBoolean();
          
          if (bool) {
              System.out.println("\nLogin realizado - Você entrou!\nAguarde...");
          }
          else {
              System.out.println("\nDescupe. Ocorreu uma falha na autenticação. Tente novamente :P");
              throw new Exception("Erro de Autenticação - BROKEN - BIP, BIP, BIP... - REPAIR NOW, BIP... SERVER BROKEN, BIP, BIP");
          }
        break;

        case 9:
          System.exit(0);
          break;
        
        default:
        // Ainda dá erro: throw new RangeException("Não é um dos valores disponíveis");
          throw new Exception(" OutOfRangeException - Não é um dos valores disponíveis :<");
      }
    }
    catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}