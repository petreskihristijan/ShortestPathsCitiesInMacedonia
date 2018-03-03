package shortestpathscitiesinmacedonia;

import java.io.*;
import java.util.*;

/**
 * A class that contains the hash maps of the cities used 
 * as a symbol table
 * @author Hristijan Petreski
 *
 */
public class CityHashMap {
	HashMap<Integer,String> normalMap;
	HashMap<String,Integer> reverseMap;
	
	public CityHashMap(){
		File file = new File("src\\main\\resources\\cities.txt");
		normalMap = new HashMap<>();
		reverseMap = new HashMap<>();
		try(Scanner in = new Scanner(file)){
			int count = 0;
			String city = "";
			while(in.hasNext()) {
				city = in.next();
				normalMap.put(count, city);
				reverseMap.put(city, count);
				count++;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getCity(int position) {
		return normalMap.get(position);
	}
	
	public int getPosition(String cityName) {
		return reverseMap.get(cityName);
	}
}
