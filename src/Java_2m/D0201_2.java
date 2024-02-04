package Java_2m;

class Item{
    String id;
    String name;
    int price;
    public Item(String id,String name,int price){
        this.id =id;
        this.name = name;
        this.price = price;
    }
}
class Album extends Item{
    String artist;
    public Album(String id,String name,int price){
        super(id,name,price);
        this.artist = artist;
    }
}
class Movie extends Item{
    String director;
    String actor;
    public Movie(String id,String name,int price){
        super(id,name,price);
        this.director = director;
        this.actor = actor;
    }
}
class Book extends Item{
    String author;
    String isbn;
    public Book(String id,String name,int price){
        super(id,name,price);
        this.author = author;
        this.isbn = isbn;
    }
}
class ItemManger{
    public void printItem(Item item){
        System.out.println("id : " + item.id);
        System.out.println("artist or director or author : " + item.name);
        System.out.println("price : " + item.price);

        if(item instanceof Album) System.out.println("Album price : " + ((Album)item).price);
        else if(item instanceof Movie) System.out.println("Movie price : " + ((Movie)item).price);
        else if(item instanceof Book) System.out.println("Book price : " + ((Book)item).price);

        System.out.println();
    }
}
public class D0201_2 {
    public static void main(String[] args) {
        Book b = new Book("001","하네코토",4500);
        ItemManger man = new ItemManger();
        man.printItem(b);
    }

}
