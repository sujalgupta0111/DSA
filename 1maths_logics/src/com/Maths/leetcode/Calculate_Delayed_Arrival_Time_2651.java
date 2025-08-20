package com.Maths.leetcode;

public class Calculate_Delayed_Arrival_Time_2651 {
public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
	if(24>arrivalTime+delayedTime)
		return arrivalTime+delayedTime;
	else
		return (arrivalTime+delayedTime)%24;
        
    }

	public static void main(String[] args) {
		
System.out.println(findDelayedArrivalTime(13,11));
	}

}
