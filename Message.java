import java.io.Serializable;

@SuppressWarnings("serial")

public class Message implements Serializable 
{
	String author, content;
	int number;

	public Message(String author, String content)
	{
		this.author = author; this.content = content; this.number = 0;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}
}
