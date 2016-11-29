import java.io.*;

public class CopyByteFile2{
	public static void main(String[] args) {
		//変数。データを準備する
		FileInputStream in = null; 
		FileOutputStream out = null;

		//ストリーム処理
		//	1byteずつ読んで、書く
		try{
			//ストリームをつくる
			in = new FileInputStream("harinezumi.jpg");
			out = new FileOutputStream("kekka.jpg");
			//データを読み書きする
			int d;
			
			while((d = in.read()) != -1){
				out.write(d);
		
				//System.out.println(d);	
			}
			
			System.out.println("ファイルコピーおわり");

		}catch(IOException e){
			System.out.println("IOえらーです");
		}finally{
			try{
				in.close();
				out.close();
			} catch(IOException e){
				System.out.println("IOえらー");
			}
			//ストリームを閉じる
		}
	}
}