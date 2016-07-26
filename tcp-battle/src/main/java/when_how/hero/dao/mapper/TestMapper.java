package when_how.hero.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import when_how.hero.dao.entity.Test;

public interface TestMapper {

	public List<Test> test();

	public int insertTest2(@Param("userId") long user_id, @Param("couponId") String coupon_id, @Param("orderId") long order_id, @Param("status") int status);
	
}
