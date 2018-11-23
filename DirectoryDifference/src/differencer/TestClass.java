package differencer;

import java.io.File;
import java.util.*;

public class TestClass {
	
	public static Set<String> files = new HashSet<String>();
	public static int parentBias;

	public static void main(String[] args) {
		File f = new File("D:\\temp2");
		File f2 = new File("D:\\temp");
		Differencer dif = new Differencer();
		Set<String> set = dif.compareBetween(f, f2);
		set.forEach(System.out::println);
	}
}
