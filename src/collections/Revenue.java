package collections;

public class Revenue {
	String revenueCategory;
	int amount;
	public Revenue(String revenueCategory,int amount) {
		super();
		this.revenueCategory=revenueCategory;
		this.amount=amount;
	}
	public String getRevenueCategory() {
		return revenueCategory;
	}
	public void setRevenueCategory(String revenueCategory) {
		this.revenueCategory = revenueCategory;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
