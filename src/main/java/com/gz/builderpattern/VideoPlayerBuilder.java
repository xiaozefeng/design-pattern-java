package com.gz.builderpattern;

/**
 * @author xiaozefeng
 */
public abstract class VideoPlayerBuilder {
    protected  VideoPlayer player = new VideoPlayer();

    /**
     * 构建菜单
     */
    abstract void buildMenu();

    /**
     * 构建播放列表
     */
    abstract void buildPlayList();

    /**
     * 构建主窗口
     */
    abstract void buildMainWindow();

    /**
     * 构建控制条
     */
    abstract void buildControlBar();

    /**
     * 构建收藏列表
     */
    abstract void buildCollectList();

    /**
     * 获取构建结果
     *
     * @return
     */
    abstract VideoPlayer getResult();

    /**
     *
     * @return
     */
    public boolean isTidyModel(){
        return false;
    }
}
