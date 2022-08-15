package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.Level;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelDao extends JpaRepository<Level,Integer> {


}
