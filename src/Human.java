public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null | name.isEmpty() | name.isBlank()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null | town.isEmpty() | town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null | jobTitle.isEmpty() | jobTitle.isBlank()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null || !town.isEmpty() || !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    public void printOut() {
        System.out.println("Привет! Меня зовут " + this.name +
                " Я из города " + this.town + " Я родился в " +
                this.yearOfBirth + " году. Я работаю на должности " +
                this.jobTitle + " Будем знакомы!");
    }
}
