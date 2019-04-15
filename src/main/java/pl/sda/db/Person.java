package pl.sda.db;

import javax.persistence.*;

@Entity
@Table(name = "Osoba")
@SecondaryTable(name = "Adres",pkJoinColumns = @PrimaryKeyJoinColumn(name = "id_osoba"))
public class Person {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "Imie", nullable = false, length = 50)
    private String firstName;
    @Column(name = "Nazwisko", columnDefinition = "varchar(100) not null")
    private String lastName;
    @Column(name = "Wiek")
    private int age;
    @Column(name = "Wynagrodzenie")
    private double salary;

    @Column(table = "Adres", name = "Miasto")
    private String location;
    @Column(table = "Adres", name = "Ulica")
    private String strit;
    @Column(table = "Adres", name = "Kod_pocztowy")
    private String zipCode;

    public Person(String firstName, String lastName, int age, double salary, String location, String strit, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.location = location;
        this.strit = strit;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                ", strit='" + strit + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStrit() {
        return strit;
    }

    public void setStrit(String strit) {
        this.strit = strit;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    //@Transient
//private String description;
//private short poleShort;
//private long poleLong;
//private BigDecimal poleBigDecimal;
//private BigInteger poleBigInteger;
//private boolean poleboolean;
//private int[] poleIntArray;
//private Integer[] poleIntegerArray;
//private java.sql.Time poelTime;
//private java.sql.Date poleDate;
//private java.sql.Timestamp poleTimestamp;
////na co ma byc przemapowane
//@Temporal(TemporalType.TIME)
//private Date poleUtlDate;
////takie wrapery wycinaja i wklejaja(zwykly javowy typ
//@Temporal(TemporalType.DATE)
//private Calendar poleUtlCalendar;

}
