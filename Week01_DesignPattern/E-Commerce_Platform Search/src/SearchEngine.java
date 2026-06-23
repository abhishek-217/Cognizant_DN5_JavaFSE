public class SearchEngine {
    public static Product search(Product ps[], String target){

        for(Product p : ps){
            if(p.name.equalsIgnoreCase(target)){
                return p;
            }
        }

        return null;

    }
}
