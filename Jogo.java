// classe Jogo:

public class Jogo {
  public String title;
  public int year;
  public String organization;
  public double externalGrade;
  public String urlExternalGrade;
  public String description;
  public String publisher;
  public String studioDeveloper;
  public Resenha review;

  Jogo(String title, int year, String organization, double externalGrade, String urlExternalGrade, String description, String publisher, String studioDeveloper, Resenha review) {
    this.title = title;
    this.year = year;
    this.organization = organization;
    this.externalGrade = externalGrade;
    this.urlExternalGrade = urlExternalGrade;
    this.publisher = publisher;
    this.studioDeveloper = studioDeveloper;
    this.review = review;
  }
}