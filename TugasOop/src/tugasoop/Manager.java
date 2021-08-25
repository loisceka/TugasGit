/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasoop;

/**
 *
 * @author hp
 */
public class Manager extends Employee {

    private String department;

    public Manager(String Id, String nama, String gender, String email, int gaji, String department) {
        super(Id, nama, gender, email, gaji);
        this.department = department;
    }

    public Manager(String Id, String nama, String gender, String email, int gaji) {
        super(Id, nama, gender, email, gaji);
    }
    
    public Manager() {
       
    }
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    

    @Override
    public String toString() {
        return "Manager{" + "department=" + department + '}';
    }
    
}
