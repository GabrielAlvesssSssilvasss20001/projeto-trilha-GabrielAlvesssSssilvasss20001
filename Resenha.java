// classe Resenha:

public class Resenha {
  private Usuario orgOrEvaluator;
  private double grade;
  private String evaluation;

  Resenha () {}

  Resenha(Usuario orgOrEvaluator, double grade, String evaluation) {
    this.orgOrEvaluator = orgOrEvaluator;
    this.grade = grade;
    this.evaluation = evaluation;
  }

  public Usuario getUser() {
    return this.orgOrEvaluator;
  }

  public double getGrade(){
    return this.grade;
  }

  public String getEvaluation(){
    return this.evaluation;
  }

  public void setOrgEv(Usuario orgOrEvaluator) {
    this.orgOrEvaluator = orgOrEvaluator;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  public void setEvaluation(String evaluation) {
    this.evaluation = evaluation;
  }


}