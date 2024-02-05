package practise._04;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: EnemyLife
 * Package: practise._04
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/30 18:15
 * @Version 1.0
 */

/**
 * 加命的接口：
 * 提供加命的行为： 具体实现由水雷潜艇类实现
 */
public interface EnemyLife {
    int getLife();//由实现类来决定返回的逻辑
}
