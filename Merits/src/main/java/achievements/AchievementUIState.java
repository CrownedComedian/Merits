package achievements;

public enum AchievementUIState {
	/**Everything about this achievement is drawn to the screen.  An achievement cannot change UI states after being set to this value.*/
	VISIBLE, 
	
	/**If a developer ever wanted just certain aspects of an achievement to be drawn to the screen.  For example, only the title is seen but not the description until a certain event is triggered.*/
	PARTLY_VISIBLE, 
	
	/**If a developer ever wanted to draw a frame container for the achievement, but display no information about it until a certain event is triggered.*/
	SECRET, 
	
	/**Absolutely nothing is drawn to the screen.  The user is completely unaware of this achievement.*/
	HIDDEN
}
