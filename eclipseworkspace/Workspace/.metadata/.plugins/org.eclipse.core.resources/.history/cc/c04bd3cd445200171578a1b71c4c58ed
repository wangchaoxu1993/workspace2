package com.wang.priactice;

public class Echashu {

	public static void main(String[] args) {
		Node root = makeupTree();
		traverse(root);
	}

	private static void traverse(Node node) {
		if (node == null) {
			return;
		}
		traverse(node.left);
		System.out.println(node.value);
		traverse(node.right);
	}

	private static Node makeupTree() {
		Node root = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node11 = new Node(11);
		Node node12 = new Node(12);
		Node node21 = new Node(21);
		Node node22 = new Node(22);

		root.left = node1;
		root.right = node2;

		node1.left = node11;
		node1.right = node12;

		node2.left = node21;
		node2.right = node22;
		return root;
	}

	public static class Node {
		public Node left;
		public Node right;
		public int value;

		public Node(int value) {
			this.value = value;
		}
	}
}

