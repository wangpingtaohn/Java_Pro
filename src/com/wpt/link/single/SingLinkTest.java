package com.wpt.link.single;

public class SingLinkTest {

	public static void main(String[] args) {
		Node node3 = new Node(new Element("3"), null);
		Node node2 = new Node(new Element("2"), node3);
		Node node1 = new Node(new Element("1"), node2);
		
		Link link = new Link();
		link.addNode(node3);
		link.addNode(node2);
		link.addNode(node1);
		
		System.out.println(link.getNode(1).element.name);

	}

}
