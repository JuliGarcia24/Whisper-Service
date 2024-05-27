package com.services.services.services;

import com.services.services.services.interfaces.IImageRecognitionService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class ImageRecognitionService implements IImageRecognitionService {

    @Override
    public String recognizeObject(MultipartFile image) {
        return null;
    }

    @Override
    public List<String> recognizeMultipleObjects(List<MultipartFile> images) {
        return null;
    }
}
