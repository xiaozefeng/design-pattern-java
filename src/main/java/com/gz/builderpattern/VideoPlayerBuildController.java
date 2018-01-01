package com.gz.builderpattern;

/**
 * @author xiaozefeng
 */
public class VideoPlayerBuildController {
    private VideoPlayerBuilder builder;

    public VideoPlayerBuildController(VideoPlayerBuilder builder){
        this.builder = builder;
    }

    public VideoPlayer construct(){
        builder.buildControlBar();
        builder.buildMainWindow();
        builder.buildCollectList();
        if (!builder.isTidyModel()) {
            builder.buildPlayList();
            builder.buildMenu();
        }
        return builder.getResult();
    }
}
