import project.util.FfmpegDevideVideo;
import project.util.VideoFileOperate;

import java.io.File;
import java.io.IOException;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-06-15 23:28
 **/
public class Test2 {

    public static final String VIDEO_PATH = "/Users/gaohanghang/1.mp4";
    public static final String OUTPUT_PATH = "/Users/gaohanghang/file";

    public static void main(String[] args) throws Exception {

        String videoTime = FfmpegDevideVideo.getVideoTime(new File(VIDEO_PATH));

        System.out.println(videoTime);

        VideoFileOperate videoFileOperate = new VideoFileOperate();
        videoFileOperate.cutVideo(VIDEO_PATH, 140);
    }

}
