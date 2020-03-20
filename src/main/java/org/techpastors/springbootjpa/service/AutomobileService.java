package org.techpastors.springbootjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techpastors.springbootjpa.model.Automobile;
import org.techpastors.springbootjpa.repository.AutomobileRepository;

import java.util.List;

@Service
public class AutomobileService {

    private final AutomobileRepository repository;

    public AutomobileService(AutomobileRepository repository) {
        this.repository = repository;
    }

    public List<Automobile> getAllAutomobiles() {
        //select * from Automobile
        return repository.findAll();
    }

    public Automobile getFindByCarName(String name) {
        //select * from Automobile
        return repository.findByCarName(name);
    }

    public void create(Automobile automobile) {
        // insert into Automobile(id,name,type) value()
        repository.save(automobile);
    }
}
