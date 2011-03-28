import java.rmi.*;

class ChatSend
{
	public static void main(String[] args)
	{
		ServerInterface x;

		try {
			x = (ServerInterface) Naming.lookup("rmi://localhost/ChatServer");
			//ler autor (quem é vc?)
			//for(;;)
			//{
				//ler mensagem do teclado
				Message msg;
				msg = new Message("ASP",args[0]);
				x.send(msg);
				//if (msg.getContent()=="Exit"){
				//	break;
				//}
			//}

		} 

		catch(Exception e) { 
			System.out.println(e);
		}
	}
}