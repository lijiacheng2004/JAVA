package practise._04;

import javax.swing.*;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Torpedo
 * Package: practise._04
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/16 18:22
 * @Version 1.0
 */
public class Torpedo extends SeaObject{//鱼雷类
    public Torpedo(int x,int y){
        super(5,19,x,y,2);
    }

    @Override
    public void step() {
        y-=this.speed;
    }

    @Override
    protected ImageIcon getImage() {
        if(this.isLive()){
            return ImageResources.torpedo;
        }
        return null;
    }

    @Override
    public boolean isOut() {
        return this.y<=-this.height;//鱼雷越界的标准
    }
}
