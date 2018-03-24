package com.wpt.link.single;

public class Link {

	public Node header = null;
	public Node tail = null;
	public int size;
	
	public int length(){
		return size;
	}
	
	public Node getNode(int index){
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		Node current = header;
		for(int i = 0;i < size && current != null;i++,current = current.next){
			if (i == index) {
				return current;
			}
		}
		return null;
	}
	
	public void delNode(int index){
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		Node del = null;
		for(int i = 0;i < size;i++){
			if (i == 0) {
				del = header;
				header = header.next;
			} else {
				Node preNode = getNode(index - 1);
				del = preNode.next;
				preNode.next = del.next;
				del.next = null;
			}
			size--;
		}
	}
	
	public void addNode(Node node){
		if (header == null) {
			header = node;
			tail = header;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}
	
	public void insertNode(Node node,int index){
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		if (header == null) {
			header = node;
		} else {
			Node preNode = getNode(index - 1);
			node.next = preNode.next;
			preNode.next = node;
		}
		size++;
	}
}
