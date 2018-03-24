package com.wpt.sort;

public class SelSort {

	/*选择排序的基本思想：给定数组：int[] arr={里面n个数据}；
	第1趟排序，在待排序数据arr[1]~arr[n]中选出最小的数据，将它与arrr[1]交换；
	第2趟，在待排序数据arr[2]~arr[n]中选出最小的数据，将它与r[2]交换；
	以此类推，第i趟在待排序数据arr[i]~arr[n]中选出最小的数据，将它与r[i]交换，直到全部排序完成。*/
	
	private static void selSort(int[] arrs){
		if (arrs == null || arrs.length == 0) {
			return;
		}
		for (int i = 0; i < arrs.length; i++) {
			int min = i;
			for (int j = i + 1; j < arrs.length; j++) {
				if (arrs[min] > arrs[j]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arrs[min];
				arrs[min] = arrs[i];
				arrs[i] = temp;
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrs = {1,6,5,8,3,10,4};
		System.out.println("排序之前:");
		for(int i:arrs){
			System.out.print(i + ",");
		}
		System.out.println("===============");
		selSort(arrs);
		System.out.println("排序之后:");
		for(int i:arrs){
			System.out.print(i + ",");
		}
	}
	

}
