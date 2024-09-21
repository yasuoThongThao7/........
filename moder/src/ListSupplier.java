import java.util.ArrayList;


public class ListSupplier {
    private static ArrayList<Suppliers> LIST_SUPPLIERS;
    private ArrayList<Suppliers> listSameName;

    public ListSupplier(Suppliers supplier) {
        LIST_SUPPLIERS.add(supplier);
    }

    public Suppliers getSupplier(String ID) {
        for(Suppliers supplier : LIST_SUPPLIERS) {
            if(supplier.getSupplier_id().equals(ID)) {
                return supplier;
            }
        }
        return null;
    }

    public void addListSameName(String name) {
         for (Suppliers supplier : LIST_SUPPLIERS) {
             if (supplier.getName().contains(name)) {
                 listSameName.add(supplier);
             }
         }
    }

}
