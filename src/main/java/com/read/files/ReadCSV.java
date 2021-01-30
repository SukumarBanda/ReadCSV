package com.read.files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ReadCSV {

	public static void main(String[] args) throws FileNotFoundException {
		int i;

		HashMap<String, Integer> obj = new HashMap<String, Integer>();

		File file = new File("/home//mallari/Match.csv");
		Scanner scan = new Scanner(file);

		while (scan.hasNext()) {

			String s = scan.nextLine();
			String[] str = s.split(",");

			if (obj.containsKey(str[1])) {
				obj.put(str[1], obj.get(str[1]) + Integer.parseInt(str[2]));
			} else {
				obj.put(str[1], Integer.parseInt(str[2]));
			}
		}
		
        Iterator hmIterator = obj.entrySet().iterator(); 
        
        while (hmIterator.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            System.out.println(mapElement);
        } 
	}
}
