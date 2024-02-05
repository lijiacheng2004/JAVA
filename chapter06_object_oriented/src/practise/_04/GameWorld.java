package practise._04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: GameWorld
 * Package: practise._04
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/16 18:24
 * @Version 1.0
 */
//GameWorld:游戏运行类
public class GameWorld extends JPanel {//JPanel：底板
    public static final int WIDTH=641;
    public static final int HEIGHT=479;
    public static final int GAME_START=0;//开始状态
    public static final int GAME_RUNNING=1;//运行状态
    public static final int GAME_OVER=2;//结束状态

    public int currentGameState=GAME_START;//默认状态：开始

    //全局变量：
    private final Battleship ship=new Battleship();
    private Bomb[] b={};
    private SeaObject[] submarine={};//代表三种不同的潜艇
    private SeaObject[] thunder={};//代表两种不同的雷

    //为数组赋值一个{},则表示为该数组创建对应的数组对象，但是该数组对象长度为0

    /**
     *创建潜艇对象的方法，该方法由潜艇入场的方法调用
     * 因为这个方法可能随机返回某一种潜艇对象
     * 返回值类型写父类
     */
    private SeaObject createSubmarine(){
        //1.产生0~20 区间的随机整数 并接收
        //2.随机数小于10 返回侦查潜艇
        //  10~14      返回鱼类潜艇
        //  15~20      返回水雷潜艇
        int type=(int)(Math.random()*20);
        if(type<10){
            return new ObserverSubmarine();
        }
        if(type<15){
            return new TorpedoSubmarine();
        }
        else{
            return new MineSubmarine();
        }
    }

    private int submarineEnterIndex=0;//控制潜艇生成速度的变量

    /**
     * 潜艇入场的方法 ----在run中调用
     */
    private void submarineEnterAction(){
        /**
         * 1.用创建潜艇的方法  获取一个潜艇对象(随机)
         * 2.将submarine潜艇数组扩1个容量
         * 3.将获取的潜艇对象赋值给扩容后放的数组位置
         */
        submarineEnterIndex++;
        if(submarineEnterIndex%40==0){//每隔0.4s执行一次生成
            SeaObject obj=this.createSubmarine();
            submarine= Arrays.copyOf(submarine, submarine.length+1);
            submarine[submarine.length-1]=obj;
        }
    }


    private int thunderEnterIndex=0;//控制雷生成速度的变量
    /** 雷入场的方法：--在run中调用
     *
     */
    private void thunderEnterAction(){
        /**
         * 1.循环遍历潜艇数组并调用数组中每个对象的shootThunder方法 接收 获取一个雷对象
         * 如果雷对象不为空，则执行2,3
         * 2.将thunder数组扩1个容量
         * 3.将雷对象赋值给扩容后的位置
         */
        thunderEnterIndex++;
        if(thunderEnterIndex%100==0){//每隔1s生成一次
            for (int i = 0; i < submarine.length; i++) {
                SeaObject obj = submarine[i].shootThunder();
                if (obj != null) {
                    thunder = Arrays.copyOf(thunder, thunder.length + 1);
                    thunder[thunder.length - 1] = obj;
                }
            }
        }
    }

    /**
     * 炸弹入场的方法 ---在按下空格键的if语句中调用
     */
    private void bombEnterAction(){
        /**
         * 1.通过战舰对象调用shootBomb方法，接收炸弹对象
         * 2.为b数组扩1容量
         * 3.将炸弹对象装载到b数组扩容后的位置
         */
        Bomb obj=ship.shootBomb();
        b=Arrays.copyOf(b, b.length+1);
        b[b.length-1]=obj;
    }

    /**
     * 用来处理所有自动移动的操作 ----在run中调用
     */
    private void stepAction(){
        /**
         * 循环每个潜艇数组中每个对象，并调用每个对象的step方法
         * 循环每个雷数组中每个对象，并调用每个对象的step方法
         * 循环每个炸弹数组中每个对象，并调用每个对象的step方法
         */
        for (int i = 0; i < submarine.length; i++) {
            submarine[i].step();
        }
        for (int i = 0; i < thunder.length; i++) {
            thunder[i].step();
        }
        for (int i = 0; i < b.length; i++) {
            b[i].step();
        }
    }

    private void deleteOfOutBounds(){
        /**1.循环遍历潜艇数组中每个对象，并调用每个对象的isOut方法,找出并删除越界对象
         * 2.       雷数组
         * 3.       炸弹数组
         * 4.对数组的最后一个空缩容
         */
        /*
        for (int i = 0; i < submarine.length; i++) {
            if (submarine[i].isOut()||submarine[i].isDead()){//判断当前潜艇对象是否越界 或 死亡
                submarine[i]=submarine[submarine.length-1];//将末尾位置的对象，赋值到越界的对象所在的位置
                submarine=Arrays.copyOf(submarine, submarine.length-1);//缩容
            }
        }

        for (int i = 0; i < thunder.length; i++) {
            if (thunder[i].isOut()||thunder[i].isDead()){
                thunder[i]=thunder[thunder.length-1];//将末尾位置的对象，赋值到越界的对象所在的位置
                thunder=Arrays.copyOf(thunder, thunder.length-1);//缩容
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i].isOut()||b[i].isDead()){
                b[i]=b[b.length-1];//将末尾位置的对象，赋值到越界的对象所在的位置
                b=Arrays.copyOf(b, b.length-1);//缩容
            }
        }
        */
        submarine=deleteObjectByArray(submarine);//调用在数组中删除对象的方法，传入潜艇数组
        thunder=deleteObjectByArray(thunder);//调用在数组中删除对象的方法，传入雷数组
        b=(Bomb[]) deleteObjectByArray(b);//调用在数组中删除对象的方法，传入炸弹数组
    }

    public SeaObject[] deleteObjectByArray(SeaObject[] seaObjects){//删除对象的方法
        for (int i = 0; i < seaObjects.length; i++) {
            if (seaObjects[i].isOut()||seaObjects[i].isDead()){//判断当前潜艇对象是否越界 或 死亡
                seaObjects[i]=seaObjects[seaObjects.length-1];//将末尾位置的对象，赋值到越界的对象所在的位置
                seaObjects=Arrays.copyOf(seaObjects, seaObjects.length-1);//缩容
            }
        }
        return seaObjects;//返回缩容后的数组对象
    }

    /**
     *实现炸弹与潜艇碰撞的检测
     */
    private void bombBangAction(){
        for (int i = 0; i < b.length; i++) {//轮数的循环
            Bomb bomb=b[i];
            for (int j = 0; j < submarine.length; j++) {//次数的循环
                if(bomb.isHit(submarine[j])){//拿当前轮对象依次与潜艇数组的每个对象去检测
                    bomb.goDead();//标记为死亡
                    submarine[j].goDead();//标记为死亡
                    //加分加命
                    //依赖倒置原则：核心逻辑代码，尽可能依赖抽象(抽象类，接口) 而非实现(具体子类)
                    if(submarine[j] instanceof EnemyScore){//如果当前潜艇对象实现了加分的接口！
                        EnemyScore obj=(EnemyScore) submarine[j];//向下强制转型 第二种(接口型)
                        score+=obj.getScore();//调用父执行子
                    } else if (submarine[j] instanceof EnemyLife){//如果当前潜艇对象实现了加命的接口！
                        EnemyLife obj=(EnemyLife) submarine[j];//向下强制转型
                        ship.setLife(obj.getLife());//调用父执子
                    }
                    //1.判断当前潜艇对象是哪个类型？ 侦查潜艇，鱼雷潜艇加分  水雷潜艇加命
                    /*if (submarine[j] instanceof ObserverSubmarine){
                        //代表submarine[j] 这个对象是侦查潜艇类型
                        //但是submarine[j] 这个类型是SeaObject，需要转换成具体的侦查潜艇类型才能调用getScore方法
                        ObserverSubmarine os=(ObserverSubmarine)submarine[j];
                        score+=os.getScore();
                    } else if (submarine[j] instanceof TorpedoSubmarine) {
                    }
                     */
                }
            }
        }
    }

    /**
     * 雷与战舰碰撞检测方法
     */
    private void thunderBangAction(){
        for (int i = 0; i < thunder.length; i++) {
            if(thunder[i].isHit(ship)){//如果当前雷对象与战舰对象撞上了
                thunder[i].goDead();//将当前雷对象标记为死亡
                ship.subtractLife();//战舰减命
                checkGameOver();//检测游戏是否结束
            }
        }
    }

    private void checkGameOver(){
        if(ship.getLife()<=0){//如果战舰命数小于等于0
            currentGameState=GAME_OVER;//切换至游戏结束状态
        }
    }

    private void action(){
        //需要手动移动：战舰通过按下键盘左右移动
        //需要手动生成：炸弹通过按下键盘的空格键生成

        //侦听用户是否按下键盘：
        //1.创建侦听器对象 2.侦听当下键盘的方法
        KeyAdapter adapter=new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {//当按下键盘的方法---在方法中写按下键盘后的响应
//                e.getKeyCode()  获取用户当前按下的键盘码
                if (e.getKeyCode()== KeyEvent.VK_SPACE){//获取按下的键盘码 与 KeyEvent.VK_SPACE 判等
                    if(currentGameState==GAME_START){//如果当前游戏状态是开始状态
                        currentGameState=GAME_RUNNING;//切换为运行状态
                    }else{//否则
                        bombEnterAction();//调用发射炸弹的方法
                    }
                }
                if (e.getKeyCode()== KeyEvent.VK_LEFT){//判断是否按下左键
                    //调用左移方法
                    ship.moveLeft();
                }
                if (e.getKeyCode()== KeyEvent.VK_RIGHT){//判断是否按下右键
                    //调用右移方法
                    ship.moveRight();
                }
            }
        };
        addKeyListener(adapter);//将侦听器对象 添加在键盘检测当中

        Timer timer=new Timer();//创建定时器对象
        //目的：就是想要重写TimeTask抽象类中的run方法
        TimerTask task=new TimerTask() {
            @Override
            public void run() {//run方法：需要执行的代码编写位置
                if(currentGameState==GAME_RUNNING){//---判断当前状态是否为运行状态
                    //调用潜艇入场的方法
                    submarineEnterAction();//调用潜艇入场的方法
                    thunderEnterAction();//调用雷入场的方法
                    stepAction();//调用自动移动的方法
                    bombBangAction();//调用炸弹与潜艇碰撞检测的方法
                    thunderBangAction();//调用雷鱼战舰碰撞检测的方法
                    deleteOfOutBounds();//调用删除越界对象的方法
                    repaint();//重新刷新绘制
                }
            }
        };
        //上面代码块里的内容（task）：是GameWorld的内部类，是TimerTask的子类

        //schedule执行方法： 1.具体任务 2.延时时间(毫秒) 3.距下次执行的时间间隔(ms)
        timer.schedule(task,1000,10);// 任务  延时  周期:0.01s
    }

    /*
     * 绘制窗口的方法 ----在main中调用
     */
    private void paintWorld(){
        JFrame j=new JFrame();//创建画框对象
        this.setFocusable(true);//窗口可聚焦
        j.add(this);//画框添加底板
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//窗口关闭并停止程序
        j.setSize(WIDTH+16, HEIGHT+39);//窗口大小
        j.setLocationRelativeTo(null);//设置窗口位置居中
        j.setVisible(true);//启动窗口
    }

    private int score=0;//分数
    @Override //重写底板类提供的绘制方法，在方法中实现自己的绘制图片的逻辑
              //
    public void paint(Graphics g) {// g --- 理解为画笔
        switch (currentGameState){
            case GAME_START ://如果当前状态是开始状态
                ImageResources.start.paintIcon(null, g,0, 0);//绘制游戏开始画面
                break;
            case GAME_RUNNING://如果当前状态是运行状态
                //绘制战舰图片 ： 1.获取战舰图片 2.根据战舰对象的坐标绘制在窗口中的位置
                ImageResources.sea.paintIcon(null, g, 0, 0);//绘制背景图片
                ship.paintImage(g);
                for(int i=0;i<b.length;i++){
                    b[i].paintImage(g);
                }
                for(int i=0;i<thunder.length;i++){
                    thunder[i].paintImage(g);
                }
                for (int i = 0; i < submarine.length; i++) {
                    submarine[i].paintImage(g);
                }

                g.setFont(new Font("",Font.BOLD,20));//设置画笔的大小与粗细
                g.drawString("SCORE:"+score,200,50);
                g.drawString("LIFE:"+ship.getLife(), 400, 50);
                break;
            case GAME_OVER://如果当前状态是结束状态
                ImageResources.gameover.paintIcon(null, g,0, 0);//绘制游戏结束提图像
                break;
        }
    }

    public static void main(String[] args) {//static方法，无法访问类中普通成员/方法，
                                            // 需要对成员/方法进行static修饰
        GameWorld gw=new GameWorld();
        gw.paintWorld();//调用绘制窗口方法
        gw.action();//通过对象调用action方法
    }
}

/*
 * 1.为什么要将各类型变量的声明放在main的外面？
 * 答：因为main是一个方法，方法中声明的变量只能在该方法中使用，但后期该类中很多功能方法都需要用到这些类，
 * 所以讲个类型变量声明的工作，放在类中，做全局变量
 * 2.为什么要单独写一个action方法，来进行创建对象？
 *答：因为main是static型方法，比较特殊，是无法直接访问类中普通成员/方法的，所以要创建一个普通方法，
 * 在普通方法中，完成对创建对象
 * 3.为什么要在main中创建GameWorld类对象调用action方法
 *答：因为main是一个static方法，不能直接访问类中普通成员/方法，我们通过创建当前类的对象，
 * 通过打点调用，来调用action方法
 */

/**
 * 游戏交互逻辑：
 * 1.深水炸弹与潜艇碰撞
 *   炸弹打到水雷潜艇，+1命  炸弹与水雷潜艇消失
 *   炸弹打到鱼雷潜艇，+40分  炸弹与鱼雷潜艇消失
 *   炸弹打到巡逻潜艇，+10分  炸弹与巡逻潜艇消失
 * 2.鱼雷/水雷与战舰碰撞 战舰-1命，雷消失
 */
