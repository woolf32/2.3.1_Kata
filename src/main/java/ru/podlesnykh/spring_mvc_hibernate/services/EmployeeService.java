package ru.podlesnykh.spring_mvc_hibernate.services;

import ru.podlesnykh.spring_mvc_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> showAllEmployee ();
    Employee getEmployeeById (int id);
    void save(Employee employee);
    void update(int id, Employee employee);
    void delete(int id);
}
