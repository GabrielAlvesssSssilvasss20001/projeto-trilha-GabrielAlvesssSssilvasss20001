/*
  Gabriel Alves - ADS P3 - POO
*/

import java.io.Console;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
//import org.w3c.dom.ranges.RangeException;

// Classe main com métodos secundários e método main():

class Main {
  // Método para verificar se string é numérica e retornar boolean
  public static boolean isNumeric(String str) { 
    try {  
      Integer.parseInt(str);  
      return true;
    } catch(NumberFormatException e){  
      return false;  
    }  
  }

  // Método para exbir opções e obter opção informada
  public static String obterOpcao() {
      Console console = System.console();
      
      System.out.println("");
      System.out.println("********************************************");
      System.out.println("** Informe a opção desejada: **");
      System.out.println("- Digite 1 para Inserir novo jogo e descrição // 1 - Insert a new game and its description");
      System.out.println("- Digite 2 para Listar jogos // 2 - List the inserted games");
      System.out.println("- Digite 3 para listar os jogos mais bem avaliados // 3 - List the greatest games in evaluation terms");
      System.out.println("- Digite X para SAIR - X - CLOSE the application");
      System.out.println("********************************************");
      System.out.println("");

      String option = console.readLine();
      return option;
  }
  
  // Método para fixar um primeiro objeto do tipo Game na lista de Games
  public static void pinGame(ArrayList<Jogo> gamesVector) {

    Usuario pinnedUser = new Usuario("Gabriel Alves - Não tenho formação, sou jogador e a crítica é amadora, mas honesta", 20, "Free Roam, Heroes, Adventure, RPG, Stealth, Exploration", "********");

    //

    Resenha pinnedReview = new Resenha(pinnedUser, 0, "");

    pinnedReview.grade = 9.0;

    pinnedReview.evaluation = " *EVITEI SPOILERS, MAS LEIA COM PRECAUÇÃO* \"A aventura definitiva do Homem-Morcego (trecho por TechTudo) \" contra os criminosos de Gotham City. Batman - Arkham Knight, o último título da épica trilogia desenvolvida pela Rocksteady, elevou o conceito dos jogos de super-heróis. Claro, grande parte do crédito deve ser dado aos seus antecessores, Arkham Asylum (), Arkham City () e até mesmo o avulso Arkham Origins (), desenvolvido pela Warner Bros Montréal, que construiram um legado por meio de uma história sólida, gameplay fluído, personagens marcantes e nostálgicos e trama envolvente. E, justamente por isso, que, para uma nova geração de consoles, não se esperava menos do encerramento da série de games do melhor detetive do mundo. Um jogo marcante, com uma história profunda, que mantém personagens clássicos de um jeito bastante inesperado e acrescenta outros, mais desafiadores, motivados por destruir o Batman e tomar o controle de Gotham de uma vez por todas. O gameplay é tão fluído quanto nos demais títulos e possui novas mecânicas, apesar de repetir uma boa parte das antigas. Precisar de pontos de upgrade para desbloquear algumas habilidades já conhecidas e EXTENSAMENTE usadas nos games anteriores talvez seja um dos únicos pontos frustrantes do jogo. A constução das três regiões principais de Gotham, entretanto, é surpreendente. Os gráficos incríveis e a cidade detalhada tornam sua exploração muito satisfatória, e as novas mecânicas ajudam bastante. Sem falar, é lógico, de um dos principais incrementos do jogo, o Batmóvel, que nos dá novas formas de combater o crime em Gotham: perseguições em alta velocidade, detruição em massa e combates pesados contra drones e helicópteros, fazendo uso da infantaria do modo combate. Assim, com uma continuação incrível e gráficos insanos (para constar: o jogo é de 2015!!!), Batman Arkham Knight merece o título de um dos melhores da geração passada (PS4, XBOX ONE) de vídeo-games e continua imperdível para a nova.";

    //

    Jogo pinnedGame = new Jogo("", 0, "", 0.0, "", "", "", "", pinnedReview);

    pinnedGame.title = "Batman - Arkham Knight (História Principal)";

    pinnedGame.organization = "Metacritic average review's grades for PC, PS4 and XBOX ONE versions";

    pinnedGame.year = 2015;
    
    pinnedGame.externalGrade = 8.66;

    pinnedGame.urlExternalGrade = "https://www.metacritic.com/game/pc/batman-arkham-knight/user-reviews";

    pinnedGame.description = "\"Batman: Arkham Knight é um jogo eletrônico de ação-aventura produzido pela Rocksteady Studios e lançado mundialmente 23 de Junho de 2015 pela Warner Bros. Interactive Entertainment para PlayStation 4, Xbox One e Microsoft Windows.\"  WIKI";

    pinnedGame.publisher = "Warner Bros. Interactive Entertainment";

    pinnedGame.studioDeveloper = "Rocksteady";

    gamesVector.add(pinnedGame);
  }

  // Método para tratar a opção informada ao método obterOpcao()
  public static void gameOptions(ArrayList<Jogo> gamesVector, Usuario user) {
    Console console = System.console();
    
    String option = obterOpcao();

    while (true) {
      
      switch (option) {

        case "1":
          Resenha review = new Resenha(user, 0, "");

          Jogo jogo = new Jogo("", 0, "", 0.0, "", "", "", "", review);

          System.out.println("\n \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \nAvaliar como " +user.nameOrNick+"? 1 ou 0");
          String ansVer2 = console.readLine();
          
          if (Integer.parseInt(ansVer2)!=1) {
            System.out.println("Erro de validação de usuário");
            System.exit(0);
          }

          System.out.println("\nVamos começar. Qual é o título do jogo a ser avaliado? - Especifique se abrange história principal, missões secundárias (quais) e/ou DLCs (quais)\n");
          jogo.title = console.readLine();

          System.out.println("\nInforme o ano de lançamento do escopo avaliado:\n");
          String ano = console.readLine();
          jogo.year = Integer.parseInt(ano);

          System.out.println("\nInforme a organização ou o site que disponibiliza a avaliação externa:\n");
          jogo.organization = console.readLine();

          System.out.println("\nInforme a nota média das avaliações externas publicadas nesse site ou organização\n");
          String externalNota = console.readLine();
          jogo.externalGrade = Integer.parseInt(externalNota);

          System.out.println("\nInforme um link para acessar pelo menos algumas dessas avaliações:\n");
          jogo.urlExternalGrade = console.readLine();

          System.out.println("\nApresente uma breve descrição ou sinopse do escopo avaliado:\n");
          jogo.description = console.readLine();

          System.out.println("\nInforme a publisher responsável pelo jogo:\n");
          jogo.publisher = console.readLine();

          System.out.println("\nInforme o estúdio de desenvolvimento responsável pelo jogo/escopo avaliado:\n");
          jogo.studioDeveloper = console.readLine();

          System.out.println("\n*************\n");

          System.out.println("\nAgora, dando início à sua crítica ao jogo:\n");

          System.out.println("\n - Elabore uma avaliação escrita, tentando compreender os aspectos principais do jogo avaliado:\n");
          review.evaluation = console.readLine();

          System.out.println("\n - Por fim, informe uma nota númerica, entre 0 e 10, incluindo meios: \n");

          String nota = console.readLine();
          review.grade = Double.parseDouble(nota);

          gamesVector.add(jogo);

        break;

        case "2":
          System.out.println("\n///////////////////////////////////////////////////////////////////////////////////\nLISTA DE JOGOS AVALIADOS ATÉ O MOMENTO\n");

          for (Jogo gameItem : gamesVector) {
            if (!gameItem.title.isEmpty()) {
              System.out.println("********************************************");

              System.out.println("\nTítulo: "+gameItem.title+"\n");
              System.out.println("\nAno de Lançamento: "+gameItem.year+"\n");

              System.out.println("\nPublisher: " +gameItem.publisher+" - Estúdio: "+gameItem.studioDeveloper+"\n");

              System.out.println("\nDescrição: "+gameItem.description+"\n");

              System.out.println("\nNota em "+gameItem.organization+": "+gameItem.externalGrade+"\n");

              System.out.println("\nDescrição: "+gameItem.description+"\n");

              System.out.println("************");

              System.out.println("\nAvaliador(a)/Instituição: "+gameItem.review.orgOrEvaluator.nameOrNick+"\n");

              System.out.println("\nAvaliação Escrita: "+gameItem.review.evaluation+"\n");

              System.out.println("\nNota de 0 a 10: "+gameItem.review.grade+"\n");

              System.out.println("********************************************");    
            }
            else {
              break;
            }
          }

        break;
      
        case "3":
          System.out.println("\n///////////////////////////////////////////////////////////////////////////////////\nLISTA DE JOGOS MAIS BEM AVALIADOS ATÉ O MOMENTO\n");

          for (Jogo gameItem : gamesVector) {
            if (((gameItem.externalGrade + gameItem.review.grade)/2) >= 7.0) {             
              System.out.println("********************************************");

              System.out.println("\nTítulo: "+gameItem.title+"\n");
              System.out.println("\nAno de Lançamento: "+gameItem.year+"\n");

              System.out.println("\nPublisher: " +gameItem.publisher+" - Estúdio: "+gameItem.studioDeveloper+"\n");

              System.out.println("\nDescrição: "+gameItem.description+"\n");

              System.out.println("\nNota em"+gameItem.organization+": "+gameItem.externalGrade+"\n");

              System.out.println("\nDescrição: "+gameItem.description+"\n");

              System.out.println("************");

              System.out.println("\nAvaliador(a)/Instituição: "+gameItem.review.orgOrEvaluator.nameOrNick+"\n");

              System.out.println("\nAvaliação Escrita: "+gameItem.review.evaluation+"\n");

              System.out.println("\nNota de 0 a 10: "+gameItem.review.grade+"\n");

              System.out.println("********************************************");    
            }
            else {
              continue;
            }
          }
        break;

        case "X":
        case "x":
          System.exit(0);
        default:
          // Ainda dá erro: throw new RangeException("Não é um dos valores disponíveis");
          System.out.println("OutOfRangeException - Não é um dos valores disponíveis :< Tente novamente");
      }

    option = obterOpcao();

    }
  }

  public static void main(String[] args) {

    try {
      // Definição de variáveis/métodos globais iniciais para escopo do método 'main':
      
      Random rd = new Random();

      Console console = System.console();

      ArrayList<Usuario> usersVector = new ArrayList();

      ArrayList<Jogo> gamesVector = new ArrayList();

      System.out.println("\n \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \nBem-vindo ao GRamers, o maior portal de avaliações de jogos da América Latina! (aqueles que sonham alto)\n");

      System.out.println("Para começarmos, escolha uma opção:\n - Digite 1 : Cadastre-se\n - Digite 2: Login\n - Digite -1: Sair da Aplicação\n");

      String opt = console.readLine();

      while (!Main.isNumeric(opt)) {
        System.out.println("\nPreciso de uma opção válida! Tente de novo:");
        opt = console.readLine();
      }
      
//      byte optInt = (byte) Integer.parseInt(opt);

      do {
        switch(opt) {
          case "1":
            Usuario user = new Usuario("", 0, "", "");

            System.out.println("\nEu sou a IAdriana, sua guia pelo mundo dos games (e das críticas amadoras). \nPrimeiro, informe o seu nome de usuário:\n");

            user.nameOrNick = console.readLine();

            System.out.println("\nOlá, " + user.nameOrNick + "! Agora, informe a sua idade, por favor:\n");

            String idade = console.readLine();

            user.age = Integer.parseInt(idade);

            // Funciona: boolean ageVer = (idadeInt >= 18);, mas quis usar o operador ternário:
            boolean ageVer = (user.age >= 18 && user.age <= 150) ? true : false;

            if (ageVer)
              {
                System.out.println("\n"+user.nameOrNick+", me diga: qual é o seu tipo de jogo favorito?\n");

                user.faveGenre = console.readLine();

                System.out.println("\nQue insano!! Eu, particularmente, prefiro RPGs de mundo aberto com personagens que evoluem conforme o avanço da história. Se houver muitas armas e veículos no jogo, melhor ainda!");

                System.out.println("\nPor fim, você poderia conferir suas informações?");

                System.out.println("- Você é "+user.nameOrNick+", de "+user.age+" anos, e adora games de " +user.faveGenre+"!\n Digite 1 para confirmar e qualquer outro número para rejeitar: (sua idade não pode ser alterada) ");

                String ansVer = console.readLine();
                byte ansVerInt = (byte) Integer.parseInt(ansVer);
                
                while (ansVerInt!=1) {
                    System.out.println("\nTudo bem, informe seu nome novamente: ");
                    user.nameOrNick = console.readLine();
                    System.out.println("\nAgora seu(s) gênero(s) favorito(s) de games");
                    user.faveGenre =  console.readLine();

                    System.out.println("\nVocê poderia conferir suas informações, mais uma vez?");

                    System.out.println("\n- Você é "+user.nameOrNick+", de "+user.age+" anos, e adora games de " +user.faveGenre+"!\n Digite 1 para confirmar e qualquer outro número para rejeitar: (sua idade não pode ser alterada) ");

                    ansVer = console.readLine();
                    ansVerInt = (byte) Integer.parseInt(ansVer);
                }
                System.out.println("\nÚltima coisinha: sua senha!");
                String password = console.readLine();

                System.out.println("\nSó pra confirmar, sua senha novamente:");
                String passwordConfirm = console.readLine();

                while (!password.equalsIgnoreCase(passwordConfirm)) {
                  System.out.println("\nOpa! As senhas não coincidem! Informe sua senha novamente:");
                  password = console.readLine();

                  System.out.println("\nPara confirmar, sua senha uma última vez:");
                  passwordConfirm = console.readLine();
                }

                user.password = password;

                usersVector.add(user);
                
                Main.pinGame(gamesVector);

                Main.gameOptions(gamesVector, user);
              }
            
            else if (user.age <= 5 && user.age >=0) {
              System.out.println("\n");
              throw new Exception("Erro de permissão - Você não possui autorização para acessar esse website!");
            }
            
            else if (user.age < 0 || user.age > 150) {
              System.out.println("\nImpossível!");
              throw new Exception("Erro nas credenciais - BROKEN - BIP, BIP, BIP... - REPAIR NOW, BIP...");
            }
            
            else {
              int wait = (18 - user.age);
              System.out.println("\nQue pena, "+user.nameOrNick+". Você precisa ser maior de idade para acessar o portal. :( \nEspere só mais "+wait+" anos ou acesse o site acompanhado de um responsável maior de idade.");
            }

          break;
        
          case "2":
            System.out.println("Já realizou cadastro aqui? Então, bem-vindo(a)(e) de volta!\nInforme seu endereço de login:");
            
            String enderecoLog = console.readLine();
            String msg1 = "\nSeu endereço de login é %s\n";

            System.out.println(String.format(msg1, enderecoLog));
            
            System.out.println("Agora, sua senha:");
            String senhaLog = console.readLine();
            String msg2 = "\nA sua senha cadastrada é %s\n";

            System.out.println(String.format(msg2, senhaLog));

            System.out.println("Autenticando...");

            // Buscar por usuário na lista de users
            
            boolean verif = false;

            for (Usuario userItem : usersVector) {
              if (userItem.nameOrNick.equals(enderecoLog) && (userItem.password.equals(senhaLog))) {
                System.out.println("\nLogin realizado - Você entrou!\nAguarde...");

                Main.pinGame(gamesVector);

                Main.gameOptions(gamesVector, userItem);

                verif = true;
              }
            }
            
            if (!verif) {
              System.out.println("\nDesculpe. Seus dados não batem com nossos registros\n");

              throw new Exception("Erro de Autenticação - BROKEN - BIP, BIP, BIP... - REPAIR NOW, BIP... SERVER BROKEN, BIP, BIP");
            }

          break;
          
          case "-1":
            System.out.println("byebye!");
            System.exit(0);

          default:
          // Ainda dá erro: throw new RangeException("Não é um dos valores disponíveis");
          System.out.println("OutOfRangeException - Não é um dos valores disponíveis :< Tente novamente");
        }
        
        System.out.println("\nMais uma vez, informe uma opção:\n - Digite 1 : Cadastre-se\n - Digite 2: Login\n - Digite -1: Sair da Aplicação\n");

        opt = console.readLine();

        while (!Main.isNumeric(opt)) {
          System.out.println("\nPreciso de uma opção válida! Tente de novo:");
          opt = console.readLine();
        }
        
//        optInt = (byte) Integer.parseInt(opt);
      } while (opt!="-1");

      System.out.println("byebye!");
    
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}