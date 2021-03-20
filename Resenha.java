// classe Resenha:

public class Resenha {
  public Usuario orgOrEvaluator;
  public double grade;
  public String evaluation;


  Resenha(Usuario orgOrEvaluator, double grade, String evaluation) {
    this.orgOrEvaluator = orgOrEvaluator;
    this.grade = grade;
    this.evaluation = evaluation;
  }
}