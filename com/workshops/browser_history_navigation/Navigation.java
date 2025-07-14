package com.workshops.browser_history_navigation;

abstract class Nav{
	public abstract String forward();
	public abstract String backward();
}

class Node{
	private Node next,prev;
	private String url;
	public Node(String url) {
		this.url=url;
	}
	public String getUrl() {
		return url;
	}
	public void setprev(Node prev) {
		this.prev=prev;
	}
	public Node getnext() {
		return next;
	}
	public void setnext(Node next) {
		this.next=next;
	}
	public Node getprev() {
		return prev;
	}
	
}

public class Navigation extends Nav{
	private Node curr;
//	private Node head;

	public void newPage(String url) {
		Node newNode=new Node(url);
		if(curr!=null) {
			curr.setnext(newNode);
			newNode.setprev(curr);
		}
		curr=newNode;
	}
	@Override
	public String forward() {
		if(curr.getnext()==null) return "Currently on the latest page.";
		curr=curr.getnext();
		return curr.getUrl();
	}

	@Override
	public String backward() {
		if(curr.getprev()==null) return "Currently on first page.";
		curr=curr.getprev();
		return curr.getUrl();
	}
	
}
