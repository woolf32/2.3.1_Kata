package ru.podlesnykh.spring_mvc_hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.podlesnykh.spring_mvc_hibernate.entity.Employee;

@Repository
public interface EmployeeRepositories extends JpaRepository<Employee, Integer> {
}
