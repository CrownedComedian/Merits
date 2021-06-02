package achievements;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.HashMap;
import java.util.Map;

//import com.google.gson.Gson;

import achievements.tree.AchievementsTree;

public class AchievementsManager {
	private final AchievementsManager singletonInstance = new AchievementsManager();
	private final Map<String, SimpleImmutableEntry<String, AchievementsTree>> trees = new HashMap<String, SimpleImmutableEntry<String, AchievementsTree>>();
	
	private AchievementsManager() {}
	
	public AchievementsManager getInstance() {
		return singletonInstance;
	}
	
	public void loadTree(String jsonSourceFile) {
        try (FileReader reader = new FileReader(jsonSourceFile)) {
        	String data = new String(Files.readAllBytes(Paths.get(jsonSourceFile)));
//            new Gson().fromJson(data, AchievementsTree.class);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void loadTreesFromDir() {
		
	}
	
	public void saveTree(String treeToSave) {
//        try (FileWriter file = new FileWriter(paths.get(treeToSave))) {
//            file.write(new Gson().toJson(trees.get(treeToSave))); 
//            file.flush();
// 
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
	}
	
	public void saveAllTrees() {
		
	}
	
//	public Map<String, AchievementsTree> getTrees() {
//		return trees;
//	}
	
	public void unloadTree(String treeName) {
		trees.remove(treeName);
	}
}
