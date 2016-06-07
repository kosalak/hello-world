	package com.hello.now;
	
	import java.math.BigInteger;
	import java.util.Scanner;
	
	public class HELLO {
		
		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        
	        System.out.println(countP(arr));
	        System.out.println(countN(arr));
	        System.out.println(countZ(arr));
	    }
		
		private static float countP(int[] arr){
			int count=0;
			for(int num:arr){
				
				if(num>0) count++;
				
			}
			return (count/(float)arr.length);
		}
		private static float countN(int[] arr){
			int count=0;
			for(int num:arr){
				
				if(num<0) count++;
				
			}
			return (count/(float)arr.length);
		}
		private static float countZ(int[] arr){
			int count=0;
			for(int num:arr){
				
				if(num==0) count++;
				
			}
			return (count/(float)arr.length);
		}
		private static BigInteger  addup(BigInteger [] arr  ) {
			
			BigInteger  num=new BigInteger ("0");
			for(int i=0; i<arr.length; i++){
				num=num.add(arr[i]);
				
			}		
			return num;
		}
	
	}
