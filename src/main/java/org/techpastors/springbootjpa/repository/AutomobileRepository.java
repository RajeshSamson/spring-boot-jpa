package org.techpastors.springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.techpastors.springbootjpa.model.Automobile;

public interface AutomobileRepository extends JpaRepository<Automobile, Long> {

    // select * from automoblie where car_name= ?
    Automobile findByCarName(String name);
}
