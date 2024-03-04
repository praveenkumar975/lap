package com.java;

public class Multi_Dimensional_ArrayEx {

	public static void main(String[] args) {
		int [] [] matrix = {{1,2,3,4},{5,6,7,8}};
		for (int i = 0;i < matrix.length;i++){
			for (int j = 0;j < matrix[i].length;j++) {
				System.out.println(matrix[i][j]+ " ");
			}
		}
			System.out.println("array length:"+ matrix.length);
	}

}
