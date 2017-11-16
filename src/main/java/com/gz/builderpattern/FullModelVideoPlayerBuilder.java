package com.gz.builderpattern;

/**
 * @author xiaozefeng
 */
public class FullModelVideoPlayerBuilder extends VideoPlayerBuilder{

    @Override
    public void buildMenu() {
        player.setMenu("菜单");
    }

    @Override
    public void buildPlayList() {
        player.setPlayList("播放列表");
    }

    @Override
    public void buildMainWindow() {
        player.setMainWindow("主窗口");
    }

    @Override
    public void buildControlBar() {
        player.setControlBar("控制条");
    }

    @Override
    public void buildCollectList() {
        player.setCollectList("收藏列表");
    }

    @Override
    public VideoPlayer getResult() {
        return player;
    }
}
