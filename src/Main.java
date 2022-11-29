public class Main {

        public static void main(String[] args) {

        Buses liaz = new Buses ("Лиаз","К-201",3.5);
        Buses gaz = new Buses("Газ","Г-24",2.5);
        Buses yaz = new Buses("УАЗ","АВТО",4.0);
        Buses mercedes = new Buses("Мерседес","Benz",4.2);

        PassengerCars lada = new PassengerCars (" LADA"," Granta",1.5);
        PassengerCars bmw = new PassengerCars(" BMW"," Z8",3.0);
        PassengerCars kia = new PassengerCars(" Kia"," Sportage 6 поколение",2.5);
        PassengerCars audi = new PassengerCars(" AUDI"," Q",2.7);

        Trucks iveco = new Trucks (" Iveco"," PowerStar",4.5);
        Trucks maz = new Trucks (" МАЗ"," К-320",4.0);
        Trucks belaz = new Trucks (" БЕЛАЗ","Б-805",3.9);
        Trucks daf = new Trucks (" DAF"," QWE",4.4);

        DriverB yuliia = new DriverB();
        DriverC kostya = new DriverC();
        DriverD ivan = new DriverD();

        System.out.println(liaz);
        System.out.println(gaz);
        System.out.println(yaz);
        System.out.println(mercedes);
        System.out.println(lada);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(audi);
        System.out.println(iveco);
        System.out.println(maz);
        System.out.println(belaz);
        System.out.println(daf);

        System.out.println(yuliia);
        System.out.println(kostya);
        System.out.println(ivan);

    }
}