package model;

import java.io.Serializable;

public class Member implements Serializable {
    private static final long serialVersionUID = 1L;

    private String memberId;
    private String name;
    private String department;
    private String phone;
    private String email;

    public Member(String memberId, String name, String department,
                  String phone, String email) {
        this.memberId = memberId;
        this.name = name;
        this.department = department;
        this.phone = phone;
        this.email = email;
    }

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Member ID: " + memberId +
                ", Name: " + name +
                ", Department: " + department +
                ", Phone: " + phone +
                ", Email: " + email;
    }
}
