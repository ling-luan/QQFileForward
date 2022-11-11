package cn.imldy.mirai.console.plugin.pojo;

import java.util.List;

/**
 * @author imldy
 * @date 2022/03/18 17:02
 **/
public class Conf {
    private List<String> patterns;

    private List<Long> sourceGroup;
    private Long targetGroup;

    private String targetPath;

    private String fileTargetPath;

    public List<String> getPatterns() {
        return patterns;
    }

    public void setPatterns(List<String> patterns) {
        this.patterns = patterns;
    }

    public List<Long> getSourceGroup() {
        return sourceGroup;
    }

    public void setSourceGroup(List<Long> sourceGroup) {
        this.sourceGroup = sourceGroup;
    }

    public Long getTargetGroup() {
        return targetGroup;
    }

    public void setTargetGroup(Long targetGroup) {
        this.targetGroup = targetGroup;
    }

    public String getTargetPath() {
        return targetPath;
    }

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    public String getFileTargetPath() {
        return fileTargetPath;
    }

    public void setFileTargetPath(String fileTargetPath) {
        this.fileTargetPath = fileTargetPath;
    }

    @Override
    public String toString() {
        return "Conf{" +
                "patterns=" + patterns +
                ", sourceGroup=" + sourceGroup +
                ", targetGroup=" + targetGroup +
                ", targetPath='" + targetPath + '\'' +
                '}';
    }
}
