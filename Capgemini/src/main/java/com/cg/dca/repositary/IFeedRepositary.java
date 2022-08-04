package com.cg.dca.repositary;

import java.util.List;

import com.cg.dca.entity.Feed;
import com.cg.dca.exception.UnkownDevoloperException;
import com.cg.dca.exception.UnkownFeedException;

public interface IFeedRepositary {
	Feed saveFeed(Feed feed);

	Feed updateFeed(Feed feed);

	Feed likeFeed(int feedId) throws UnkownFeedException;

	Feed fetchFeed(int feedId) throws UnkownFeedException;

	Feed deleteFeed(int feedId) throws UnkownFeedException;

	List<Feed> fetchFeedsByDeveloper(int devId) throws UnkownDevoloperException;

	List<Feed> fetchFeedsByKeyword(String keyword);

	List<Feed> fetchFeedsByTopic(String topic);
}

class SubIFeedRepositary implements IFeedRepositary{

	public Feed saveFeed(Feed feed) {
		
		return null;
	}

	public Feed updateFeed(Feed feed) {
		
		return null;
	}

	public Feed likeFeed(int feedId) throws UnkownFeedException {
		return null;
	}

	public Feed fetchFeed(int feedId) throws UnkownFeedException {
		return null;
	}

	public Feed deleteFeed(int feedId) throws UnkownFeedException {
		return null;
	}

	public List<Feed> fetchFeedsByDeveloper(int devId) throws UnkownDevoloperException {
		return null;
	}

	public List<Feed> fetchFeedsByKeyword(String keyword) {
		return null;
	}

	public List<Feed> fetchFeedsByTopic(String topic) {
		// TODO Auto-generated method stub
		return null;
	}

}