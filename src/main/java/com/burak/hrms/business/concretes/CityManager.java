package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.CityService;
import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.core.utilities.results.SuccessDataResult;
import com.burak.hrms.core.utilities.results.SuccessResult;
import com.burak.hrms.dataAccess.abstracts.CityDao;
import com.burak.hrms.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {

    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }


    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(cityDao.findAll(),"Tüm şehirler getirildi");
    }

    @Override
    public Result add(City city) {
        cityDao.save(city);
        return new SuccessResult("Şehir eklendi");
    }
}
