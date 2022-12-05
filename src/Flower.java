public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;
        if (flowerColor != null && !flowerColor.isBlank() && !flowerColor.isEmpty()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }
        if (country != null && !country.isBlank() && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost <= 0) {
            this.cost = 1.0;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isBlank() && !flowerColor.isEmpty()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isBlank() && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1.0;
        } else {
            this.cost = cost;
        }
    }

    @Override
    public String toString() {
        return "Название " + name +
                ", Цвет " + flowerColor +
                ", Страна " + country +
                ", Стоимость " + cost +
                ", Срок стояния " + lifeSpan;
    }

    public static void calcCostAndLifeSpan(Flower[] arr) {
        double sumCost = 0;
        int minLifeSpan = arr[0].lifeSpan;
        for (Flower ad : arr) {
            sumCost += ad.getCost();
            if (ad.lifeSpan < minLifeSpan) {
                minLifeSpan = ad.lifeSpan;
            }
        }
        sumCost += (sumCost * 0.1);
        int quantityRoza = 0;
        int quantityPion = 0;
        int quantityHrizantema = 0;
        int quantityGipsofila = 0;
        for (Flower ad : arr) {
            quantityRoza = ad.name == "Роза обыкновенная" ? quantityRoza + 1 : quantityRoza + 0;
            quantityPion = ad.name == "Пион" ? quantityPion + 1 : quantityPion + 0;
            quantityHrizantema = ad.name == "Хризантема" ? quantityHrizantema + 1 : quantityHrizantema + 0;
            quantityGipsofila = ad.name == "Гипсофила" ? quantityGipsofila + 1 : quantityGipsofila + 0;
        }
        System.out.println("Букет, в котором есть Роза обыкновенная - " + quantityRoza + " шт.," +
                " Пион - " + quantityPion + " шт.," +
                " Хризантема - " + quantityHrizantema + " шт.," +
                " Гипсофила - " + quantityGipsofila + " шт.," + "будет стоить: " +
                sumCost + " руб." + "и простоит " + minLifeSpan + " дней");


    }
}

