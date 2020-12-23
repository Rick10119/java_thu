public class HW3 {
    /** to test */
    public static void main (String [] args) {

        // create an Organization
        Organization MyOrganization = new Organization();
        MyOrganization.setName("世界卫生组织");
        System.out.println(MyOrganization.toString());

        Company MyCompany = new Company();
        MyCompany.setName("国家电网公司");
        System.out.println(MyCompany.toString());

        University MyUniversity = new University();
        MyUniversity.setName("世一大");
        System.out.println(MyUniversity.toString());

        School MySchool = new School();
        MySchool.setName("世一系");
        System.out.println(MySchool.toString());

        Office MyOffice = new Office();
        MyOffice.setName("教务处");
        System.out.println(MyOffice.toString());


    }
}

class Organization {
    /** data field */
    private String name;
    private String address;
    private String telephone;
    private String email;


    /** constructor */
    Organization() {

    }

    /** the get and set methods */
    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String toString() {
        return "Organization: " + name;
    }
}

class Company extends Organization {
    private String scale;

    Company() {
        super();
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String toString() {
        return "Company: " + this.getName();
    }
}

class University extends Organization {
    private int population;
    private MyDate dateCreated;

    University () {
        dateCreated = new MyDate();
    }


    public int getPopulation() {
        return population;
    }

    public MyDate getDateCreated() {
        return dateCreated;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String toString() {
        return "University: " + this.getName();
    }
}

class School extends University {
    private String researchField;

    School () {
        super();
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public String toString() {
        return "School: " + this.getName();
    }
}

class Office extends University {
    private String serviceField;

    Office () {

    }

    public String getServiceField() {
        return serviceField;
    }

    public void setServiceField(String serviceField) {
        this.serviceField = serviceField;
    }

    public String toString() {
        return "Office: " + this.getName();
    }
}

class MyDate {
    private int year, month, day;

    MyDate () {

    }

    MyDate (int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}