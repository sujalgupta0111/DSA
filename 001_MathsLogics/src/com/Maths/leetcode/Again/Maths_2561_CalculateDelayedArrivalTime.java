package com.Maths.leetcode.Again;

public class Maths_2561_CalculateDelayedArrivalTime {
	public static  int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+ delayedTime)%24;
        
    }
	public static void main(String[] args) {
		System.out.println(findDelayedArrivalTime(38,89));

	}

}
