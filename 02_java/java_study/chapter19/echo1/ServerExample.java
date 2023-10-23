package java_study.chapter19.echo1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		Socket socket = null;
		try (ServerSocket serverSocket = new ServerSocket(10000);) {
			System.out.println("서버 가동됨");
			System.out.println("클라이언트 접속 대기중");

			socket = serverSocket.accept(); // 접속대기

			// 수신(입력) 대기
			InputStream in = socket.getInputStream(); // 수신(입력) 스트림

			// 전송(출력) 대기
			OutputStream out = socket.getOutputStream(); // 전송(출력) 스트림

			byte arr[] = new byte[100]; // 수신 버퍼
			int size = in.read(arr); // 메시지 수신
			System.out.println("메시지 수신: ");
			System.out.println(new String(arr, 0, size));

			String str = "Hello, Client";
			out.write(str.getBytes());
			out.flush();
			System.out.println("메시지 전송: " + str);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
