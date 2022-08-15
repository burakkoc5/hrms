package com.burak.hrms.dataAccess.abstracts;

import com.burak.hrms.entities.concretes.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillDao extends JpaRepository<Skill,Integer> {

    List<Skill> getSkillsByResume_Id(int skillId);
}
