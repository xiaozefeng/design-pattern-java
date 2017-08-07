package com.gz.builderpattern;

public class VideoPlayer {
    private String menu;

    private String playList;

    private String mainWindow;

    private String controlBar;

    private String collectList;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }

    public String getCollectList() {
        return collectList;
    }

    public void setCollectList(String collectList) {
        this.collectList = collectList;
    }

    @Override
    public String toString() {
        return "VideoPlayer{" +
                "menu='" + menu + '\'' +
                ", playList='" + playList + '\'' +
                ", mainWindow='" + mainWindow + '\'' +
                ", controlBar='" + controlBar + '\'' +
                ", collectList='" + collectList + '\'' +
                '}';
    }
}
