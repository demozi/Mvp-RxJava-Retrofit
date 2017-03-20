package com.example.wujian.mvp_rxjava_retrofit.entity;

import java.util.List;
import java.util.Map;

/**
 * Created by wujian on 2016/9/30.
 */

public class PinTuanStatus {


    public String act_state;
    public int win_limit;
    public int now_people;
    public int leave_people;
    public String leave_time;
    public String act_end_time;
    public int leave_time_dist;
    public int has_join;
    public ActSuccessTimeBean act_success_time;
    public ActInfoBean act_info;
    public List<ActListBean> act_list;
    public List<MemberListBean> member_list;
    public List<GussLikeBean> guss_like;

    public static class ActSuccessTimeBean {
        public String h;
        public String i;
        public String s;
    }

    public static class ActInfoBean {
        public String act_id;
        public String act_type;
        public String act_name;
        public String act_sub_title;
        public String act_img;
        public String win_limit;
        public String act_start_time;
        public String act_end_time;
        public String goods_id;
        public String goods_price;
        public String goods_promotion_price;
        public String act_rule;
        public String act_goods_times;
        public String user_click_times;
        public String area;
        public String buy_limit;
        public String order_sort;
        public String is_top;
        public String add_time;
        public String del_time;
        public String limit_time;
        public String del_status;
        public String act_status;
        public String add_user;
        public String del_user;
        public String mobile_body;
        public Map<String, String> goods_spec;
        public String act_share_img;
        public String act_share_title;
        public String act_share_desc;
        public String act_share_url_spa;
        public String act_share_url;
    }

    public static class ActListBean {
        public String act_record_id;
        public String act_id;
        public String act_sn;
        public String avator;
        public String now_people;
        public String limit_people;
        public int leave_people;
        public String leave_time;
        public int leave_time_dist;
        public int has_join;
    }

    public static class MemberListBean {
        public String member_id;
        public String member_avatar;
        public int is_group_leader;
    }

    public static class GussLikeBean {
        public String act_id;
        public String act_name;
        public String goods_id;
        public String act_img;
        public String act_start_time;
        public String act_end_time;
        public String goods_price;
        public String goods_promotion_price;
    }
}
