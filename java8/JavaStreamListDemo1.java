package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamListDemo1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Dubai");
		list.add("Sharjah");
		list.add("Fujairah");
		list.add("Dubai");
		list.add("Abudabi");
		list.add("");
		list.add("Sharjah");
		list.add("RAK");
		list.add("UmalQ");
		list.add(null);
		
		//list.stream().distinct().forEach(i ->System.out.println(i));
		//list.stream().filter(i ->i!="").forEach(i->System.out.println(i));
		//list.stream().filter(i ->i!=null).filter(i ->i!="").forEach(i->System.out.println(i));
		//list.stream().filter(i ->i!=null).filter(i ->i!="").distinct().forEach(i->System.out.println(i));
		list.stream().filter(i ->i!=null).filter(i ->i!="").distinct().sorted().forEach(i->System.out.println(i));
		//List<String> lst = list.stream().filter(i -> i!="").filter(i ->i!=null).distinct().map(i ->i.toUpperCase()).collect(Collectors.toList());
		//System.out.println(lst);
		//List<String> abc =list.stream().filter(i ->i!=null).filter(i ->i!="").distinct().collect(Collectors.toList());
		//System.out.println(abc);
		
		
	}

}
