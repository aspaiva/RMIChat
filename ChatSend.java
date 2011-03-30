import java.rmi.RemoteException;
import java.rmi.Naming;

class ChatSend
{
    public static void main(String[] args)
	{
		ServerInterface serverInterface = null;
		LeitorTeclado leitorTeclado = new LeitorTeclado();

		try {
		serverInterface = (ServerInterface) Naming.lookup("rmi://localhost/ChatServer");
		} catch(Exception e ) { System.out.print(e.getMessage()); }

		System.out.println("Digite seu nome: ");
		String autor = leitorTeclado.leString();
		for(int i=0;i>-1;i++)
		{
		    System.out.print("Digite sua mensagem: ");
		    String corpo_mensagem = leitorTeclado.leString();
			Message msg = new Message(autor,corpo_mensagem);
			try {
			serverInterface.send(msg);
			} catch(RemoteException e) { System.out.println(e.getMessage());}
			if (msg.getContent().equals("tchau"))
			{
			    break;
			}
		}
	}
}

