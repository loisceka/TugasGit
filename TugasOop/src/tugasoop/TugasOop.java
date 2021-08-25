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
public class TugasOop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Tugas Github & OOP");
        Employee emp = new Employee();

        emp.setId("ADD14045");
        emp.setNama("Devid Erliando");
        emp.setEmail("dev@gmail.com");
        emp.setGaji(10000000);
        emp.setGender("Laki-laki");

        Manager krw2 = new Manager("ADD14022", "Lois Ceka", "Laki-laki", "loisceka13@gmail.com", 100000, "Developer");

        System.out.println(emp);
        System.out.println(krw2);

        emp.masukKerja();
    }

}
