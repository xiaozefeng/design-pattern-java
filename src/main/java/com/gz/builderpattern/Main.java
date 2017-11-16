package com.gz.builderpattern;

/**
 * @author xiaozefeng
 */
public class Main {
    public static void main(String[] args) {
        //VideoPlayerBuilder builder = new TidyModelVideoPlayerBuilder();
        VideoPlayerBuilder builder = new FullModelVideoPlayerBuilder();
        VideoPlayerBuildController controller = new VideoPlayerBuildController(builder);
        VideoPlayer result = controller.construct();
        System.out.println(result);
    }
}
