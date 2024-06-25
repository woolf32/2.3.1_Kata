package ru.podlesnykh.spring_mvc_hibernate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.podlesnykh.spring_mvc_hibernate.entity.Employee;
import ru.podlesnykh.spring_mvc_hibernate.repositories.EmployeeRepositories;

import java.util.List;
import java.util.Optional;

@Service
@Transactional (readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepositories employeeRepositories;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepositories employeeRepositories) {
        this.employeeRepositories = employeeRepositories;
    }

    @Override
    public List<Employee> showAllEmployee() {
        return employeeRepositories.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepositories.findById(id);
        return employee.orElse(null);
    }

    @Transactional
    @Override
    public void save(Employee employee) {
        employeeRepositories.save(employee);
    }

    @Transactional
    @Override
    public void update(int id, Employee updateEmployee) {
        updateEmployee.setId(id);
        employeeRepositories.save(updateEmployee);
    }

    @Transactional
    @Override
    public void delete(int id) {
        employeeRepositories.deleteById(id);
    }


}
