import java.rmi.RemoteException;
import java.rmi.Naming;
import java.lang.InterruptedException;

class ChatReceive
{
	public static void main(String[] args)
	{
		int ultima=1;
    	ServerInterface serverInterface = null;

		try {
		serverInterface = (ServerInterface) Naming.lookup("rmi://localhost/ChatServer");
		} catch(Exception e) {
		System.out.println(e.getMessage());
		}


		for(int i=0;i>-1;i++)
		{
		    Message msg = null;
		    try {
			msg = serverInterface.receive(ultima);
			} catch (RemoteException e) {
		    System.out.println(e.getMessage());
		    }
			if(msg!=null)
			{
				System.out.println(" DE:"+msg.getAuthor()+"\nMSG:"+msg.getContent()+"\n");				
				ultima++;
			}
			try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
		    System.out.println(e.getMessage());
		    }

		}
	}
}

