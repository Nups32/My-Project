import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
import java.util.ArrayList;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeManager {
    private static final String FILENAME = "employee_data.dat";

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

       
        employees.add(new Employee("Diya Dave", 101, 5000000.0));
        employees.add(new Employee("Bansi Dave", 102, 5500000.0));
        employees.add(new Employee("Pankti Patel", 103, 6000000.0));

       
        writeEmployeeData(employees);

       
        ArrayList<Employee> loadedEmployees = readEmployeeData();
        for (Employee employee : loadedEmployees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("ID: " + employee.getId());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }
    }

    private static void writeEmployeeData(ArrayList<Employee> employees) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILENAME))) {
            dos.writeInt(employees.size()); // Write the number of employees

            for (Employee employee : employees) {
                dos.writeUTF(employee.getName());
                dos.writeInt(employee.getId());
                dos.writeDouble(employee.getSalary());
            }

            System.out.println("Employee data written to " + FILENAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Employee> readEmployeeData() {
        ArrayList<Employee> loadedEmployees = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILENAME)) ) {
            int numEmployees = dis.readInt(); // Read the number of employees

            for (int i = 0; i < numEmployees; i++) {
                String name = dis.readUTF();
                int id = dis.readInt();
                double salary = dis.readDouble();

                loadedEmployees.add(new Employee(name, id, salary));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return loadedEmployees;
    }
}
