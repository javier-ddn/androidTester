package com.game.asteroids;

import java.util.Vector;

public class RankingArray implements RankingInterface {

	private final Vector<String> ranks;

	public RankingArray() {
		ranks = new Vector<String>();
		ranks.add("19961111 Jorge JR");
		ranks.add("19910907 Javi JR");
		ranks.add("20111102 Pablo JR JR");
		ranks.add("00002312 Paco");

	}

	@Override
	public void saveRank(int points, String name, long date) {
		ranks.add(0, points + " " + name);
	}

	@Override
	public Vector<String> rankList(int quantity) {
		return ranks;
	}

}
