public class Squad{
		private String mSquadName;
		private Integer mMaxSize;
		private String mCause;

	public Squad(String squadName, Integer maxSize, String cause){
		mSquadName = squadName;
		mMaxSize = maxSize;
		mCause = cause;
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