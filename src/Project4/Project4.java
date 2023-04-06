package Project4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Project4 {
	
	
	public static void main(String[] args) {
		
		
		CountString("HELLO"); 
		
	}
	
	
	public static void CountString(String str) { 
		
		
		Map<Character,Integer> Count = new LinkedHashMap<Character,Integer>();
		
		char[] Array = str.toCharArray(); 
		
		
		for(char key:Array) { 
			
			if(Count.containsKey(key)) { 
				
				Count.put(key, Count.get(key)+1); 
				
			}
			
			else Count.put(key, 1); 
			
		}
		
		for(Map.Entry<Character, Integer> Entry : Count.entrySet()) {
			
			
			System.out.println(Entry);
			
		}
		
	}

}
