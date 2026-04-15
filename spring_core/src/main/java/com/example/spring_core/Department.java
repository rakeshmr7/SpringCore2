package com.example.spring_core;

public class Department {
    private int deptId;
    private String deptName;
    private Employee emp;
    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public Department() {
    }
    
    public Department(int deptId, String deptName, Employee emp) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.emp = emp;
        
    }

    

    @Override
    public String toString() {
        return "Department [deptId=" + deptId + ", deptName=" + deptName + ", emp=" + emp + "]";
    }

    public int getDeptId() {
        return deptId;
    }
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
}
