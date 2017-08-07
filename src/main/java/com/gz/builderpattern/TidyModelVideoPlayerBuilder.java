package com.gz.builderpattern;

public class TidyModelVideoPlayerBuilder extends VideoPlayerBuilder {
    @Override
    void buildMenu() {
        player.setMenu("菜单");
    }

    @Override
    void buildPlayList() {
        player.setPlayList("播放列表");
    }

    @Override
    void buildMainWindow() {
        player.setMainWindow("主窗口");
    }

    @Override
    void buildControlBar() {
        player.setControlBar("控制条");
    }

    @Override
    void buildCollectList() {
        player.setCollectList("收藏列表");
    }

    @Override
    VideoPlayer getResult() {
        return player;
    }

    @Override
    public boolean isTidyModel() {
        return true;
    }
}
