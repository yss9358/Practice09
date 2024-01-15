package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in); 
    	List<Goods> gArray = new ArrayList<Goods>();
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	for (int i=0; i<gArray.size(); i++) {
    		
    		gArray.set(i, new Goods( sc.next(),sc.nextInt(),sc.nextInt()));
    		
    		if(sc.next().equals("q")) {
    			System.out.println("[입력완료]");
    			System.out.println("============================");
    	    	
    			break;
    		}
    	}
    	
    	
    	
    	sc.close();
       
    }

}
