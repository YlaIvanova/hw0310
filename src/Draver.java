
    abstract class Driver <T extends Transport & Competing> {

        public String name;

        public Character driverIsLicense;

        public int experience;

        private T car;

        public Driver(String name, Character driverIsLicense, int experience, T car) {
            if (name==null || name.isEmpty()){
               System.out.println("Имя водителя не указано!");
            }else {
                this.name = name;
            }
            if (driverIsLicense!='B' && driverIsLicense!='C' && driverIsLicense!='D'){
                System.out.println("Нет нужной категории");
            }else {
                this.driverIsLicense = driverIsLicense;
            }
            if (car!=null){
                this.car = car;
            }
            setExperience(experience);

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Character getDriverIsLicense() {
            return driverIsLicense;
        }

        public void setDriverIsLicense(Character driverIsLicense) {
            this.driverIsLicense = driverIsLicense;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }


        public void startMoving(){
            System.out.println(name +" Начинает движение"+ car.getBrand() + " " + car.getModel());

        }
        public void stop(){
            System.out.println(name + " Останавливает движение"+ car.getBrand() + " " + car.getModel());

        }
        public void refuelTheCar(){
            System.out.println(name + " Заправляет транспорт"+ car.getBrand() + " " + car.getModel());
        }

        public T getCar() {
            return car;
        }

        public void setCar(T car) {
            this.car = car;
        }

        @Override
        public String toString() {
            return "Имя водителя :" + name + "Категория прав:" + driverIsLicense + "Опыт вождения:" + experience;
        }
    }


