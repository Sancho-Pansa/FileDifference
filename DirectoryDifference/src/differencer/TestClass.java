package differencer;

import java.io.File;
import java.util.*;

public class TestClass {
	
	public static Set<String> files = new HashSet<String>();
	public static int parentBias;

	public static void main(String[] args) {
		File f = new File("M:\\Music\\All Evangelion OSTs\\Rebuild of Evangelion 2.22 You Can [Not] Advance");
		Differencer a = new Differencer();
		Set<String> s = a.getAllSubFiles(f);
		ArrayList<String> list = new ArrayList<>();
		s.forEach(list::add);
		list.sort(String.CASE_INSENSITIVE_ORDER);
		for(String x: list)
			System.out.println(x);
		
		
		/*System.out.println(f.exists());
		parentBias = f.getAbsolutePath().length();
		recursivePrint(f);
		for(String x: files)
			System.out.println(x);*/
	}
	
	public static void recursivePrint(File f) {
		files.add(f.getAbsolutePath().substring(parentBias));
		if(f.isDirectory())
		{
			for(File x: f.listFiles())
				recursivePrint(x);
		}
	}
}
