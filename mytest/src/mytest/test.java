package mytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test {
	public static void main(String[] args) {
		//list
		List l=new ArrayList();
	l.add(1);l.add(4);l.add(4);
	System.out.println(l.toString());
	//array
	int[] a= {1,1,1,2,23,4};
	System.out.println(Arrays.toString(a));
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
	}
	//Êý×éÅÅÐò
/*	Arrays.sort(a, new Comparator() {
		
	});*/
	
	Comparator c;
	
	
	
	
	}
}
