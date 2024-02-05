package practise._04;

import javax.swing.*;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: ObserverSubmarine
 * Package: practise._04
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/16 18:15
 * @Version 1.0
 */
public class ObserverSubmarine extends SeaObject implements EnemyScore{//侦察潜艇类
    public ObserverSubmarine(){
        super(63,19);
    }

    @Override
    public void step() {
        x+=this.speed;
    }

    @Override
    protected ImageIcon getImage() {
        if(this.isLive()){
            return ImageResources.obsersubm;
        }
        return null;
    }

    @Override
    public int getScore() {
        return 10;
    }
}
