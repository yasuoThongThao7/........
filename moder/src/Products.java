public class Products {
    private String product_id;
    private String product_name;
    private String description;
    private Double price_in; // Giá bán trên 1 đơn vị tính
    private Double price_out; // Giá xuất ra trên 1 đơn vị  tính
    private String unit_id; // ID đơn vị tính

    public Products(Double price_in, String product_id, String product_name, String description, Double price_out, String unit_id) {
        this.price_in = price_in;
        this.product_id = product_id;
        this.product_name = product_name;
        this.description = description;
        this.price_out = price_out;
        this.unit_id = unit_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {this.product_id = product_id;}

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice_in() {
        return price_in;
    }

    public void setPrice_in(Double price_in) {
        this.price_in = price_in;
    }

    public Double getPrice_out() {
        return price_out;
    }

    public void setPrice_out(Double price_out) {
        this.price_out = price_out;
    }

    public String getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(String unit_id) {
        this.unit_id = unit_id;
    }
}

class Unit{
    private String unit_id;
    private String unit_name;
}