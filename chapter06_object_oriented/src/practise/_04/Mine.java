package practise._04;

import javax.swing.*;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Mine
 * Package: practise._04
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/16 18:20
 * @Version 1.0
 */
public class Mine extends SeaObject{//水雷类
    public Mine(int x,int y){
        super(11,11,x,y,2);
    }

    @Override
    public void step() {
        y-=this.speed;
    }

    @Override
    protected ImageIcon getImage() {
        if(this.isLive()){
            return ImageResources.mine;
        }
        return null;
    }

    @Override
    public boolean isOut() {
        return this.y<=150-this.height;//水雷越界标准
    }
}
