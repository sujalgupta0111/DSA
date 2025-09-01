
package com.Maths;
class AA {
    static b instance = new b(); // Create an instance of class b
    
    static class b { // Make class b static if you want it to be accessible without an instance of AA
    	static  int  a = 10;
        static void display()
        {
        	System.out.println(a); 
        }
    }
}

public class testing {
    public static void main(String[] args) {
        // Accessing the static instance of class b
        AA.b.display(); // Output: 10
    }
}
