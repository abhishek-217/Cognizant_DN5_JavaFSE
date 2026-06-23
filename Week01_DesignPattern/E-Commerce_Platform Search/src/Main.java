public class Main{
    public static void main(String[] args){
        Product products[] = {

                new Product(21, "Laptop", "Electronic"),
                new Product(22, "Phone", "Electronic"),
                new Product(30, "Shoes", "fashion")
        };

        Product res  = SearchEngine.search(products, "Phone");

        if(res != null){
            System.out.println("Item Found Sir ");
            System.out.println(res.name);
            System.out.println(" In "+ res.category+ " Category");
        }else{
            System.out.println("NOT FOUND SORRY!");
        }
    }
}