package com.spring.transaction.management.repository;

import com.spring.transaction.management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

   /* @Query(
            value =
                    "select e.* "
                            + "from employee e inner join address a "
                            + "on e.id = a.employee_id "
                            + "where e.age > :age",
            nativeQuery = true)
    List<Employee> findEmployeeWithAddress(@Param("age") int age);*/
}
