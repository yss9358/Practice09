package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	// Friend 객체를 생성하고 Friend 객체 배열에 저장
    	
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Friend> fArray = new ArrayList<Friend>();
    	
    	Friend f01 = new Friend();
    	Friend f02 = new Friend();
    	Friend f03 = new Friend();
    	
    	fArray.add(f01);
    	fArray.add(f02);
    	fArray.add(f03);
    
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	for (int i=0; i<3; i++) {
    		
    		fArray.set(i, new Friend(sc.next(), sc.next(), sc.next()));
    		/*
    		fArray.get(i).setName(sc.next() + " ");
    	    fArray.get(i).setHp(sc.nextLine() + " ");
    	    fArray.get(i).setSchool(sc.nextLine() + " ");
    		 */
    		   			 
    	}
    	
    	
    	sc.close();
    	
    }

}
