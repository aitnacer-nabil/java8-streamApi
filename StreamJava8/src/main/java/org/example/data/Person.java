// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

package org.example.data;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private long id;
    private String email;
    private int age;

    public String getFirstName() { return firstName; }
    public void setFirstName(String value) { this.firstName = value; }

    public String getLastName() { return lastName; }
    public void setLastName(String value) { this.lastName = value; }

    public String getGender() { return gender; }
    public void setGender(String value) { this.gender = value; }

    public long getid() { return id; }
    public void setid(long value) { this.id = value; }

    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    public int getAge() { return age; }
    public void setAge(int value) { this.age = value; }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
