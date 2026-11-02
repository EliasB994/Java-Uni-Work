public class PlanetNames {
    public static void main(String[] args) {
    String[] planets = {
    
        "Mercury", "Venus", "Earth", "Mars",
        "Jupiter", "Saturn", "Uranus", "Neptune"
    };

 for(int i=0; i<planets.length; i++){
         System.out.println("Hello " + planets[i]);
    

    for(String planet : planets){
        System.out.println("Hello " + planet);
    }

    }

}

}

