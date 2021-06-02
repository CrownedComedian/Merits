package achievements.tree;

import java.util.ArrayList;
import java.util.List;

import achievements.Achievement;

public class AchievementNode {
	Achievement node;
	List<Achievement> children = new ArrayList<>();
	
	public AchievementNode(Achievement node) {
		this.node = node;
	}
	
	public List<Achievement> getChildren() {
		return children;
	}
}
