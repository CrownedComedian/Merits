package achievements.tree;

public class AchievementsTree {
	private final AchievementNode head;
	
	public AchievementsTree(AchievementNode head) {
		this.head = head;
	}

	public AchievementNode getHead() {
		return head;
	}
}
