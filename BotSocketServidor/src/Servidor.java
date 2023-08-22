import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

	public class Clientee extends Thread {
		private Socket socket;
		private BufferedReader reader;
		private BufferedWriter writer;
		private String address;
		private int port;
		private Scanner scanner;

		public Clientee(String address, int port) {
			this.socket = null;
			this.reader = null;
			this.writer = null;
			this.address = address;
			this.port = port;
			this.scanner = new Scanner(System.in);
		}
	}
		public void run() {
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
