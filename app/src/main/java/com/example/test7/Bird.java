package com.example.test7;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

public class Bird {

    public int speed=20;
    public boolean wasShot = true;
    int x=0,y,width,height,birdcounter=1;
    Bitmap bird1,bird2,bird3,bird4;

    Bird (Resources res){

        bird1 = BitmapFactory.decodeResource(res,R.drawable.bird1);
        bird2 = BitmapFactory.decodeResource(res,R.drawable.bird2);
        bird3 = BitmapFactory.decodeResource(res,R.drawable.bird3);
        bird4 = BitmapFactory.decodeResource(res,R.drawable.bird4);

        width=bird1.getWidth();
        height=bird1.getHeight();
        width=width/6;
        height=height/6;

        bird1 = Bitmap.createScaledBitmap(bird1,width,height,false);
        bird2 = Bitmap.createScaledBitmap(bird2,width,height,false);
        bird3 = Bitmap.createScaledBitmap(bird3,width,height,false);
        bird4 = Bitmap.createScaledBitmap(bird4,width,height,false);
        y= -height;

    }

    Bitmap getBird(){
        if(birdcounter==1){
            birdcounter++;
            return bird1;
        }
        if(birdcounter==2){
            birdcounter++;
            return bird2;
        }
        if(birdcounter==3){
            birdcounter++;
            return bird3;
        }
        birdcounter=1;
        return bird4;
    }

    Rect getCollisionshape(){
        return new Rect(x,y,x+width,y+height);
    }
}
