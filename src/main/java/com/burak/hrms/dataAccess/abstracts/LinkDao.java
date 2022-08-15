package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkDao extends JpaRepository<Link,Integer> {

    List<Link> getLinksByResume_Id(int resumeId);
}
