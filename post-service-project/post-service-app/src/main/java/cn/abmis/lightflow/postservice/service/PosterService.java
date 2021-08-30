package cn.abmis.lightflow.postservice.service;

import cn.abmis.lightflow.postservice.dal.mysql.dataobject.PosterDO;
import cn.abmis.lightflow.postservice.service.bo.PosterBO;
import cn.abmis.lightflow.postservice.service.bo.PosterCreateBO;
import cn.abmis.lightflow.postservice.service.bo.PosterUpdateBO;

public interface PosterService {

    PosterDO getPoster(Integer id);

    PosterBO addPoster(PosterCreateBO poster);

    void updatePoster(PosterUpdateBO poster);

}
