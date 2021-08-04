package c28;

import java.net.Socket;

public class MainClient {
  public static void main(String[] args) {

    Socket socket = null;

    try {

      socket = new Socket("localhost", 9000);
      System.out.println("--- 서버 연결 ---");
      System.out.println("socket: " + socket);

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (socket != null)
          socket.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

  }
}
