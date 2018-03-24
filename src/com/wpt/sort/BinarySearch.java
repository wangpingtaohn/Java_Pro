package com.wpt.sort;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrs = {1,5,8,13,210,334};
		System.out.println(binarySearch(arrs,334));

	}
	
	private static int binarySearch(int[] arr, int key){
		if (arr == null || arr.length == 0) {
			return -1;
		}
		int mid;
		int start = 0;
		int end = arr.length;
		while(start < end) {
			mid = (start + end) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		
		return -1;
	}

}
