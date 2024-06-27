package ru.podlesnykh.spring_mvc_hibernate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.podlesnykh.spring_mvc_hibernate.dao.EmployeeDAO;
import ru.podlesnykh.spring_mvc_hibernate.entity.Employee;


import java.util.List;


@Service
@Repository
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> showAllEmployee() {
        return employeeDAO.showAllEmployee();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Transactional
    @Override
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Transactional
    @Override
    public void update(int id, Employee updateEmployee) {
        employeeDAO.update(id, updateEmployee);
    }

    @Transactional
    @Override
    public void delete(int id) {
        employeeDAO.delete(id);
    }


}
