// classe Jogo:

public class Jogo {
  private String title;
  private int year;
  private String organization;
  private double externalGrade;
  private String urlExternalGrade;
  private String description;
  private String publisher;
  private String studioDeveloper;
  private Resenha review;

  Jogo () {
    
  }

  Jogo(String title, int year, String organization, double externalGrade, String urlExternalGrade, String description, String publisher, String studioDeveloper, Resenha review) {
    this.title = title;
    this.year = year;
    this.organization = organization;
    this.externalGrade = externalGrade;
    this.urlExternalGrade = urlExternalGrade;
    this.description = description;
    this.publisher = publisher;
    this.studioDeveloper = studioDeveloper;
    this.review = review;
  }

  public Resenha getReview() {
    return this.review;
  }

  public String getStudioDeveloper() {
    return this.studioDeveloper;
  }

  public String getPublisher() {
    return this.publisher;
  }

  public String getDescription() {
    return this.description;
  }

  public String getUrlExternalGrade() {
    return this.urlExternalGrade;
  }

  public double getExternalGrade() {
    return this.externalGrade;
  }

  public String getOrganization() {
    return this.organization;
  }

  public int getYear() {
    return this.year;
  }

  public String getTitle() {
    return this.title;
  }

  public void setReview(Resenha review){
    this.review = review;
  }

  public void setStudioDeveloper(String studioDeveloper){
    this.studioDeveloper = studioDeveloper;
  }

  public void setPublihser(String publisher){
    this.publisher = publisher;
  }

  public void setDescription(String description){
    this.description = description;
  }

  public void setUrlExternalGrade(String urlExternalGrade){
    this.urlExternalGrade = urlExternalGrade;
  }

  public void setExternalGrade(double externalGrade) {
    this.externalGrade = externalGrade;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setTitle(String title) {
    this.title = title;
  }
  
}