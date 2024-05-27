package com.services.services.services.interfaces;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageRecognitionService {
    String recognizeObject(MultipartFile image);
    List<String> recognizeMultipleObjects(List<MultipartFile> images);

}
