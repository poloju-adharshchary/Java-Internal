package Q13;
import java.io.*;
public class fileslist {
	public static void list(File f) {
		File[] a=f.listFiles();
		for(File x:a) {
			if(x.isFile()) {
				System.out.println(x.getAbsolutePath());
			} else if(x.isDirectory()) {
				list(x);
			}
		}
	}

	public static void main(String[] args) {
		File f=new File("D:\\exm");
		list(f);

	}

}
