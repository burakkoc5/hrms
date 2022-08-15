package com.burak.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.burak.hrms.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image,Integer> {
    Image getByUser_Id(int userId);


}
