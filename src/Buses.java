public class Buses extends Transport implements Competing {

    public Buses(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Вставить ключ в замок зажигания и завести двигатель");

    }

    @Override
    public void finishTheMovement(){
        System.out.println("Выключить зажигание и выйти из машины");
    }

    @Override
    public String toString() {
        return "Buses{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.println(" Пит-стоп на четвертом круге ");

    }

    @Override
    public void maxSpeed() {
        System.out.println(" Максимальная скорость 105 км/ч ");

    }

    @Override
    public void bestTime() {
        System.out.println(" Лучшее время в соревновании 122 минуты ");

    }
}
