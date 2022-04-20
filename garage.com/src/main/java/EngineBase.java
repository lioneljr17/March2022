public abstract class EngineBase implements IEngine {
	protected int cylinderCount;
	 boolean isStarted;

	public void start() {
		this.isStarted = true;
	}

	public boolean getIsStarted() {
		return this.isStarted;
	}
	
	public int getCylinderCount() {
		return cylinderCount;
	}
}
