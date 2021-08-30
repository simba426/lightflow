package cn.abmis.lightflow.postservice.dal.mysql.mapper;

import cn.abmis.lightflow.postservice.convert.PosterConvert;
import cn.abmis.lightflow.postservice.dal.mysql.dataobject.PosterDO;
import cn.abmis.lightflow.postservice.service.bo.PosterCreateBO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface PosterMapper extends BaseMapper<PosterDO> {

    default PosterDO selectById(Integer id) {
        return selectOne(new QueryWrapper<PosterDO>()
                .eq("id", id)
        );
    }

}
