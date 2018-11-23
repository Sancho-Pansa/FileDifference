package differencer;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Differencer {
	
	public Differencer() {
		
	}
	
	public Set<String> findDifferenceBetween(File one, File two) {
		Set<String> difference = new HashSet<>();
		Set<String> subfilesOne = getAllSubfiles(one);
		Set<String> subfileTwo = getAllSubfiles(two);
		
		difference = subfilesOne.stream()
			.filter(subfileTwo::contains)
			.collect(Collectors.toSet());
		
		return difference;
	}
	
	public Set<String> getAllSubfiles(File f) {
		Set<String> files = new HashSet<>();
		for(File x: f.listFiles())
			recursiveJoin(x, f.toString().length(), files);
		return files;
	}
	
	private void recursiveJoin(File f, int bias, Set<String> files) {
		files.add(f.getAbsolutePath().substring(bias));
		if(f.isDirectory())
		{
			for(File x: f.listFiles())
				recursiveJoin(x, bias, files);
		}
	}
	
	public Set<String> findDifferences(String first, String second) {
		File a = new File(first);
		File b = new File(second);
		Set<String> files = new HashSet<>();
		
		return null;
	}

}
