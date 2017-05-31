package pl.sda.serwerTCPFinal;

public class Main {

	public static void main(String[] args) {

		
		ServerTCP server8080 = new ServerTCP("serwer 8080", 8080);

		
		server8080.start();

	}

}
