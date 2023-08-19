class CarBuildDirector {
    private CarBuilder builder;

    public CarBuildDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public void constructSportsCar() {
        builder.setBrand("Ferrari");
        builder.setModel("LaFerrari");
        builder.setColor("Red");
        builder.setYear(2022);
    }

    public void constructSUV() {
        builder.setBrand("Tesla");
        builder.setModel("Model X");
        builder.setColor("Black");
        builder.setYear(2021);
    }
}
