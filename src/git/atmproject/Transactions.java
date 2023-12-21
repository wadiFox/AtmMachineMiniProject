package git.atmproject;

public class Transactions {
private double amount;
private String description;

public Transactions(double amn, String desc) {
	amount=amn;
	description=desc;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

@Override
public String toString() {
    return amount + " " + description;
}
}
