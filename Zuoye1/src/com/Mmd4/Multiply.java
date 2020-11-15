package com.Mmd4;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		//Test01();
		//Test02();
	Test03();
	
	}
	/////////////单列乘法表//////////////////////////
	private static void Test01(){
		int i,j;
		int MaxNum;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		MaxNum=sc.nextInt();
		System.out.println("数"+MaxNum+"的乘法表为:");
		for(i=0,j=MaxNum;i<MaxNum;i++,j--){
			
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	////////////////完整乘法表////////////////////////////
	private static void Test02(){
		int i,j;
		for(i=1;i<=9;i++){
			for(j=1;j<i+1;j++){
				System.out.print(i+"*"+j+"="+i*j+"  "  );
			}
			System.out.println();;
		}	
	}
	/////////////等腰三角形////////////////////////////////
	private static void Test03(){
		int i,j;
		int MaxNum;
		Scanner sc=new Scanner(System.in);
		MaxNum=sc.nextInt();
		for(i=0;i<MaxNum;i++){
			for(j=0;j<MaxNum-i-1;j++){
				System.out.print(" ");
			}
			for(j=0;j<2*i+1;j++){
				System.out.print("*");
			}
		System.out.println();
			}
	
		}
//////////////////空心等腰三角形///////////////////////
	
	}

