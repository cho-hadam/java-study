package c21;

public class MainClass {
  public static void main(String[] args) {
    // 타입 통일
    Toy robot = new ToyRobot();
    Toy airplane = new ToyAirplane();

    // 타입이 통일되어 배열에 같이 담길 수 있음
    Toy toys[] = { robot, airplane };

    for (int i = 0; i < toys.length; i++) {
      toys[i].walk();
      toys[i].run();
      toys[i].alarm();
      toys[i].light();

      System.out.println();
    }
  }
}
