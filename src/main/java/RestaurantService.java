import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName) throws RestaurantNotFoundException{

        //DELETE ABOVE STATEMENT AND WRITE CODE HERE

        for (Restaurant res:restaurants) {

            if(res.getName()==restaurantName)
                 return res;

            }


        throw new RestaurantNotFoundException(restaurantName);
        }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws RestaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        if(restaurantToBeRemoved==null)
           throw new RestaurantNotFoundException(restaurantToBeRemoved+"Restaurant not found");

        restaurants.remove(restaurantToBeRemoved);

        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return Collections
                .unmodifiableList(restaurants);
    }
}
