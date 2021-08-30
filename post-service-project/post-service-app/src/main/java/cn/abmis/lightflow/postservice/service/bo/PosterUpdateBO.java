package cn.abmis.lightflow.postservice.service.bo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 推文更新 BO
 */
@Data
@Accessors(chain = true)
public class PosterUpdateBO {

    /**
     * 推文id
     */
    private Integer id;
    /**
     * 外部链接
     */
    private String url;
    /**
     * 推文标题
     */
    private String title;
    /**
     * 推文内容
     */
    private String content;
    /**
     * 推文类型
     */
    private Integer type;

}
