package com.mybatis.domain;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
public class OrderSqlProvider {

    public String selectAll() {
        return new SQL(){
            {
                SELECT_DISTINCT("O.*");
                FROM("`ORDER` AS O");
                LEFT_OUTER_JOIN("CUSTOMER AS C ON O.CUSTOMER_ID=C.ID");
                INNER_JOIN("ORDER_GOOD AS OG ON O.ID=OG.ORDER_ID");
                INNER_JOIN("GOOD AS G ON OG.GOOD_ID=G.ID");
            }
        }.toString();
    }
}
