package cn.abmis.lightflow.postservice.service.impl;

import cn.abmis.lightflow.postservice.convert.PosterConvert;
import cn.abmis.lightflow.postservice.dal.mysql.dataobject.PosterDO;
import cn.abmis.lightflow.postservice.dal.mysql.mapper.PosterMapper;
import cn.abmis.lightflow.postservice.service.PosterService;
import cn.abmis.lightflow.postservice.service.bo.PosterBO;
import cn.abmis.lightflow.postservice.service.bo.PosterCreateBO;
import cn.abmis.lightflow.postservice.service.bo.PosterUpdateBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PosterServiceImpl implements PosterService {

    @Autowired
    private PosterMapper posterMapper;

    @Override
    public PosterDO getPoster(Integer id) {
        return posterMapper.selectById(id);
    }

    @Override
    public PosterBO addPoster(PosterCreateBO posterBO) {
        PosterDO posterDO = (PosterDO) PosterConvert.INSTANCE.convert(posterBO)
                .setCreateTime(new Date())
                .setUpdateTime(new Date());
        // 保存推文
        posterMapper.insert(posterDO);
        return PosterConvert.INSTANCE.convert(posterDO);
    }

    @Override
    public void updatePoster(PosterUpdateBO posterBO) {
        // 检查推文是否存在
        PosterDO posterDO = posterMapper.selectById(posterBO.getId());
        if (posterDO == null) {
            //TODO 抛出业务异常
        }
        PosterDO updatePoster = (PosterDO) PosterConvert.INSTANCE.convert(posterBO)
                .setUpdateTime(new Date());
        posterMapper.updateById(updatePoster);
    }

}
