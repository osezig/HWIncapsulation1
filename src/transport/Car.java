package transport;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    double engineVolume;
    String color;
    private int year;
    private String country;
    String transmission;
    private String bodyType;
    String registrationNum;
    private int numOfSeat;
    boolean winterTires;
    private Key key;
    private Insurance insurance;

    public class Key {
        private boolean remoteEngineStart;
        private boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(boolean remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        public void setKeylessEntry(boolean keylessEntry) {
            this.keylessEntry = keylessEntry;
        }
    }

    public class Insurance {
        private int validity;
        private int cost;
        private int number;

        public Insurance(int validity, int cost, int number) {
            if (validity <= 0) {
                this.validity = 2022;
            } else {
                this.validity = validity;
            }
            if (cost <= 0) {
                this.cost = 5000;
            } else {
                this.cost = cost;
            }
            if (number <= 0) {
                this.number = 999999999;
            } else {
                this.number = number;
            }
        }

        public int getValidity() {
            return validity;
        }

        public void setValidity(int validity) {
            this.validity = validity;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }


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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String bodyType, String registrationNum, int numOfSeat, int winterTires) {

        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "default";
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "default";
        }
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "default";
        }
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "default";
        }
        if (registrationNum != null && !registrationNum.isEmpty() && !registrationNum.isBlank()) {
            this.registrationNum = registrationNum;
        } else {
            this.registrationNum = "default";
        }
        if (numOfSeat < 0) {
            this.numOfSeat = 5;
        } else {
            this.numOfSeat = numOfSeat;
        }
        this.winterTires = winterTires == 1;
        this.insurance = insurance;

    }
    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNum='" + registrationNum + '\'' +
                ", numOfSeat=" + numOfSeat +
                ", winterTires=" + winterTires +
                '}';
    }

    public void changeTires(int winterTires) {
        if (winterTires > 1 || winterTires < 0) {
            winterTires = 1;
        }
        this.winterTires = winterTires == 1;
    }


    public void checkRegistrationNum() {

        if (this.registrationNum.length() == 9) {
            if (!this.registrationNum.substring(5, 6).matches("[а-я]")) {
                System.out.println("Номер введен неверно");
            } else if (!this.registrationNum.substring(0, 1).matches("[а-я]")) {
                System.out.println("Номер введен неверно");
            } else if (!this.registrationNum.substring(2, 4).matches("[\\d]+")) {
                System.out.println("Номер введен неверно");
            } else if (!this.registrationNum.substring(7, 9).matches("[\\d]+")) {
                System.out.println("Номер введен неверно");
            } else {
                System.out.println("Номер введен верно");
            }
        } else {
            System.out.println("Номер введен неверно");
        }
    }

    public void checkNumInsurance() {
        String tmp = Integer.toString(this.insurance.getNumber());
        if (tmp.length() != 9) {
            System.out.println("Номер страховки введен не корректно");
        } else {
            System.out.println("Номер страховки верный");
        }
    }

    public void checkValidityInsurance() {
        if (this.insurance.getValidity() < LocalDate.now().getYear()) {
            System.out.println("Нужно срочно ехать оформлять новую страховку");
        }
    }


}
