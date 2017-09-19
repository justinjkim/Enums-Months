package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Please enter a month, e.g., January:");
        Scanner input = new Scanner(System.in);

        ArrayList<Month> followingMonths = new ArrayList<>();
        String month = input.nextLine();

        switch(month) {
            case "January":
                followingMonths.add(Month.JANUARY);
            case "February":
                followingMonths.add(Month.FEBRUARY);
            case "March":
                followingMonths.add(Month.MARCH);
            case "April":
                followingMonths.add(Month.APRIL);
            case "May":
                followingMonths.add(Month.MAY);
            case "June":
                followingMonths.add(Month.JUNE);
            case "July":
                followingMonths.add(Month.JULY);
            case "August":
                followingMonths.add(Month.AUGUST);
            case "September":
                followingMonths.add(Month.SEPTEMBER);
            case "October":
                followingMonths.add(Month.OCTOBER);
            case "November":
                followingMonths.add(Month.NOVEMBER);
            case "December":
                followingMonths.add(Month.DECEMBER);
                break;
            default:
                System.out.println("Hmm, that was not an expected input. Please try again:");
                month = input.nextLine();
        }

        System.out.println("You have selected " + month + ". Here are the following months after that: ");
        for (Month mon: followingMonths) {
            System.out.println(mon);
        }



    }
}
