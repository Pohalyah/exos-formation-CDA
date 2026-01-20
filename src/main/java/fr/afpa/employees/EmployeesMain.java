package fr.afpa.employees;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeesMain {
    public static void main(String[] args) {

        ArrayList<Employee> listEmployes = new ArrayList<Employee>();
        Employee emp1 = new Employee(100, "Pasqali", "Pedro", 1974.15f, LocalDate.of(2000, 12, 11));
        listEmployes.add(emp1);

        Employee emp2 = new Employee(101, "Laranaga", "Maximus", 379.48f, LocalDate.of(1978, 5, 18));
        listEmployes.add(emp2);

        Employee emp3 = new Employee(102, "Simone", "Adririen", 15487.84f, LocalDate.of(2015, 1, 20));
        listEmployes.add(emp3);

        Employee emp4 = new Employee(103, "Esperence", "Ludobic", 1547.12f, LocalDate.of(1, 12, 31));
        listEmployes.add(emp4);

        Employee emp5 = new Employee(104, "Utilisateur", "Test", 1000.00f, LocalDate.of(2000, 1, 21));
        listEmployes.add(emp5);

        for (Employee emp : listEmployes) {
            emp.getJourAvantAnniv();
            emp.getSalaireNet();
            System.out.println(emp);

            System.out.println(emp.getNomPrenom() + ", voici votre salaire net : " + emp.getSalaireNet());
            System.out.println("------");
        }

    }
}
