package business;


public class Store {
    
    private String storeName;
    private String storeLocation;
    private MasterOrderCatalog masterOrderCatalog;

    public Store(){
        masterOrderCatalog = new MasterOrderCatalog();
        
    }
    @Override
    public String toString() {
        //return "Store{" + "storeName=" + storeName + '}';
        return getStoreName();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }
    
}
