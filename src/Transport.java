public abstract class Transport {

   public String brand;

   public String model;

   public double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Укажите бренд";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "Укажите модель";
        } else {
            this.model = model;
        }
        if (engineVolume < 0) {
            this.engineVolume = 0;
            System.out.println("Укажите обьем двигателя");
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public abstract void startMoving();

    public abstract void finishTheMovement();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

}
