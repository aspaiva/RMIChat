import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerInit {

	public static void main(String[] args) {
		Server server = null;
		try {
			LocateRegistry.createRegistry(1099);
			server = new Server();
			Naming.rebind("ChatServer", server);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
