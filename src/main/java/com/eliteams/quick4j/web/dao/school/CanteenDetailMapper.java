package com.eliteams.quick4j.web.dao.school;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.web.model.school.CanteenDetail;

/**
 * Created by mi on 18-5-9.
 */
public interface CanteenDetailMapper extends GenericDao<CanteenDetail, Long> {

    CanteenDetail selectByCanteenId(String canteenId);
}

