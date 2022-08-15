package com.burak.hrms.business.abstracts;

import com.burak.hrms.core.utilities.results.DataResult;
import com.burak.hrms.core.utilities.results.Result;
import com.burak.hrms.entities.concretes.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageService{

    Result add(Image image);

    Result upload(int userId, MultipartFile file);

    DataResult<Image> getByUserId(int userId);

}