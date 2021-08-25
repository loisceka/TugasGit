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
public class Employee {

    private String Id, nama, gender, email;
    private int gaji;

    public Employee(String Id, String nama, String gender, String email, int gaji) {
        this.Id = Id;
        this.nama = nama;
        this.gender = gender;
        this.email = email;
        this.gaji = gaji;
    }

    public Employee() {
    }
    
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void masukKerja() {
        System.out.println("Mohon untuk masuk kerja tepat waktu");
    }

    @Override
    public String toString() {
        return "Employee{" + "Id=" + Id + ", nama=" + nama + ", gender=" + gender + ", email=" + email + ", gaji=" + gaji + '}';
    }
    
    
}
