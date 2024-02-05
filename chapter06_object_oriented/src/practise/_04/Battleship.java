package practise._04;

import javax.swing.*;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Battleship
 * Package: practise._04
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/16 18:10
 * @Version 1.0
 */
public class Battleship extends SeaObject{//战舰
    private int life;//战舰独有
    public int getLife(){
        return life;
    }
    public void setLife(int life){
        if(life>0){
            this.life+=life;
        }
    }

    public void subtractLife(){
        this.life--;
    }
    public Battleship(){//战舰只有一个，故只需要无参构造一个对象即可
        super(66,26,270,124,20);
        life=5;
    }

    @Override
    public void step() {
        System.out.println("战舰类通过键盘左右移动...");
    }

    @Override
    protected ImageIcon getImage() {
        return ImageResources.battleship;
    }

    /**
     *战舰类提供发射炸弹的行为方法
     * @return
     */
    public Bomb shootBomb(){
        return new Bomb(this.x,this.y);
    }

    public void moveLeft(){
        this.x-=speed;
    }
    public void moveRight(){
        this.x+=speed;
    }

}
