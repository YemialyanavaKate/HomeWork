package home_work_5;

import home_work_5.dto.Animal;
import home_work_5.utils.MapUtils;

import java.util.Collection;
import java.util.Map;

public class MainAnimal {
    public static void main(String[] args) {

        Map<String, Animal> mapWithAnimal = MapUtils.AnimalRandome(5);
        System.out.println(mapWithAnimal);

        Collection<Animal> values = mapWithAnimal.values();

        for (Animal datum : values) {
            System.out.println(datum);
        }



     }
}
