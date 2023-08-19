class CarBuilderImpl implements CarBuilder {
    private String brand;
    private String model;
    private String color;
    private int year;

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public Car getResult() {
        return new Car(brand, model, color, year);
    }
}
