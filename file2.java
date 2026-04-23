import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
public class file2
{
	public static void main(String[] args)throws IOException
	{
		FileInputStream source=new FileInputStream("Source.txt");
		FileOutputStream dodd=new FileOutputStream("odd.txt");
		FileOutputStream deven=new FileOutputStream("even.txt");
		int i;
		while((i=source.read())!=-1)
		{
			if(i%2==0)
			{
				deven.write(i);
			}
			else
			{
				dodd.write(i);
			}
		}
		System.out.println("copied");
		source.close();
		deven.close();
		dodd.close();
	}
}
