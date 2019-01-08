import java.util.ArrayList;
import java.util.List;

public class RemoveVowels {

    public List<String> removeVowel(List<String> places) {
        if(places==null)
            return null;
        List<String> place= new ArrayList<String>();
        String newPlace = "";
        for (int i = 0; i < places.size(); i++) {
            newPlace = places.get(i);
            newPlace = newPlace.replaceAll("[aeiou]", "");
            place.add(newPlace);
        }
        return place;
    }

}
