package com.Example;

public class example {
    private int width;
    private int height;
//    public example (){} không cần có hàm tạo vẫn gọi được hàm sum
    public  int sum (int width,int height){
        return width+height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
