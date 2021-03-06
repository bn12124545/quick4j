package com.eliteams.quick4j.web.dao.school;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.web.model.school.SellerDetail;

import java.util.List;

/**
 * Created by mi on 18-5-9.
 */
public interface SellerDetailMapper  extends GenericDao<SellerDetail, Long> {

    SellerDetail selectBySellerId(String sellerId);

    List<SellerDetail> getSellersBySchool(String schoolId);
}
