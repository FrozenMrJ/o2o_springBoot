package com.imooc.o2o.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ImageHolder {
    private String imageName;
    private File image;
}
