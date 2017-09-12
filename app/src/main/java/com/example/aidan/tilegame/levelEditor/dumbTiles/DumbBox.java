package com.example.aidan.tilegame.levelEditor.dumbTiles;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;

import com.example.aidan.tilegame.Overlay;
import com.example.aidan.tilegame.ParticleManager;
import com.example.aidan.tilegame.Tile;
import com.example.aidan.tilegame.levelEditor.LevelEditor;

public class DumbBox extends Tile {
    private double oldX,oldY;
    private Bitmap scaledTexture;
    public DumbBox(int xPos, int yPos,Bitmap img) {
        super(xPos, yPos,img);
        oldX=xPos;
        oldY=yPos;
        scaledTexture = Bitmap.createScaledBitmap(super.getTexture(),(int)(LevelEditor.getPlayingField().height()/LevelEditor.getTilesInLevel()*LevelEditor.getSizeMultiplier()),(int)(LevelEditor.getPlayingField().height()/LevelEditor.getTilesInLevel()*LevelEditor.getSizeMultiplier()),false);
    }

    public void paint(Canvas canvas, Paint paint){
        paint.reset();
        canvas.drawBitmap(scaledTexture,(int)oldX*LevelEditor.getPlayingField().height()/LevelEditor.getTilesInLevel()/30+LevelEditor.getPlayingField().left,(int)oldY*LevelEditor.getPlayingField().height()/LevelEditor.getTilesInLevel()/30+LevelEditor.getPlayingField().top,paint);
    }

    @Override
    public void pushLeft() {

    }

    @Override
    public void pushRight() {

    }

    @Override
    public void pushUp() {

    }

    @Override
    public void pushDown() {

    }

    @Override
    public void update() {

    }

    @Override
    public boolean isMoving() {
        return false;
    }

    @Override
    public void updateSize() {
        scaledTexture = Bitmap.createScaledBitmap(super.getTexture(),(int)(LevelEditor.getPlayingField().height()/LevelEditor.getTilesInLevel()*LevelEditor.getSizeMultiplier()),(int)(LevelEditor.getPlayingField().height()/LevelEditor.getTilesInLevel()*LevelEditor.getSizeMultiplier()),false);
    }


    @Override
    public Bitmap getScaledTexture() {
        return null;
    }
}

