public class Address {
    private String city;
    private String country;
    private String zipCode;
    private String street;
    private String house;

    public Address(String city, String country, String zipCode, String street, String house) {
        if (city == null || city.isEmpty()) {
            throw new IllegalArgumentException("Город не может быть пустым или null");
        }
        if (country == null || country.isEmpty()) {
            throw new IllegalArgumentException("Страна не может быть пустой или null");
        }
        if (zipCode == null || zipCode.isEmpty()) {
            throw new IllegalArgumentException("Почтовый индекс не может быть пустым или null");
        }
        if (street == null || street.isEmpty()) {
            throw new IllegalArgumentException("Улица не может быть пустой или null");
        }
        if (house == null || house.isEmpty()) {
            throw new IllegalArgumentException("Номер дома не может быть пустым или null");
        }
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.street = street;
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            throw new IllegalArgumentException("Город не может быть пустым или null");
        }
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            throw new IllegalArgumentException("Страна не может быть пустой или null");
        }
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if (zipCode == null || zipCode.isEmpty()) {
            throw new IllegalArgumentException("Почтовый индекс не может быть пустым или null");
        }
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street == null || street.isEmpty()) {
            throw new IllegalArgumentException("Улица не может быть пустой или null");
        }
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        if (house == null || house.isEmpty()) {
            throw new IllegalArgumentException("Номер дома не может быть пустым или null");
        }
        this.house = house;
    }

    public String getFullAddress (){
        return city +", "+ country +", "+ zipCode +", "+ street +", "+ house;
    }
}
