package org.techpastors.springbootjpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "automobile")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Automobile {

    @Id
    private long id;

    @Column(name = "car_name")
    private String carName;

    private String type;
}