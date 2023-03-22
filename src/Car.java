public class Car {
    static class motors {
        private final String color;
        private final String year;
        private final String brand;
        private final String model;

        private final float price;
        private float quantity;

        public motors(String Color, String Year, String Brand, String Model, float Price, float Quantity) {
            color = Color;
            year = Year;
            brand = Brand;
            model = Model;
            price = Price;
            quantity = Quantity;

        }

        void setQuantity(float givenQuantity) {
            quantity = givenQuantity;
        }

        String getColor() {
            return color;
        }

        String getYear() {
            return color;
        }

        String getBrand() {
            return brand;
        }

        String getModel() {
            return model;
        }

        float getPrice() {
            return price;
        }

        float getQuantity() {
            return quantity;
        }

        public String toString() {
            return color + " " + year + " " + brand + " " + model + " " + price + " " + quantity;
        }

        void sell() {
            System.out.println("The Car Details are: ");
            System.out.println(getColor() + " " + getYear() + " " + getBrand() + " " + getModel() + " " + getPrice() + " " + getQuantity());
            setQuantity(quantity - 1);
            System.out.println("The new car details are as follows: ");
            System.out.println(this);


        }

    }
}





