package cn.abmis.lightflow.postservice.dal.mysql.dataobject;

import cn.abmis.lightflow.mybatis.core.dataobject.DeletableDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 推文
 *
 */
@Data
@TableName("poster")
@Accessors(chain = true)
public class PosterDO extends DeletableDO {
    // ------推文基本信息-------
    /**
     * 编号-主键
     */
    private Integer id;
    /**
     * 推送人ID
     */
    private String authorId;
    /**
     * 频道ID
     */
    private Integer channelId;
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
