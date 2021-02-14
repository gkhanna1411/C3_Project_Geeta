public class RestaurantNotFoundException extends Throwable {

    public  RestaurantNotFoundException(String restaurantName) {
       super(restaurantName);
        System.out.println(restaurantName +"Not found");
    }
}
