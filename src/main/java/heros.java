public class heros{
	private String mName;
	private String mAge;
	private String mPowers;
	private String mWeaknesses;

	public heros(String name, String age, String powers, String weaknesses){
		mName = name;
		mAge = age;
		mPowers = powers;
		mWeaknesses = weaknesses;
	}

	public String getName(){
		return mName;
	}

	public String getAge(){
		return mAge;
	}

	public String getPowers(){
		return mPowers;
	}

	public String getWeaknesses(){
		return mWeaknesses;
	}
}