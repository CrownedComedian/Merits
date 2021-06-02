package achievements;

public class Achievement {
	public final String title;
	public final String description;
	private boolean isLocked = true;
	private AchievementUIState UIstate;

	public Achievement(String title, String description) {
		this(title, description, AchievementUIState.VISIBLE);
	}
	
	public Achievement(String title, String description, AchievementUIState UIstate) {
		this.title = title;
		this.description = description;
		this.UIstate = UIstate;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void unlock() {
		isLocked = false;
	}
	
	public AchievementUIState getUIState() {
		return UIstate;
	}
	
	/**
	 * 
	 * @param newState
	 * @return true only if the UIState changed, false otherwise.
	 */
	public boolean updateUIState(AchievementUIState newState) {
		if(UIstate.compareTo(newState) > 0) {
			UIstate = newState;
			
			return true;
		}
		
		return false;
	}
}
