package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.LinkName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkNameDao extends JpaRepository<LinkName,Integer> {

    //List<Link> getLinksByResumeId(int linkId);
}
