package models;

public class DepartmentInfo {

    public DepartmentInfo(String departmentName, String description, int numberOfEmployees){
        this.departmentName = departmentName;
        this.description = description;
        this.numberOfEmployees = numberOfEmployees;
    }

    private String departmentName;
    private String description;
    private int numberOfEmployees;

    public String getDepartmentName() { return departmentName; }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getNumberOfEmployees() { return numberOfEmployees; }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

}
