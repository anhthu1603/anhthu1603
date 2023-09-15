package javabasicbai3;

public class Student {
	private String fullName;
    private String address;
    private String dob;
    private String gender;
    private float finalGrade;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }
    
    public String getDOB() {
        return dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setFinalGrade(float finalGrade) {
        this.finalGrade = finalGrade;
    }

    public float getFinalGrade() {
        return finalGrade;
    }

}
