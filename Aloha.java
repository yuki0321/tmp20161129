// alohaと２０回
//
import java.io.*;
public class Aloha{
	public static void main(String[] args){
		try{
			File f = new File("aloha.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.println(args[0]+"san aloha");

		pw.close();

		} catch (IOException e ){
			System.out.println("era");
			e.printStackTrace();
		}
	}
}
