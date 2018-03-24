package com.wpt.link.single;

public class Node {

	public Element element;
	
	public Node next;
	
	public Node(Element e, Node next){
		this.element = e;
		this.next = next;
	}
	
}
