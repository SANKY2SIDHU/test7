package com.example.test7;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

public class Bullet {

    int x,y,width,height;
    Bitmap bullet;
    Bullet(Resources res){

        bullet = BitmapFactory.decodeResource(res,R.drawable.bullet);

        width = bullet.getWidth();
        height = bullet.getHeight();

        width=width/4;
        height = height/4;

        bullet = Bitmap.createScaledBitmap(bullet,width,height,false);

    }
    Rect getCollisionshape(){
        return new Rect(x,y,x+width,y+height);
    }
}
