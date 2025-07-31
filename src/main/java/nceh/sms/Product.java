package nceh.sms;

public class Product {
	
private int prdId;
private String pdName;
private double proPrice;
private double prdQty;

public Product(int prdId, String pdName, double proPrice, double prdQty) {
	super();
	this.prdId = prdId;
	this.pdName = pdName;
	this.proPrice = proPrice;
	this.prdQty = prdQty;
}

@Override
public String toString() {
	return "Product [prdId=" + prdId + ", pdName=" + pdName + ", proPrice=" + proPrice + ", prdQty=" + prdQty + "]";
}




}
