package practise._04;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: EnemyScore
 * Package: practise._04
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/30 18:19
 * @Version 1.0
 */

/**
 * 加分的接口
 * 提供加分的行为 ----由侦查潜艇 鱼雷潜艇实现
 */
public interface EnemyScore {
    int getScore();//由实现类来重写该返回的分数
}
