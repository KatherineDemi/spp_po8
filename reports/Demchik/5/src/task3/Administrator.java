package task3;

public class Administrator extends User {
    public Administrator(OnlineStore onlineStore) {
    super(onlineStore);
    }
    public void addProduct(String productName) {
    getOnlineStore().addProduct(productName);
    }
    public void addToBlackList() {
    getOnlineStore().addToBlackList();
    }
}