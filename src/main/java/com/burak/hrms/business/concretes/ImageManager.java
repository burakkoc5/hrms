package com.burak.hrms.business.concretes;

import com.burak.hrms.business.abstracts.ImageService;
import com.burak.hrms.business.abstracts.UserService;
import com.burak.hrms.core.utilities.results.*;
import com.burak.hrms.dataAccess.abstracts.ImageDao;
import com.burak.hrms.entities.concretes.Image;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.util.Map;

@Service
public class ImageManager implements ImageService {

    private ImageDao imageDao;
    private UserService userService;

    @Autowired
    public ImageManager(ImageDao imageDao,UserService userService) {
        this.imageDao = imageDao;
        this.userService = userService;
    }

    @Override
    public Result add(Image image) {
        imageDao.save(image);
        return new SuccessResult("Başarılı");
    }

    @SneakyThrows
    @Override
    public Result upload(int userId, MultipartFile file){

        DataResult<Image> userImage= getByUserId(userId);

        if (userImage.getData() == null){

        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "di0fsooiy",
                "api_key", "245135233135583",
                "api_secret", "TK-z13lpoqpAruVTGTisWGFspDM"));

            Map<?, ?> uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
            //Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());

            Image image = new Image();
            //image.setId(0);
            image.setUser(userService.getById(userId).getData());
            //System.out.println(uploadResult.get("url").toString());
            image.setImageUrl(uploadResult.get("url").toString());
            //System.out.println(image.getId());

            return add(image);

        }


        return new ErrorResult("Bir kullanıcı en fazla 1 fotoğrafa sahip olabilir.\nYeni bir fotoğraf yüklemek yerine güncelle seçeneğini deneyiniz.");
    }

    @Override
    public DataResult<Image> getByUserId(int userId) {
        return new SuccessDataResult<>(imageDao.getByUser_Id(userId),"Başarılı");
    }
}
