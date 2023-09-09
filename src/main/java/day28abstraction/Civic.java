package day28abstraction;

    // Bir Class'i bir interface'in child'i yapmak icin "implements" kullaniriz.
public class Civic implements Engine, Ac, Hood{

        @Override
        public void eco() {
            System.out.println("Uses eco engine");
        }

        @Override
        public void gas() {
            System.out.println("Uses gas");
        }

        @Override
        public void tsi() {
            System.out.println("Uses tsi technology");
        }

        @Override
        public void digital() {
            System.out.println("Uses digital AC");
        }

        @Override
        public void climate() {
            System.out.println("Uses climate technology");
        }

        @Override
        public void steell() {
            System.out.println("Hood is made by steel");
        }
    }
