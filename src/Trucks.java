public class Trucks extends Transport implements Competing{

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Вставить ключ в замок зажигания,снять с ручника , завести двигатель ");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Выключить зажигание,поднять ручник ");
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.println(" Пит-стоп на третьем круге ");

    }

    @Override
    public void maxSpeed() {
        System.out.println(" Максимальная скорость 147 км/ч ");

    }

    @Override
    public void bestTime() {
        System.out.println(" Лучшее время в соревновании 72 минуты ");

    }
}
