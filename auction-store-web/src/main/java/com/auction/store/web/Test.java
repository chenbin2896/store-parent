package com.auction.store.web;

public class Test {
    public static void main(String[] args) {
        String os_key = "你好";
        String sql = " INSERT INTO \"fd_content_client_user_"+os_key+"\" (\"uid\", \"type\", \"guid\", \"user_name\", \"real_name\", \"id_card\", \"icon\", \"mobile\", \"gender\", \"email\", \"birth\", \"location\", \"pwd\", \"secret_key\", \"check_status\", \"is_enterprise_vip\", \"open_id\", \"lite_open_id\", \"work_id\", \"union_id\", \"register_time\", \"finish_time\", \"dept_id\", \"post_id\", \"access_3rd_uid\", \"emp_no\", \"login_time\", \"view_count\", \"up_count\", \"comment_count\", \"dislike_count\", \"at_count\", \"follow_count\", \"login_total\", \"collect_count\", \"user_type\", \"app_open_id\", \"education\", \"political_status\", \"promote_direction\", \"is_leader\", \"ext\") VALUES ('2', 2, NULL, '管理员', '管理员', NULL, 'http://res.botbrain.ai/zhiyu/img/admin.jpg', '1500000000', 'F', NULL, NULL, NULL, NULL, 'H9EX7eyaPqLZvWHjagJeJ4BpgapY', 3, 'f', 'open_id', 'lite_open_id', 'work_id', 'union_id', 1548170627043, 1548170627043, NULL, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 47, 0, 0, 0, 1, NULL, NULL, NULL, NULL, 2, NULL)";
        System.out.println(sql);
    }
}
