package java_study.chapter19.echo3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		Socket socket = null;
		try (ServerSocket serverSocket = new ServerSocket(10000);) {
			System.out.println("서버 가동됨");
			System.out.println("클라이언트 접속 대기중");

			while (true) {
				socket = serverSocket.accept(); // 접속대기
				System.out.println("클라이언트 접속 성공");

				// 수신용 Reader 만들기
				BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// 전송용 Writer 만들기
				PrintWriter w = new PrintWriter(socket.getOutputStream());

				// 메시지 수신
				String line = r.readLine();
				System.out.println("서버 수신 메시지 : " + line);

				// 메시지 전송
				w.println(line);
				w.flush();
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
