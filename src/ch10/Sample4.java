package ch10;

public class Sample4 {
    public static void main(String[] args) {
        ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
        product.setKind(new Tv());
        product.setModel("SmartTv");
        product.setCompany("Samsoong");

        Storage<Tv> storage = new StorageImpl<>(100);
        storage.add(new Tv(), 0);
    }
}
