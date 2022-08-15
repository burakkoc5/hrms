package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Integer> {
}
