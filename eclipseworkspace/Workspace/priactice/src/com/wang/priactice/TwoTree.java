package com.wang.priactice;


public class TwoTree {
	public static void main(String[] args) {
		Node parent = new Node(0);
		int[] array = { 5, 2, 7, 3, 1, 4, 6 };
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < i; j++){
				if(array[i] < array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		Node node1 = new Node(array[0]);
		Node node2 = new Node(array[1]);
		Node node3 = new Node(array[2]);
		Node node4 = new Node(array[3]);
		Node node5 = new Node(array[4]);
		Node node6 = new Node(array[5]);
		
		parent.left = node1;
		parent.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		
		System.out.println(parent);
	}

	public static class Node{
		public Node left;
		public Node right;
		public int value;
		
		public Node(int value){
			super();
			this.value = value;
		}
		
		public Node(){
			super();
		}

		@Override
		public String toString() {
			return "Node [left=" + left + ", right=" + right + ", value=" + value + "]";
		}
		
		
	}
}
