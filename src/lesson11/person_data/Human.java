package lesson11.person_data;

public class Human {
    private String name;
    private String birthday;
    private String phone;
    private String country;
    private String city;
    private String address;



//    public Human(String name) {
//        this.name = name;
//    }

//    public Human(String phone) {
//        this.phone = phone;
//    }


//    public Human(String birthday) {
//        this.birthday = birthday;
//    }


    public Human(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Human(String firstName, String birthday, String phone, String country, String city, String address){
        this.address = address;
        this.name = firstName;
        this.city = city;
        this.phone = phone;
        this.birthday = birthday;
        this.country = country;
    }

    public void setData(String birthday, String country, String city, String address){
        this.birthday = birthday;
        this.country = country;
        this.city = city;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }



    public void setName(String name1){
        this.name = name1;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printInfo(){
        System.out.println("***************** Персональные данные *****************");
        System.out.printf("Имя: %s%n", this.name);
        System.out.printf("Дата рождения: %s%n", this.birthday);
        System.out.printf("Номер телефона: %s%n", this.phone);
        System.out.printf("Страна: %s%n", this.country);
        System.out.printf("Город: %s%n", this.city);
        System.out.printf("Домашний адрес: %s%n", this.address);
        System.out.println("=======================================================");
    }
}
