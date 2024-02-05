package practise._04;

import javax.swing.*;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: MineSubmarine
 * Package: practise._04
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/16 18:19
 * @Version 1.0
 */
public class MineSubmarine extends SeaObject implements EnemyLife{//水雷潜艇类
    public MineSubmarine(){
        super(63,19);
    }

    //对父类中方法的重写
    @Override
    public void step() {
        x+=this.speed;
    }

    @Override
    protected ImageIcon getImage() {
        if(this.isLive()){
            return ImageResources.minesubm;
        }
        return null;
    }

    //对接口中方法的重写
    @Override
    public int getLife() {
        return 1;
    }
}
