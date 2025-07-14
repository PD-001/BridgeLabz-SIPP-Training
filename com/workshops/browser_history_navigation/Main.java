package com.workshops.browser_history_navigation;

public class Main {
	public static void main(String[] args) {
		Navigation nav=new Navigation();
		nav.newPage("googleclassroom.com");
		nav.newPage("github.com");
		nav.newPage("leetcode.com");
		System.out.println(nav.backward());
		System.out.println(nav.forward());
		System.out.println(nav.backward());
		System.out.println(nav.backward());
	}
}
