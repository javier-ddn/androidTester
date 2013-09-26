package com.game.asteroids;

import java.util.Vector;

public interface RankingInterface {

	public void saveRank(int points, String name, long date);

	public Vector<String> rankList(int quantity);
}
