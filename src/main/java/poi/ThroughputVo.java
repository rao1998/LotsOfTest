package poi;
/**
 * @Author: wangruiguo
 * @Date: 2019/9/16 20:42
 */
public class ThroughputVo {


    private String originalUrl;


    private Long sumProjectId;

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    @Override
    public String toString() {
        return "ThroughputVo{" +
                "originalUrl='" + originalUrl + '\'' +
                ", sumProjectId=" + sumProjectId +
                '}';
    }

    public Long getSumProjectId() {
        return sumProjectId;
    }

    public void setSumProjectId(Long sumProjectId) {
        this.sumProjectId = sumProjectId;
    }
}
