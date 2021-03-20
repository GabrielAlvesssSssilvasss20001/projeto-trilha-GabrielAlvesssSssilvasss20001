// classe Usuario:

public class Usuario {
  public String nameOrNick;
  public int age;
  public String faveGenre;
  public String password;

  Usuario(String nameOrNick, int age, String faveGenre, String password) {
    this.nameOrNick = nameOrNick;
    this.age = age;
    this.faveGenre = faveGenre;
    this.password = password;    
  }
}