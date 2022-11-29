public class PassengerCars extends Transport implements Competing {

    public PassengerCars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Вставить ключ в замок зажигания,завести двигатель,включить музыку");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Выключить зажигание ");
    }

    @Override
    public String toString() {
        return "PassengerCars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.println(" Пит-стоп на втором круге ");

    }

    @Override
    public void maxSpeed() {
        System.out.println(" Максимальная скорость 198 км/ч ");

    }

    @Override
    public void bestTime() {
        System.out.println(" Лучшее время в соревновании 54 минуты ");

    }
}
