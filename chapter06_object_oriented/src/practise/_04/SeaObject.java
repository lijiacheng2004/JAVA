package practise._04;

import javax.swing.*;
import java.awt.*;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: SeaObject
 * Package: practise._04
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/18 13:08
 * @Version 1.0
 */
//海洋对象类，放7个模板类中共有的属性和行为
//构造方法，不可以被继承
public abstract class SeaObject {
    public static final int LIVE=0;//活着的状态
    public static final int DEAD=1;//死亡的状态
    public int currentState=LIVE; //当前状态 (默认是活着)

    protected int width;
    protected int height;
    protected int x;
    protected int y;
    protected int speed;

    //潜艇的构造方法：
    protected SeaObject(int width,int height){//构造方法不可以被继承
        this.width=width;
        this.height=height;
        this.x=-width;
        this.y=(int)(Math.random()*(GameWorld.HEIGHT-height-150)+150);//随机产生y值在海中
        this.speed=(int)(Math.random()*(3-1)+1);//随机两种速度：2 3
    }

    /*
    该构造方法是专门为战舰类/炸弹类/水雷类/鱼雷类提供的构造方法
    因为这四个类赋值的内容不同，则做成5个形式参数的构造方法
    具体数据有调用的类来实现即可
     */
    protected SeaObject(int width,int height,int x,int y,int speed){
        this.width=width;
        this.height=height;
        this.x=x;
        this.y=y;
        this.speed=speed;
    }

    public boolean isLive(){
        return currentState==LIVE;//判断当前对象的状态是否是活着
    }
    public boolean isDead(){
        return currentState==DEAD;//判断当前对象的状态是否是死亡
    }

    //protected void step(){
    //    System.out.println("海洋对象在移动..."); 父类方法无法被子类复用
    //}                                          要将其变为抽象方法
    protected abstract void step();//抽象方法不能有方法体 且只能存在于抽象类中

    protected abstract ImageIcon getImage();//抽象的获取图片的方法，由子类实现该行为细节

    public void paintImage(Graphics g){// g :画笔
        ImageIcon icon=this.getImage();//获取当前调用方法对象的图片
        if(icon!=null){//若不为空
            icon.paintIcon(null, g,this.x,this.y);//进行绘制
        }
    }

    /**
     * 发射雷对象的方法，由雷入场的方法进行调用
     * 如果是水雷潜艇调用，则返回水雷对象
     * 如果是鱼类潜艇调用，则返回鱼雷对象
     *
     */
    public SeaObject shootThunder(){
        int x=this.x+this.width;
        int y=this.y-5;
        //判断类型语法：instanceof
        if(this instanceof MineSubmarine){//判断当前对象是不是 MineSubmarine
            return new Mine(x,y);//水雷
        }
        else if(this instanceof TorpedoSubmarine){
            return new Torpedo(x,y);//鱼雷
        }
        else return null;
    }

    /**
     * 判断对象是否越界的方法：
     * 因为三个潜艇类越界标准是一样的，所以可以做成普通方法
     *    剩下的炸弹类 鱼雷类 水雷类不适用 自行重写方法
     * @return
     */
    public boolean isOut(){//判断是否越界
        return this.x>=GameWorld.WIDTH;
    }

    /**
     * 供子类使用的碰撞检测方法
     */
    public boolean isHit(SeaObject other){
        int x1=this.x-other.width;
        int x2=this.x+this.width;
        int y1=this.y-other.height;
        int y2=this.y+this.height;
        int x= other.x;//将传入参与碰撞对象的x 赋值给 x
        int y= other.y;//将传入参与碰撞对象的y 赋值给 y
        return (x>=x1&&x<=x2&&y>=y1&&y<=y2);
    }

    public void goDead(){//谁调用我，谁标记为死亡状态
        this.currentState=DEAD;
    }
}
//1.如果实现了继承，当子类被创建对象时，子类的构造方法会先去执行父类的构造方法的内容，再执行自己的构造方法内容
