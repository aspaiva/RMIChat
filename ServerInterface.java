import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote {
	public void send(Message msg) throws RemoteException;
	public Message receive(int num) throws RemoteException;
}
