package Other;

public class SetOfLaptop {
        int id;
        String color;
        String brand;

        public SetOfLaptop(int id, String color, String brand){
            this.id = id;
            this.color = color;
            this.brand = brand;
        }

        public String toString() {
            return String.format("id: %d, color: %s, brand: %s", id, color, brand);
        }

        public boolean equals(Object o) {
            SetOfLaptop t = (SetOfLaptop) o;
            return id == t.id;
        }
}

