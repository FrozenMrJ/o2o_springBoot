package com.imooc.o2o.util;

public class PathUtil {
    private static String seperator = System.getProperty("file.separator");

    /**
     * 返回项目图片的根路径
     * @return
     */
    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath;
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/MrJ's Documents/image";
        } else {
            basePath = "/home/image/";
        }
        basePath = basePath.replace("/",seperator);
        return basePath;
    }

    /**
     * 相对路径，不变的
     * @param shopId
     * @return
     */
    public static String getShopImagePath(long shopId) {
        String imagePath = "/upload/item/shop/" + shopId + "/";
        return imagePath.replace("/", seperator);
    }
    public static String getHeadLineImagePath() {
        String imagePath = "/upload/images/item/headtitle/";
        return imagePath.replace("/", seperator);
    }
    public static String getShopCategoryPath() {
        String imagePath = "/upload/images/item/shopcategory/";
        return imagePath.replace("/", seperator);
    }
}
