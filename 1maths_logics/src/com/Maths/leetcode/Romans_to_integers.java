package com.Maths.leetcode;
public class Romans_to_integers {
	
	public static void main(String ...strings )
	{String s ="mi";
		System.out.println(romanToInt(s));
	}

	public static  int romanToInt(String s) 
	{
	  int result = 0; int value1; int value2;
	        for (int i = 0; i < s.length(); i++) {
	            //switch start
	        	int v1 = switch (s.charAt(i)) {
	                case 'I' -> 1;
	                case 'V' -> 5;
	                case 'X' -> 10;
	                case 'L' -> 50;
	                case 'C' -> 100;
	                case 'D' -> 500;
	                case 'M' -> 1000;
	                default -> 0;
	            }; //switch end
	            
	            
	            
	            if (i + 1 < s.length()) { //if1 start
	                int v2 = switch (s.charAt(i+1)) {//switch start
	                    case 'I' -> 1;
	                    case 'V' -> 5;
	                    case 'X' -> 10;
	                    case 'L' -> 50;
	                    case 'C' -> 100;
	                    case 'D' -> 500;
	                    case 'M' -> 1000;
	                    default -> 0;
	                };//switch end 
	                if (v2 > v1) {//if start
	                    result += v2 - v1;
	                    i += 1;
	                }
	                else {
	                    result += v1;
	                }//else end

	            }//if1 end
	            else {
	                result += v1;
	            }
	        }
	        return result;
	    }
	}

