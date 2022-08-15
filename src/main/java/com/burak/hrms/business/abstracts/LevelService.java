package com.burak.hrms.business.abstracts;



import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Level;

import java.util.List;

public interface LevelService {

    Result add(Level level);

    DataResult<List<Level>> getAll();
}
