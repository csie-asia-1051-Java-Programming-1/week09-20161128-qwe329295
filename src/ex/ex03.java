package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021028 蕭佑誠
 */

import java.util.*;
public class ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n =scn.nextInt();
		fun(n);
	}
	public static void fun( int j){
		int k=j/2,count =0;
		for(int i =1;i<=k;i++){
			if(j %i ==0){
				System.out.println(i);
				count ++;
			}
		}
		if(count ==1){
			System.out.println("是");
		}else{
			System.out.println("否");
		}
	

	}

}
