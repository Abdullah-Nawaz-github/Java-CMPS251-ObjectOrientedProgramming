package Exercise1;

public class Major {
	private int majorId;
	private String title;
	private int hostDeptId;
	private int totalCreditHours;

	public Major() {
		majorId = 999;
		title = "Unknown";
		hostDeptId = 888;
		totalCreditHours = 0;
	}

	/**
	 * @param majorId
	 * @param title
	 * @param hostDeptId
	 * @param totalCreditHours
	 */
	public Major(int majorId, String title, int hostDeptId, int totalCreditHours) {
		setMajorId(majorId);
		setTitle(title);
		setHostDeptId(hostDeptId);
		setTotalCreditHours(totalCreditHours);
	}

	public int getMajorId() {
		return majorId;
	}

	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHostDeptId() {
		return hostDeptId;
	}

	public void setHostDeptId(int hostDeptId) {
		this.hostDeptId = hostDeptId;
	}

	public int getTotalCreditHours() {
		return totalCreditHours;
	}

	public void setTotalCreditHours(int totalCreditHours) {
		this.totalCreditHours = totalCreditHours;
	}

	public String display() {
		return "Major [majorId=" + majorId + ", title=" + title + ", hostDeptId=" + hostDeptId + ", totalCreditHours="
				+ totalCreditHours;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
