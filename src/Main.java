public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilderImpl();
        CarBuildDirector director = new CarBuildDirector(builder);

        director.constructSportsCar();
        Car sportsCar = builder.getResult();
        System.out.println("Sports Car:");
        System.out.println("Brand: " + sportsCar.getBrand());
        System.out.println("Model: " + sportsCar.getModel());
        System.out.println("Color: " + sportsCar.getColor());
        System.out.println("Year: " + sportsCar.getYear());

        System.out.println();

        // Construct an SUV
        director.constructSUV();
        Car suv = builder.getResult();
        System.out.println("SUV:");
        System.out.println("Brand: " + suv.getBrand());
        System.out.println("Model: " + suv.getModel());
        System.out.println("Color: " + suv.getColor());
        System.out.println("Year: " + suv.getYear());
    }
}