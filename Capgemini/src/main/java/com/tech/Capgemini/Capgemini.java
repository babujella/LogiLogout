package com.tech.Capgemini;

import java.util.Scanner;

import com.cg.dca.entity.Feed;

public class Capgemini{
	 public static Feed objects()
	    {
		Scanner scanner=new Scanner(System.in);
		Feed feed =new Feed();
		System.out.println("Enter ur feedId :");
		feed.setFeedId(scanner.nextInt());
		System.out.println("Enter ur Query :");
		feed.setQuery(scanner.next());
		System.out.println("Enter ur topic :");
		feed.setTopic(scanner.next());
		System.out.println("Enter ur relevane :");
		feed.setRelevance(scanner.nextInt());
		System.out.println("Enter ur total comments :");
		feed.setTotalComments(scanner.nextInt());
		return feed;
	}
}