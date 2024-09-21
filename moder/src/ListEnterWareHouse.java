import java.util.ArrayList;

class EnterWareHouse{
    private String ID;
    private String product_ID;
    private String supplier_ID;
    private Unit unit_ID;
    private double quantity;
    private String date;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getProduct_ID() {
        return product_ID;
    }

    public void setProduct_ID(String product_ID) {
        this.product_ID = product_ID;
    }

    public String getSupplier_ID() {
        return supplier_ID;
    }

    public void setSupplier_ID(String supplier_ID) {
        this.supplier_ID = supplier_ID;
    }

    public Unit getUnit_ID() {
        return unit_ID;
    }

    public void setUnit_ID(Unit unit_ID) {
        this.unit_ID = unit_ID;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
public class ListEnterWareHouse{
    private static ArrayList<EnterWareHouse> LIST_ENTERWAREHOUSE;

    public ListEnterWareHouse(EnterWareHouse enterWareHouse) {
        LIST_ENTERWAREHOUSE.add(enterWareHouse);
    }

    public  ArrayList<EnterWareHouse> getListEnterWareHouse() {
        return LIST_ENTERWAREHOUSE;
    }

}
