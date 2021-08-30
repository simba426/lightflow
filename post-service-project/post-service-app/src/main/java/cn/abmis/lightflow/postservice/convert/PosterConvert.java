package cn.abmis.lightflow.postservice.convert;

import cn.abmis.lightflow.postservice.dal.mysql.dataobject.PosterDO;
import cn.abmis.lightflow.postservice.service.bo.PosterBO;
import cn.abmis.lightflow.postservice.service.bo.PosterCreateBO;
import cn.abmis.lightflow.postservice.service.bo.PosterUpdateBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PosterConvert {

    PosterConvert INSTANCE = Mappers.getMapper(PosterConvert.class);

    PosterDO convert(PosterCreateBO bean);

    PosterDO convert(PosterUpdateBO bean);

    PosterBO convert(PosterDO bean);

}
