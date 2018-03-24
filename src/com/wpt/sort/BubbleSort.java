package com.wpt.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrs = {1,6,5,8,3,10,4};
		System.out.println("排序之前:");
		for(int i:arrs){
			System.out.print(i + ",");
		}
		System.out.println("===============");
		bubbleSort(arrs);
		System.out.println("排序之后:");
		for(int i:arrs){
			System.out.print(i + ",");
		}

	}
	
	public static void bubbleSort(int[] arrs){
		if (arrs == null || arrs.length == 0) {
			return;
		}
		for (int i = 0; i < arrs.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arrs.length - 1; j++) {
				if (arrs[j] < arrs[j + 1]) {
					int temp = arrs[j];
					arrs[j] = arrs[j + 1];
					arrs[j + 1] = temp;
					flag = false;
				}
				System.out.print("第" + i + "—" + j + "轮结果为：");
				for(int k:arrs){
					System.out.print(k + ",");
				}
				System.out.println("");
			}
			if (flag) {
				break;
			}
		}
	}

}
