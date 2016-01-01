package com.myadvocate.model;

/**
 * Created by rahul.sachan on 21/12/15.
 */
public class AdvocateCategory {

    private String categoryName;
    private String imageName;
    private int is_display;

    public AdvocateCategory(String categoryName, String imageName, int is_display){
        this.categoryName = categoryName;
        this.imageName = imageName;
        this.is_display = is_display;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }


}
