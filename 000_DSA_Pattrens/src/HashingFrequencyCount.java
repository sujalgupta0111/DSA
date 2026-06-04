import java.lang.classfile.attribute.CharacterRangeTableAttribute;
import java.security.KeyStore.Entry;
import java.util.*;
public class HashingFrequencyCount {

	public Map<Character, Integer> count= new TreeMap<Character, Integer>();
	
	void main() {
		String test ="hellowprjsjfshhkak fas dh ";
		
		for(int i=0; i<test.length();i++) {
			char charater = test.charAt(i);
			if(charater==' ')
				continue;
			count.put(charater, count.getOrDefault(charater, 0)+1);
			
		}
		for (Map.Entry<Character, Integer>  e: count.entrySet()) {
			System.out.println(e.getKey() +"   "+ e.getValue());
			
		}
	}

}
