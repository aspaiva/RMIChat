
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

@SuppressWarnings("serial")
public class Server extends UnicastRemoteObject implements ServerInterface {

	Hashtable<Integer,Message> buffer;
	int msgCount;
	
	public Server() throws RemoteException
	{
		buffer = new Hashtable<Integer, Message>();
		msgCount = 0;
		System.out.println("Servidor inicializado!");
	}
	@Override
	public synchronized Message receive(int num) throws RemoteException {
		Message msg;
		msg = buffer.get(new Integer(num));
		return msg;
	}

	@Override
	public synchronized void send(Message msg) throws RemoteException {
		msgCount++;
		buffer.put(new Integer(msgCount),msg);
		System.out.println(" DE:"+msg.getAuthor()+"\nMSG:"+msg.getContent()+"\n");
	}
}
