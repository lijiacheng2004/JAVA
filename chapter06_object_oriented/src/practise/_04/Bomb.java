package practise._04;

import javax.swing.*;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Bomb
 * Package: practise._04
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/16 18:12
 * @Version 1.0
 */
public class Bomb extends SeaObject{//炸弹类
    public Bomb(int x,int y){//宽高确定，位置不确定
        super(9,12,x,y,3);
    }

    @Override
    public void step() {
        y+=speed;
    }

    @Override
    protected ImageIcon getImage() {//炸弹类重写getImage方法
        if(this.isLive()){//判断当前调用方法的炸弹对象是否是活着的状态
            return ImageResources.bomb;//满足，返回炸弹图片
        }
        return null;//不满足，返回空
    }

    @Override
    public boolean isOut() {//炸弹重写越界标准
        return this.y>=GameWorld.HEIGHT;//炸弹越界标准
    }
}
