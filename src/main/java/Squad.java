import java.util.ArrayList;
import java.util.List;

public class Squad{
		private String mSquadName;
		private Integer mMaxSize;
		private String mCause;
		private static List<Squad> instances = new ArrayList<Squad>();

	public Squad(String squadName, Integer maxSize, String cause){
		mSquadName = squadName;
		mMaxSize = maxSize;
		mCause = cause;
		instances.add(this);
	}

	public static List<Squad> all(){
		return instances;
	}

	public String getSquadName(){
		return mSquadName;
	}

	public Integer getMaxSize(){
		return mMaxSize;
	}

	public String getCause(){
		return mCause;
	}
}