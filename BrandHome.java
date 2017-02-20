package com.example.subeksha.shopar;

/**
 * Created by SUBEKSHA on 10/7/16.
 */
public class BrandHome {
    public BrandHome(int img_res,int img2_res, String f_name_home, int image_id, int image2_id, String textView) {
        this.setImg_res(img_res);
        this.setImage_id(image_id);
        this.setImg2_res(img2_res);
        this.setImage2_id(image2_id);
        this.setF_name_home(f_name_home);
        this.setTextView(textView);
    }

    private int img_res;
    private int image_id;
    private int img2_res;
    private int image2_id;
    private String f_name_home;
    private String textView;

    public int getImg_res() {

        return img_res;
    }

    public int getImage_id() {

        return image_id;
    }

    public void setImg_res(
            int img_res) {

        this.img_res = img_res;
    }

    public void setImage_id(int image_id) {

        this.image_id = image_id;
    }

    public int getImg2_res() {

        return img2_res;
    }

    public int getImage2_id() {

        return image2_id;
    }

    public void setImg2_res(
            int img2_res) {

        this.img2_res = img2_res;
    }

    public void setImage2_id(int image2_id) {

        this.image2_id = image2_id;
    }


    public String getF_name_home() {

        return f_name_home;
    }

    public String getTextView() {

        return textView;
    }

    public void setF_name_home(String f_name_home) {

        this.f_name_home = f_name_home;
    }

    public void setTextView(String textView) {

        this.textView = textView;
    }



}


