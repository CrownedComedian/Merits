package achievements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AchievementTest {
	
	@Test
	@DisplayName("updating UI state")
	void testCompare() {
		Achievement a = new Achievement("A", "the first achievement");
		Achievement b = new Achievement("B", "the second achievement", AchievementUIState.HIDDEN);
		
		Assertions.assertTrue(b.updateUIState(AchievementUIState.VISIBLE));
		Assertions.assertEquals(AchievementUIState.VISIBLE, b.getUIState());
	}
}
