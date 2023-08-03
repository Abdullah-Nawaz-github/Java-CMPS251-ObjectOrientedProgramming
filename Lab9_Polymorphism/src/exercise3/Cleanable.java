package exercise3;

import java.util.*;

public interface Cleanable {
	public Map<String, Integer> fees();

	public int getFee(String s);

	public void setCleaningCount(int i);

	public double getCleaningCount();

}
