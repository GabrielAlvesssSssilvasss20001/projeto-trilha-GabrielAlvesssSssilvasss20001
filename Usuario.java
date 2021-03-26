// classe Usuario:

public class Usuario {
  private String nameOrNick;
  private int age;
  private String faveGenre;
  private String password;

  Usuario () {}

  Usuario(String nameOrNick, int age, String faveGenre, String password) {
    this.nameOrNick = nameOrNick;
    this.age = age;
    this.faveGenre = faveGenre;
    this.password = password;    
  }

  public String getNameOrNick() {
    return this.nameOrNick;
  }

  public int getAge() {
    return age;
  }

  public String getFaveGenre() {
    return this.faveGenre;
  }

  public String getPassword() {
    return this.password;
  }

  public void setNameOrNick(String nameOrNick) {
    this.nameOrNick = nameOrNick;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGenre(String faveGenre) {
    this.faveGenre = faveGenre;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}