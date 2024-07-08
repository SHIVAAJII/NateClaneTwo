package com.example.ndemo2;

public class ClassForAddTwoItem
{

    int image;
    String name;

    public ClassForAddTwoItem(int image, String name)
    {
        this.image=image;
        this.name=name;

        getImage();
        getName();
    }

    public int getImage()
    {
        return image;
    }
    public String getName()
    {
        return name;
    }
}
