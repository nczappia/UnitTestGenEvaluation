import java.util.*;
import java.lang.*;

class Solution {
    
    public List<String> bf(String planet1, String planet2) {
        List<String> planet_names = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        if (!planet_names.contains(planet1) || !planet_names.contains(planet2) || planet1.equals(planet2)) {
            return List.of();
        }
        int planet1_index = planet_names.indexOf(planet1);
        int planet2_index = planet_names.indexOf(planet2);
        if (planet1_index < planet2_index) {
            return planet_names.subList(planet1_index + 1, planet2_index);
        } else {
            return planet_names.subList(planet2_index + 1, planet1_index);
        }
    }
}