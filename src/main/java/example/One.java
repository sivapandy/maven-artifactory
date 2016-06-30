package example;

public class One {
  String message = "Welcome to Project Liberty Demo";

  public String Demo() {
    return message;
  }

  public void uncoveredMethod() {
    System.out.println(Demo());
  }
}
