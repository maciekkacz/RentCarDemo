public class Adress {
    private String street;
    private String buildingNumber;
    private String apartmentNumber;
    private int zipCod;
    private String city;

    public Adress(String street, String buildingNumber, String apartmentNumber, int zipCod, String city) {
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
        this.zipCod = zipCod;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getZipCod() {
        return zipCod;
    }

    public void setZipCod(int zipCod) {
        this.zipCod = zipCod;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", zipCod=" + zipCod +
                ", city='" + city + '\'' +
                '}';
    }
}
