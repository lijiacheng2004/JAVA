package practise._04;

import javax.swing.*;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: TorpedoSubmarine
 * Package: practise._04
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/16 18:17
 * @Version 1.0
 */
public class TorpedoSubmarine extends SeaObject implements EnemyScore{//鱼雷潜艇类
    public TorpedoSubmarine(){
        super(64,10);
    }

    @Override
    public void step() {
        x+=this.speed;
    }

    @Override
    protected ImageIcon getImage() {
        if(this.isLive()){
            return ImageResources.torpesubm;
        }
        return null;
    }

    @Override
    public int getScore() {
        return 40;
    }
}
