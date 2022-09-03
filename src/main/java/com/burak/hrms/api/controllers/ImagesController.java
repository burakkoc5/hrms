package com.burak.hrms.api.controllers;

import com.burak.hrms.business.abstracts.ImageService;
import com.burak.hrms.core.utilities.results.*;
import com.burak.hrms.entities.concretes.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/api/images")
@CrossOrigin
public class ImagesController {

    private ImageService imageService;

    @Autowired
    public ImagesController(ImageService imageService) {
        this.imageService = imageService;
    }


    @PostMapping("/addImage")

    public Result upload(@RequestParam int userId,@RequestPart(value = "file", required=false) MultipartFile file){
        return imageService.upload(userId,file);
    }

    @GetMapping("/getImageByUserId")
    public DataResult<Image> getByUserId(@RequestParam int userId) {
        return imageService.getByUserId(userId);
    }


}
